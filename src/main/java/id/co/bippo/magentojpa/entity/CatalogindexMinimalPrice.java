package id.co.bippo.magentojpa.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the catalogindex_minimal_price database table.
 * 
 */
@Entity
@Table(name="catalogindex_minimal_price")
public class CatalogindexMinimalPrice implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="index_id")
	private int indexId;

	private BigDecimal qty;

	@Column(name="tax_class_id")
	private short taxClassId;

	private BigDecimal value;

	//bi-directional many-to-one association to CustomerGroup
    @ManyToOne
	@JoinColumn(name="customer_group_id")
	private CustomerGroup customerGroup;

	//bi-directional many-to-one association to CatalogProductEntity
    @ManyToOne
	@JoinColumn(name="entity_id")
	private CatalogProductEntity catalogProductEntity;

	//bi-directional many-to-one association to CoreWebsite
    @ManyToOne
	@JoinColumn(name="website_id")
	private CoreWebsite coreWebsite;

    public CatalogindexMinimalPrice() {
    }

	public int getIndexId() {
		return this.indexId;
	}

	public void setIndexId(int indexId) {
		this.indexId = indexId;
	}

	public BigDecimal getQty() {
		return this.qty;
	}

	public void setQty(BigDecimal qty) {
		this.qty = qty;
	}

	public short getTaxClassId() {
		return this.taxClassId;
	}

	public void setTaxClassId(short taxClassId) {
		this.taxClassId = taxClassId;
	}

	public BigDecimal getValue() {
		return this.value;
	}

	public void setValue(BigDecimal value) {
		this.value = value;
	}

	public CustomerGroup getCustomerGroup() {
		return this.customerGroup;
	}

	public void setCustomerGroup(CustomerGroup customerGroup) {
		this.customerGroup = customerGroup;
	}
	
	public CatalogProductEntity getCatalogProductEntity() {
		return this.catalogProductEntity;
	}

	public void setCatalogProductEntity(CatalogProductEntity catalogProductEntity) {
		this.catalogProductEntity = catalogProductEntity;
	}
	
	public CoreWebsite getCoreWebsite() {
		return this.coreWebsite;
	}

	public void setCoreWebsite(CoreWebsite coreWebsite) {
		this.coreWebsite = coreWebsite;
	}
	
}