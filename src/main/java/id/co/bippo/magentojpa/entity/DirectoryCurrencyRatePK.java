package id.co.bippo.magentojpa.entity;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the directory_currency_rate database table.
 * 
 */
@Embeddable
public class DirectoryCurrencyRatePK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="currency_from")
	private String currencyFrom;

	@Column(name="currency_to")
	private String currencyTo;

    public DirectoryCurrencyRatePK() {
    }
	public String getCurrencyFrom() {
		return this.currencyFrom;
	}
	public void setCurrencyFrom(String currencyFrom) {
		this.currencyFrom = currencyFrom;
	}
	public String getCurrencyTo() {
		return this.currencyTo;
	}
	public void setCurrencyTo(String currencyTo) {
		this.currencyTo = currencyTo;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof DirectoryCurrencyRatePK)) {
			return false;
		}
		DirectoryCurrencyRatePK castOther = (DirectoryCurrencyRatePK)other;
		return 
			this.currencyFrom.equals(castOther.currencyFrom)
			&& this.currencyTo.equals(castOther.currencyTo);

    }
    
	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.currencyFrom.hashCode();
		hash = hash * prime + this.currencyTo.hashCode();
		
		return hash;
    }
}