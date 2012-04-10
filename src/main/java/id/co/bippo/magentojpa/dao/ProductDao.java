package id.co.bippo.magentojpa.dao;

import id.co.bippo.magentojpa.entity.CatalogProductEntity;

import java.util.List;

import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

@Stateless
public class ProductDao {
	
	@PersistenceContext EntityManager em;
	
	@TransactionAttribute(TransactionAttributeType.NOT_SUPPORTED)
	public List<CatalogProductEntity> listProductsReadOnly() {
		TypedQuery<CatalogProductEntity> query = em.createQuery("SELECT p FROM CatalogProductEntity p", CatalogProductEntity.class);
		return query.getResultList();
	}

	@TransactionAttribute(TransactionAttributeType.NOT_SUPPORTED)
	public List<Object[]> listProductsUntyped() {
		Query query = em.createQuery("SELECT p FROM CatalogProductEntity p");
		return query.getResultList();
	}

}
