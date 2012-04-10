package id.co.bippo.magentojpa.entity;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the catalog_product_super_attribute_label database table.
 * 
 */
@Entity
@Table(name="catalog_product_super_attribute_label")
public class CatalogProductSuperAttributeLabel implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="value_id")
	private int valueId;

	@Column(name="use_default")
	private int useDefault;

	private String value;

	//bi-directional many-to-one association to CatalogProductSuperAttribute
    @ManyToOne
	@JoinColumn(name="product_super_attribute_id")
	private CatalogProductSuperAttribute catalogProductSuperAttribute;

	//bi-directional many-to-one association to CoreStore
    @ManyToOne
	@JoinColumn(name="store_id")
	private CoreStore coreStore;

    public CatalogProductSuperAttributeLabel() {
    }

	public int getValueId() {
		return this.valueId;
	}

	public void setValueId(int valueId) {
		this.valueId = valueId;
	}

	public int getUseDefault() {
		return this.useDefault;
	}

	public void setUseDefault(int useDefault) {
		this.useDefault = useDefault;
	}

	public String getValue() {
		return this.value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public CatalogProductSuperAttribute getCatalogProductSuperAttribute() {
		return this.catalogProductSuperAttribute;
	}

	public void setCatalogProductSuperAttribute(CatalogProductSuperAttribute catalogProductSuperAttribute) {
		this.catalogProductSuperAttribute = catalogProductSuperAttribute;
	}
	
	public CoreStore getCoreStore() {
		return this.coreStore;
	}

	public void setCoreStore(CoreStore coreStore) {
		this.coreStore = coreStore;
	}
	
}