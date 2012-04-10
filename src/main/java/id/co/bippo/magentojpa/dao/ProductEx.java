package id.co.bippo.magentojpa.dao;

import java.io.Serializable;

@SuppressWarnings("serial")
public class ProductEx implements Serializable {

	private int id;
	private String sku;
	private String name;
	
	public ProductEx(int id, String sku, String name) {
		super();
		this.id = id;
		this.sku = sku;
		this.name = name;
	}
	
	public int getId() {
		return id;
	}
	public String getSku() {
		return sku;
	}
	public String getName() {
		return name;
	}
	
	
}
