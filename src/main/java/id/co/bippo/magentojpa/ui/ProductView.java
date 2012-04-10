package id.co.bippo.magentojpa.ui;

import id.co.bippo.magentojpa.dao.ProductDao;
import id.co.bippo.magentojpa.entity.CatalogProductEntity;

import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

@Named @RequestScoped
public class ProductView {

	@Inject ProductDao productDao;
	List<CatalogProductEntity> products;
	
	public List<CatalogProductEntity> getProducts() {
		if (products == null)
			products = productDao.listProductsReadOnly();
		return products;
	}
	
	public List<Object[]> getProductsUntyped() {
		return productDao.listProductsUntyped();
	}
	
	public List<Object[]> getProductsEx() {
		return productDao.listProductsEx();
	}
	
}
