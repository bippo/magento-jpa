package id.co.bippo.magentojpa.dao;

import id.co.bippo.magentojpa.entity.CatalogProductEntity;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Stateless
public class ProductDao {
	
	private transient Logger log = LoggerFactory.getLogger(ProductDao.class);
//	@PersistenceUnit(unitName="forge-default") EntityManagerFactory emf;
	@PersistenceContext EntityManager em;
//	EntityManager em;
	
	@PostConstruct public void init() {
//		/**
//		 *       
//		 *       <property name="javax.persistence.jdbc.url" value="jdbc:mysql://localhost:3306/commercedemo"/>
//      <property name="javax.persistence.jdbc.user" value="root"/>
//      <property name="javax.persistence.jdbc.password" value="bippo"/>
//      <property name="javax.persistence.jdbc.driver" value="com.mysql.jdbc.Driver"/>
//
//		 */
//		ImmutableBiMap<String, String> props = ImmutableBiMap.of(
//				"javax.persistence.jdbc.url", "jdbc:mysql://localhost:3306/commercedemo",
//				"javax.persistence.jdbc.user", "root",
//				"javax.persistence.jdbc.password", "bippo",
//				"javax.persistence.jdbc.driver", "com.mysql.jdbc.Driver");
//		log.info("Creating EntityManager from {}", props);
//		em = emf.createEntityManager();
	}
	
	@PreDestroy public void destroy() {
//		em.close();
	}
	
	@TransactionAttribute(TransactionAttributeType.NOT_SUPPORTED)
	public List<CatalogProductEntity> listProductsReadOnly() {
		TypedQuery<CatalogProductEntity> query = em.createQuery("SELECT p FROM CatalogProductEntity p", CatalogProductEntity.class);
		return query.getResultList();
	}

	@TransactionAttribute(TransactionAttributeType.NOT_SUPPORTED)
	public List<Object[]> listProductsUntyped() {
		Query query = em.createQuery("SELECT p.entityId, p.sku FROM CatalogProductEntity p");
		return query.getResultList();
	}

}
