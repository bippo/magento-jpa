package id.co.bippo.magentojpa.entity;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the catalogsearch_result database table.
 * 
 */
@Embeddable
public class CatalogsearchResultPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="query_id")
	private int queryId;

	@Column(name="product_id")
	private int productId;

    public CatalogsearchResultPK() {
    }
	public int getQueryId() {
		return this.queryId;
	}
	public void setQueryId(int queryId) {
		this.queryId = queryId;
	}
	public int getProductId() {
		return this.productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof CatalogsearchResultPK)) {
			return false;
		}
		CatalogsearchResultPK castOther = (CatalogsearchResultPK)other;
		return 
			(this.queryId == castOther.queryId)
			&& (this.productId == castOther.productId);

    }
    
	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.queryId;
		hash = hash * prime + this.productId;
		
		return hash;
    }
}