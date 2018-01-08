package com.vs.ps.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.vs.ps.model.Product;

@Repository
@Transactional
public class ProductDAOImpl extends AbstractDAO implements ProductDAO {

	@Override
	public void persist(Product product) {
		entityManager.persist(product);

	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Product> getProductsByDescription(String searchText) {
		List<Product> prodList = null;
		if (null != searchText && !searchText.contentEquals("*")) {
			String textToSerach = null;
			if (searchText.contains("*") && searchText.indexOf("*") == 0
					&& searchText.lastIndexOf("*") != 0) {
				textToSerach = searchText.substring(
						searchText.indexOf("*") + 1,
						searchText.lastIndexOf("*"));
			} else if (null != searchText && searchText.contains("*")
					&& searchText.indexOf("*") == 0) {
				textToSerach = searchText
						.substring(searchText.indexOf("*") + 1);
			} else if (null != searchText && searchText.contains("*")
					&& searchText.indexOf("*") != 0) {
				textToSerach = searchText.substring(0, searchText.indexOf("*"));
			} else {
				textToSerach = searchText;
			}
			prodList = entityManager
					.createQuery(
							" from Product p WHERE p.description like :pattern")
					.setParameter("pattern", "%" + textToSerach.trim() + "%")
					.getResultList();
		} else {
			prodList = entityManager.createQuery(" from Product p")
					.getResultList();
		}
		return prodList;
	}

}
