package id.co.bippo.magentojpa.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Set;


/**
 * The persistent class for the catalog_product_bundle_selection database table.
 * 
 */
@Entity
@Table(name="catalog_product_bundle_selection")
public class CatalogProductBundleSelection implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="selection_id")
	private int selectionId;

	@Column(name="is_default")
	private int isDefault;

	@Column(name="parent_product_id")
	private int parentProductId;

	private int position;

	@Column(name="selection_can_change_qty")
	private short selectionCanChangeQty;

	@Column(name="selection_price_type")
	private int selectionPriceType;

	@Column(name="selection_price_value")
	private BigDecimal selectionPriceValue;

	@Column(name="selection_qty")
	private BigDecimal selectionQty;

	//bi-directional many-to-one association to CatalogProductBundleOption
    @ManyToOne
	@JoinColumn(name="option_id")
	private CatalogProductBundleOption catalogProductBundleOption;

	//bi-directional many-to-one association to CatalogProductEntity
    @ManyToOne
	@JoinColumn(name="product_id")
	private CatalogProductEntity catalogProductEntity;

	//bi-directional many-to-one association to CatalogProductBundleSelectionPrice
	@OneToMany(mappedBy="catalogProductBundleSelection")
	private Set<CatalogProductBundleSelectionPrice> catalogProductBundleSelectionPrices;

    public CatalogProductBundleSelection() {
    }

	public int getSelectionId() {
		return this.selectionId;
	}

	public void setSelectionId(int selectionId) {
		this.selectionId = selectionId;
	}

	public int getIsDefault() {
		return this.isDefault;
	}

	public void setIsDefault(int isDefault) {
		this.isDefault = isDefault;
	}

	public int getParentProductId() {
		return this.parentProductId;
	}

	public void setParentProductId(int parentProductId) {
		this.parentProductId = parentProductId;
	}

	public int getPosition() {
		return this.position;
	}

	public void setPosition(int position) {
		this.position = position;
	}

	public short getSelectionCanChangeQty() {
		return this.selectionCanChangeQty;
	}

	public void setSelectionCanChangeQty(short selectionCanChangeQty) {
		this.selectionCanChangeQty = selectionCanChangeQty;
	}

	public int getSelectionPriceType() {
		return this.selectionPriceType;
	}

	public void setSelectionPriceType(int selectionPriceType) {
		this.selectionPriceType = selectionPriceType;
	}

	public BigDecimal getSelectionPriceValue() {
		return this.selectionPriceValue;
	}

	public void setSelectionPriceValue(BigDecimal selectionPriceValue) {
		this.selectionPriceValue = selectionPriceValue;
	}

	public BigDecimal getSelectionQty() {
		return this.selectionQty;
	}

	public void setSelectionQty(BigDecimal selectionQty) {
		this.selectionQty = selectionQty;
	}

	public CatalogProductBundleOption getCatalogProductBundleOption() {
		return this.catalogProductBundleOption;
	}

	public void setCatalogProductBundleOption(CatalogProductBundleOption catalogProductBundleOption) {
		this.catalogProductBundleOption = catalogProductBundleOption;
	}
	
	public CatalogProductEntity getCatalogProductEntity() {
		return this.catalogProductEntity;
	}

	public void setCatalogProductEntity(CatalogProductEntity catalogProductEntity) {
		this.catalogProductEntity = catalogProductEntity;
	}
	
	public Set<CatalogProductBundleSelectionPrice> getCatalogProductBundleSelectionPrices() {
		return this.catalogProductBundleSelectionPrices;
	}

	public void setCatalogProductBundleSelectionPrices(Set<CatalogProductBundleSelectionPrice> catalogProductBundleSelectionPrices) {
		this.catalogProductBundleSelectionPrices = catalogProductBundleSelectionPrices;
	}
	
}