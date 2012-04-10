package id.co.bippo.magentojpa.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the directory_currency_rate database table.
 * 
 */
@Entity
@Table(name="directory_currency_rate")
public class DirectoryCurrencyRate implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private DirectoryCurrencyRatePK id;

	private BigDecimal rate;

    public DirectoryCurrencyRate() {
    }

	public DirectoryCurrencyRatePK getId() {
		return this.id;
	}

	public void setId(DirectoryCurrencyRatePK id) {
		this.id = id;
	}
	
	public BigDecimal getRate() {
		return this.rate;
	}

	public void setRate(BigDecimal rate) {
		this.rate = rate;
	}

}