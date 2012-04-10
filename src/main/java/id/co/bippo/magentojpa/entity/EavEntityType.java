package id.co.bippo.magentojpa.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Set;


/**
 * The persistent class for the eav_entity_type database table.
 * 
 */
@Entity
@Table(name="eav_entity_type")
public class EavEntityType implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="entity_type_id")
	private int entityTypeId;

	@Column(name="additional_attribute_table")
	private String additionalAttributeTable;

	@Column(name="attribute_model")
	private String attributeModel;

	@Column(name="data_sharing_key")
	private String dataSharingKey;

	@Column(name="default_attribute_set_id")
	private int defaultAttributeSetId;

	@Column(name="entity_attribute_collection")
	private String entityAttributeCollection;

	@Column(name="entity_id_field")
	private String entityIdField;

	@Column(name="entity_model")
	private String entityModel;

	@Column(name="entity_table")
	private String entityTable;

	@Column(name="entity_type_code")
	private String entityTypeCode;

	@Column(name="increment_model")
	private String incrementModel;

	@Column(name="increment_pad_char")
	private String incrementPadChar;

	@Column(name="increment_pad_length")
	private int incrementPadLength;

	@Column(name="increment_per_store")
	private int incrementPerStore;

	@Column(name="is_data_sharing")
	private int isDataSharing;

	@Column(name="value_table_prefix")
	private String valueTablePrefix;

	//bi-directional many-to-one association to CatalogProductEntity
	@OneToMany(mappedBy="eavEntityType")
	private Set<CatalogProductEntity> catalogProductEntities;

	//bi-directional many-to-one association to CustomerAddressEntityDatetime
	@OneToMany(mappedBy="eavEntityType")
	private Set<CustomerAddressEntityDatetime> customerAddressEntityDatetimes;

	//bi-directional many-to-one association to CustomerAddressEntityDecimal
	@OneToMany(mappedBy="eavEntityType")
	private Set<CustomerAddressEntityDecimal> customerAddressEntityDecimals;

	//bi-directional many-to-one association to CustomerAddressEntityInt
	@OneToMany(mappedBy="eavEntityType")
	private Set<CustomerAddressEntityInt> customerAddressEntityInts;

	//bi-directional many-to-one association to CustomerAddressEntityText
	@OneToMany(mappedBy="eavEntityType")
	private Set<CustomerAddressEntityText> customerAddressEntityTexts;

	//bi-directional many-to-one association to CustomerAddressEntityVarchar
	@OneToMany(mappedBy="eavEntityType")
	private Set<CustomerAddressEntityVarchar> customerAddressEntityVarchars;

	//bi-directional many-to-one association to CustomerEntityDatetime
	@OneToMany(mappedBy="eavEntityType")
	private Set<CustomerEntityDatetime> customerEntityDatetimes;

	//bi-directional many-to-one association to CustomerEntityDecimal
	@OneToMany(mappedBy="eavEntityType")
	private Set<CustomerEntityDecimal> customerEntityDecimals;

	//bi-directional many-to-one association to CustomerEntityInt
	@OneToMany(mappedBy="eavEntityType")
	private Set<CustomerEntityInt> customerEntityInts;

	//bi-directional many-to-one association to CustomerEntityText
	@OneToMany(mappedBy="eavEntityType")
	private Set<CustomerEntityText> customerEntityTexts;

	//bi-directional many-to-one association to CustomerEntityVarchar
	@OneToMany(mappedBy="eavEntityType")
	private Set<CustomerEntityVarchar> customerEntityVarchars;

	//bi-directional many-to-one association to EavAttribute
	@OneToMany(mappedBy="eavEntityType")
	private Set<EavAttribute> eavAttributes;

	//bi-directional many-to-one association to EavAttributeSet
	@OneToMany(mappedBy="eavEntityType")
	private Set<EavAttributeSet> eavAttributeSets;

	//bi-directional many-to-one association to EavEntity
	@OneToMany(mappedBy="eavEntityType")
	private Set<EavEntity> eavEntities;

	//bi-directional many-to-one association to EavEntityDatetime
	@OneToMany(mappedBy="eavEntityType")
	private Set<EavEntityDatetime> eavEntityDatetimes;

	//bi-directional many-to-one association to EavEntityDecimal
	@OneToMany(mappedBy="eavEntityType")
	private Set<EavEntityDecimal> eavEntityDecimals;

	//bi-directional many-to-one association to EavEntityInt
	@OneToMany(mappedBy="eavEntityType")
	private Set<EavEntityInt> eavEntityInts;

	//bi-directional many-to-one association to EavEntityStore
	@OneToMany(mappedBy="eavEntityType")
	private Set<EavEntityStore> eavEntityStores;

	//bi-directional many-to-one association to EavEntityText
	@OneToMany(mappedBy="eavEntityType")
	private Set<EavEntityText> eavEntityTexts;

	//bi-directional many-to-one association to EavEntityVarchar
	@OneToMany(mappedBy="eavEntityType")
	private Set<EavEntityVarchar> eavEntityVarchars;

	//bi-directional many-to-many association to EavFormType
    @ManyToMany
	@JoinTable(
		name="eav_form_type_entity"
		, joinColumns={
			@JoinColumn(name="entity_type_id")
			}
		, inverseJoinColumns={
			@JoinColumn(name="type_id")
			}
		)
	private Set<EavFormType> eavFormTypes;

    public EavEntityType() {
    }

	public int getEntityTypeId() {
		return this.entityTypeId;
	}

	public void setEntityTypeId(int entityTypeId) {
		this.entityTypeId = entityTypeId;
	}

	public String getAdditionalAttributeTable() {
		return this.additionalAttributeTable;
	}

	public void setAdditionalAttributeTable(String additionalAttributeTable) {
		this.additionalAttributeTable = additionalAttributeTable;
	}

	public String getAttributeModel() {
		return this.attributeModel;
	}

	public void setAttributeModel(String attributeModel) {
		this.attributeModel = attributeModel;
	}

	public String getDataSharingKey() {
		return this.dataSharingKey;
	}

	public void setDataSharingKey(String dataSharingKey) {
		this.dataSharingKey = dataSharingKey;
	}

	public int getDefaultAttributeSetId() {
		return this.defaultAttributeSetId;
	}

	public void setDefaultAttributeSetId(int defaultAttributeSetId) {
		this.defaultAttributeSetId = defaultAttributeSetId;
	}

	public String getEntityAttributeCollection() {
		return this.entityAttributeCollection;
	}

	public void setEntityAttributeCollection(String entityAttributeCollection) {
		this.entityAttributeCollection = entityAttributeCollection;
	}

	public String getEntityIdField() {
		return this.entityIdField;
	}

	public void setEntityIdField(String entityIdField) {
		this.entityIdField = entityIdField;
	}

	public String getEntityModel() {
		return this.entityModel;
	}

	public void setEntityModel(String entityModel) {
		this.entityModel = entityModel;
	}

	public String getEntityTable() {
		return this.entityTable;
	}

	public void setEntityTable(String entityTable) {
		this.entityTable = entityTable;
	}

	public String getEntityTypeCode() {
		return this.entityTypeCode;
	}

	public void setEntityTypeCode(String entityTypeCode) {
		this.entityTypeCode = entityTypeCode;
	}

	public String getIncrementModel() {
		return this.incrementModel;
	}

	public void setIncrementModel(String incrementModel) {
		this.incrementModel = incrementModel;
	}

	public String getIncrementPadChar() {
		return this.incrementPadChar;
	}

	public void setIncrementPadChar(String incrementPadChar) {
		this.incrementPadChar = incrementPadChar;
	}

	public int getIncrementPadLength() {
		return this.incrementPadLength;
	}

	public void setIncrementPadLength(int incrementPadLength) {
		this.incrementPadLength = incrementPadLength;
	}

	public int getIncrementPerStore() {
		return this.incrementPerStore;
	}

	public void setIncrementPerStore(int incrementPerStore) {
		this.incrementPerStore = incrementPerStore;
	}

	public int getIsDataSharing() {
		return this.isDataSharing;
	}

	public void setIsDataSharing(int isDataSharing) {
		this.isDataSharing = isDataSharing;
	}

	public String getValueTablePrefix() {
		return this.valueTablePrefix;
	}

	public void setValueTablePrefix(String valueTablePrefix) {
		this.valueTablePrefix = valueTablePrefix;
	}

	public Set<CatalogProductEntity> getCatalogProductEntities() {
		return this.catalogProductEntities;
	}

	public void setCatalogProductEntities(Set<CatalogProductEntity> catalogProductEntities) {
		this.catalogProductEntities = catalogProductEntities;
	}
	
	public Set<CustomerAddressEntityDatetime> getCustomerAddressEntityDatetimes() {
		return this.customerAddressEntityDatetimes;
	}

	public void setCustomerAddressEntityDatetimes(Set<CustomerAddressEntityDatetime> customerAddressEntityDatetimes) {
		this.customerAddressEntityDatetimes = customerAddressEntityDatetimes;
	}
	
	public Set<CustomerAddressEntityDecimal> getCustomerAddressEntityDecimals() {
		return this.customerAddressEntityDecimals;
	}

	public void setCustomerAddressEntityDecimals(Set<CustomerAddressEntityDecimal> customerAddressEntityDecimals) {
		this.customerAddressEntityDecimals = customerAddressEntityDecimals;
	}
	
	public Set<CustomerAddressEntityInt> getCustomerAddressEntityInts() {
		return this.customerAddressEntityInts;
	}

	public void setCustomerAddressEntityInts(Set<CustomerAddressEntityInt> customerAddressEntityInts) {
		this.customerAddressEntityInts = customerAddressEntityInts;
	}
	
	public Set<CustomerAddressEntityText> getCustomerAddressEntityTexts() {
		return this.customerAddressEntityTexts;
	}

	public void setCustomerAddressEntityTexts(Set<CustomerAddressEntityText> customerAddressEntityTexts) {
		this.customerAddressEntityTexts = customerAddressEntityTexts;
	}
	
	public Set<CustomerAddressEntityVarchar> getCustomerAddressEntityVarchars() {
		return this.customerAddressEntityVarchars;
	}

	public void setCustomerAddressEntityVarchars(Set<CustomerAddressEntityVarchar> customerAddressEntityVarchars) {
		this.customerAddressEntityVarchars = customerAddressEntityVarchars;
	}
	
	public Set<CustomerEntityDatetime> getCustomerEntityDatetimes() {
		return this.customerEntityDatetimes;
	}

	public void setCustomerEntityDatetimes(Set<CustomerEntityDatetime> customerEntityDatetimes) {
		this.customerEntityDatetimes = customerEntityDatetimes;
	}
	
	public Set<CustomerEntityDecimal> getCustomerEntityDecimals() {
		return this.customerEntityDecimals;
	}

	public void setCustomerEntityDecimals(Set<CustomerEntityDecimal> customerEntityDecimals) {
		this.customerEntityDecimals = customerEntityDecimals;
	}
	
	public Set<CustomerEntityInt> getCustomerEntityInts() {
		return this.customerEntityInts;
	}

	public void setCustomerEntityInts(Set<CustomerEntityInt> customerEntityInts) {
		this.customerEntityInts = customerEntityInts;
	}
	
	public Set<CustomerEntityText> getCustomerEntityTexts() {
		return this.customerEntityTexts;
	}

	public void setCustomerEntityTexts(Set<CustomerEntityText> customerEntityTexts) {
		this.customerEntityTexts = customerEntityTexts;
	}
	
	public Set<CustomerEntityVarchar> getCustomerEntityVarchars() {
		return this.customerEntityVarchars;
	}

	public void setCustomerEntityVarchars(Set<CustomerEntityVarchar> customerEntityVarchars) {
		this.customerEntityVarchars = customerEntityVarchars;
	}
	
	public Set<EavAttribute> getEavAttributes() {
		return this.eavAttributes;
	}

	public void setEavAttributes(Set<EavAttribute> eavAttributes) {
		this.eavAttributes = eavAttributes;
	}
	
	public Set<EavAttributeSet> getEavAttributeSets() {
		return this.eavAttributeSets;
	}

	public void setEavAttributeSets(Set<EavAttributeSet> eavAttributeSets) {
		this.eavAttributeSets = eavAttributeSets;
	}
	
	public Set<EavEntity> getEavEntities() {
		return this.eavEntities;
	}

	public void setEavEntities(Set<EavEntity> eavEntities) {
		this.eavEntities = eavEntities;
	}
	
	public Set<EavEntityDatetime> getEavEntityDatetimes() {
		return this.eavEntityDatetimes;
	}

	public void setEavEntityDatetimes(Set<EavEntityDatetime> eavEntityDatetimes) {
		this.eavEntityDatetimes = eavEntityDatetimes;
	}
	
	public Set<EavEntityDecimal> getEavEntityDecimals() {
		return this.eavEntityDecimals;
	}

	public void setEavEntityDecimals(Set<EavEntityDecimal> eavEntityDecimals) {
		this.eavEntityDecimals = eavEntityDecimals;
	}
	
	public Set<EavEntityInt> getEavEntityInts() {
		return this.eavEntityInts;
	}

	public void setEavEntityInts(Set<EavEntityInt> eavEntityInts) {
		this.eavEntityInts = eavEntityInts;
	}
	
	public Set<EavEntityStore> getEavEntityStores() {
		return this.eavEntityStores;
	}

	public void setEavEntityStores(Set<EavEntityStore> eavEntityStores) {
		this.eavEntityStores = eavEntityStores;
	}
	
	public Set<EavEntityText> getEavEntityTexts() {
		return this.eavEntityTexts;
	}

	public void setEavEntityTexts(Set<EavEntityText> eavEntityTexts) {
		this.eavEntityTexts = eavEntityTexts;
	}
	
	public Set<EavEntityVarchar> getEavEntityVarchars() {
		return this.eavEntityVarchars;
	}

	public void setEavEntityVarchars(Set<EavEntityVarchar> eavEntityVarchars) {
		this.eavEntityVarchars = eavEntityVarchars;
	}
	
	public Set<EavFormType> getEavFormTypes() {
		return this.eavFormTypes;
	}

	public void setEavFormTypes(Set<EavFormType> eavFormTypes) {
		this.eavFormTypes = eavFormTypes;
	}
	
}