package id.co.bippo.magentojpa.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the catalog_category_entity_decimal database table.
 * 
 */
@Entity
@Table(name="catalog_category_entity_decimal")
public class CatalogCategoryEntityDecimal implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="value_id")
	private int valueId;

	@Column(name="entity_type_id")
	private int entityTypeId;

	private BigDecimal value;

	//bi-directional many-to-one association to CoreStore
    @ManyToOne
	@JoinColumn(name="store_id")
	private CoreStore coreStore;

	//bi-directional many-to-one association to EavAttribute
    @ManyToOne
	@JoinColumn(name="attribute_id")
	private EavAttribute eavAttribute;

	//bi-directional many-to-one association to CatalogCategoryEntity
    @ManyToOne
	@JoinColumn(name="entity_id")
	private CatalogCategoryEntity catalogCategoryEntity;

    public CatalogCategoryEntityDecimal() {
    }

	public int getValueId() {
		return this.valueId;
	}

	public void setValueId(int valueId) {
		this.valueId = valueId;
	}

	public int getEntityTypeId() {
		return this.entityTypeId;
	}

	public void setEntityTypeId(int entityTypeId) {
		this.entityTypeId = entityTypeId;
	}

	public BigDecimal getValue() {
		return this.value;
	}

	public void setValue(BigDecimal value) {
		this.value = value;
	}

	public CoreStore getCoreStore() {
		return this.coreStore;
	}

	public void setCoreStore(CoreStore coreStore) {
		this.coreStore = coreStore;
	}
	
	public EavAttribute getEavAttribute() {
		return this.eavAttribute;
	}

	public void setEavAttribute(EavAttribute eavAttribute) {
		this.eavAttribute = eavAttribute;
	}
	
	public CatalogCategoryEntity getCatalogCategoryEntity() {
		return this.catalogCategoryEntity;
	}

	public void setCatalogCategoryEntity(CatalogCategoryEntity catalogCategoryEntity) {
		this.catalogCategoryEntity = catalogCategoryEntity;
	}
	
}