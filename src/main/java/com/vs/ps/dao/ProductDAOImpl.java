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

		return entityManager
				.createQuery(
						" from Product p WHERE p.description like :pattern")
				.setParameter("pattern", "%" + searchText.trim() + "%")
				.getResultList();

	}

}
