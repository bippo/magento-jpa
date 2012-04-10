package id.co.bippo.magentojpa.entity;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the sales_order_status_label database table.
 * 
 */
@Embeddable
public class SalesOrderStatusLabelPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	private String status;

	@Column(name="store_id")
	private int storeId;

    public SalesOrderStatusLabelPK() {
    }
	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public int getStoreId() {
		return this.storeId;
	}
	public void setStoreId(int storeId) {
		this.storeId = storeId;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof SalesOrderStatusLabelPK)) {
			return false;
		}
		SalesOrderStatusLabelPK castOther = (SalesOrderStatusLabelPK)other;
		return 
			this.status.equals(castOther.status)
			&& (this.storeId == castOther.storeId);

    }
    
	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.status.hashCode();
		hash = hash * prime + this.storeId;
		
		return hash;
    }
}