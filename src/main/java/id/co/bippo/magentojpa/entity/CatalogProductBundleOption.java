package id.co.bippo.magentojpa.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Set;


/**
 * The persistent class for the catalog_product_bundle_option database table.
 * 
 */
@Entity
@Table(name="catalog_product_bundle_option")
public class CatalogProductBundleOption implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="option_id")
	private int optionId;

	private int position;

	private int required;

	private String type;

	//bi-directional many-to-one association to CatalogProductEntity
    @ManyToOne
	@JoinColumn(name="parent_id")
	private CatalogProductEntity catalogProductEntity;

	//bi-directional many-to-one association to CatalogProductBundleOptionValue
	@OneToMany(mappedBy="catalogProductBundleOption")
	private Set<CatalogProductBundleOptionValue> catalogProductBundleOptionValues;

	//bi-directional many-to-one association to CatalogProductBundleSelection
	@OneToMany(mappedBy="catalogProductBundleOption")
	private Set<CatalogProductBundleSelection> catalogProductBundleSelections;

    public CatalogProductBundleOption() {
    }

	public int getOptionId() {
		return this.optionId;
	}

	public void setOptionId(int optionId) {
		this.optionId = optionId;
	}

	public int getPosition() {
		return this.position;
	}

	public void setPosition(int position) {
		this.position = position;
	}

	public int getRequired() {
		return this.required;
	}

	public void setRequired(int required) {
		this.required = required;
	}

	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public CatalogProductEntity getCatalogProductEntity() {
		return this.catalogProductEntity;
	}

	public void setCatalogProductEntity(CatalogProductEntity catalogProductEntity) {
		this.catalogProductEntity = catalogProductEntity;
	}
	
	public Set<CatalogProductBundleOptionValue> getCatalogProductBundleOptionValues() {
		return this.catalogProductBundleOptionValues;
	}

	public void setCatalogProductBundleOptionValues(Set<CatalogProductBundleOptionValue> catalogProductBundleOptionValues) {
		this.catalogProductBundleOptionValues = catalogProductBundleOptionValues;
	}
	
	public Set<CatalogProductBundleSelection> getCatalogProductBundleSelections() {
		return this.catalogProductBundleSelections;
	}

	public void setCatalogProductBundleSelections(Set<CatalogProductBundleSelection> catalogProductBundleSelections) {
		this.catalogProductBundleSelections = catalogProductBundleSelections;
	}
	
}