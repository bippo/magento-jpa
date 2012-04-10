package id.co.bippo.magentojpa.entity;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the sales_order_status_state database table.
 * 
 */
@Embeddable
public class SalesOrderStatusStatePK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	private String status;

	private String state;

    public SalesOrderStatusStatePK() {
    }
	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getState() {
		return this.state;
	}
	public void setState(String state) {
		this.state = state;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof SalesOrderStatusStatePK)) {
			return false;
		}
		SalesOrderStatusStatePK castOther = (SalesOrderStatusStatePK)other;
		return 
			this.status.equals(castOther.status)
			&& this.state.equals(castOther.state);

    }
    
	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.status.hashCode();
		hash = hash * prime + this.state.hashCode();
		
		return hash;
    }
}