package com.vs.ps.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.vs.ps.model.ProductCategory;

@Repository
@Transactional
public class ProductCategoryDAOImpl extends AbstractDAO implements
		ProductCategoryDAO {

	@Override
	public void create(ProductCategory category) {
		entityManager.persist(category);

	}

	@SuppressWarnings("unchecked")
	@Override
	public List<ProductCategory> getAll() {

		return entityManager.createQuery(" from ProductCategory")
				.getResultList();
	}

}
