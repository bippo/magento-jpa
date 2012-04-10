package id.co.bippo.magentojpa.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the shipping_tablerate database table.
 * 
 */
@Entity
@Table(name="shipping_tablerate")
public class ShippingTablerate implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int pk;

	@Column(name="condition_name")
	private String conditionName;

	@Column(name="condition_value")
	private BigDecimal conditionValue;

	private BigDecimal cost;

	@Column(name="dest_country_id")
	private String destCountryId;

	@Column(name="dest_region_id")
	private int destRegionId;

	@Column(name="dest_zip")
	private String destZip;

	private BigDecimal price;

	@Column(name="website_id")
	private int websiteId;

    public ShippingTablerate() {
    }

	public int getPk() {
		return this.pk;
	}

	public void setPk(int pk) {
		this.pk = pk;
	}

	public String getConditionName() {
		return this.conditionName;
	}

	public void setConditionName(String conditionName) {
		this.conditionName = conditionName;
	}

	public BigDecimal getConditionValue() {
		return this.conditionValue;
	}

	public void setConditionValue(BigDecimal conditionValue) {
		this.conditionValue = conditionValue;
	}

	public BigDecimal getCost() {
		return this.cost;
	}

	public void setCost(BigDecimal cost) {
		this.cost = cost;
	}

	public String getDestCountryId() {
		return this.destCountryId;
	}

	public void setDestCountryId(String destCountryId) {
		this.destCountryId = destCountryId;
	}

	public int getDestRegionId() {
		return this.destRegionId;
	}

	public void setDestRegionId(int destRegionId) {
		this.destRegionId = destRegionId;
	}

	public String getDestZip() {
		return this.destZip;
	}

	public void setDestZip(String destZip) {
		this.destZip = destZip;
	}

	public BigDecimal getPrice() {
		return this.price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}

	public int getWebsiteId() {
		return this.websiteId;
	}

	public void setWebsiteId(int websiteId) {
		this.websiteId = websiteId;
	}

}