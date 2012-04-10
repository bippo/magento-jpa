package id.co.bippo.magentojpa.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Set;


/**
 * The persistent class for the eav_attribute database table.
 * 
 */
@Entity
@Table(name="eav_attribute")
public class EavAttribute implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="attribute_id")
	private int attributeId;

	@Column(name="attribute_code")
	private String attributeCode;

	@Column(name="attribute_model")
	private String attributeModel;

	@Column(name="backend_model")
	private String backendModel;

	@Column(name="backend_table")
	private String backendTable;

	@Column(name="backend_type")
	private String backendType;

    @Lob()
	@Column(name="default_value")
	private String defaultValue;

	@Column(name="frontend_class")
	private String frontendClass;

	@Column(name="frontend_input")
	private String frontendInput;

	@Column(name="frontend_label")
	private String frontendLabel;

	@Column(name="frontend_model")
	private String frontendModel;

	@Column(name="is_required")
	private int isRequired;

	@Column(name="is_unique")
	private int isUnique;

	@Column(name="is_user_defined")
	private int isUserDefined;

	private String note;

	@Column(name="source_model")
	private String sourceModel;

	//bi-directional many-to-one association to CatalogCategoryEntityDatetime
	@OneToMany(mappedBy="eavAttribute")
	private Set<CatalogCategoryEntityDatetime> catalogCategoryEntityDatetimes;

	//bi-directional many-to-one association to CatalogCategoryEntityDecimal
	@OneToMany(mappedBy="eavAttribute")
	private Set<CatalogCategoryEntityDecimal> catalogCategoryEntityDecimals;

	//bi-directional many-to-one association to CatalogCategoryEntityInt
	@OneToMany(mappedBy="eavAttribute")
	private Set<CatalogCategoryEntityInt> catalogCategoryEntityInts;

	//bi-directional many-to-one association to CatalogCategoryEntityText
	@OneToMany(mappedBy="eavAttribute")
	private Set<CatalogCategoryEntityText> catalogCategoryEntityTexts;

	//bi-directional many-to-one association to CatalogCategoryEntityVarchar
	@OneToMany(mappedBy="eavAttribute")
	private Set<CatalogCategoryEntityVarchar> catalogCategoryEntityVarchars;

	//bi-directional one-to-one association to CatalogEavAttribute
	@OneToOne(mappedBy="eavAttribute")
	private CatalogEavAttribute catalogEavAttribute;

	//bi-directional many-to-one association to CatalogProductEntityDatetime
	@OneToMany(mappedBy="eavAttribute")
	private Set<CatalogProductEntityDatetime> catalogProductEntityDatetimes;

	//bi-directional many-to-one association to CatalogProductEntityDecimal
	@OneToMany(mappedBy="eavAttribute")
	private Set<CatalogProductEntityDecimal> catalogProductEntityDecimals;

	//bi-directional many-to-one association to CatalogProductEntityGallery
	@OneToMany(mappedBy="eavAttribute")
	private Set<CatalogProductEntityGallery> catalogProductEntityGalleries;

	//bi-directional many-to-one association to CatalogProductEntityInt
	@OneToMany(mappedBy="eavAttribute")
	private Set<CatalogProductEntityInt> catalogProductEntityInts;

	//bi-directional many-to-one association to CatalogProductEntityMediaGallery
	@OneToMany(mappedBy="eavAttribute")
	private Set<CatalogProductEntityMediaGallery> catalogProductEntityMediaGalleries;

	//bi-directional many-to-one association to CatalogProductEntityText
	@OneToMany(mappedBy="eavAttribute")
	private Set<CatalogProductEntityText> catalogProductEntityTexts;

	//bi-directional many-to-one association to CatalogProductEntityVarchar
	@OneToMany(mappedBy="eavAttribute")
	private Set<CatalogProductEntityVarchar> catalogProductEntityVarchars;

	//bi-directional many-to-one association to CustomerAddressEntityDatetime
	@OneToMany(mappedBy="eavAttribute")
	private Set<CustomerAddressEntityDatetime> customerAddressEntityDatetimes;

	//bi-directional many-to-one association to CustomerAddressEntityDecimal
	@OneToMany(mappedBy="eavAttribute")
	private Set<CustomerAddressEntityDecimal> customerAddressEntityDecimals;

	//bi-directional many-to-one association to CustomerAddressEntityInt
	@OneToMany(mappedBy="eavAttribute")
	private Set<CustomerAddressEntityInt> customerAddressEntityInts;

	//bi-directional many-to-one association to CustomerAddressEntityText
	@OneToMany(mappedBy="eavAttribute")
	private Set<CustomerAddressEntityText> customerAddressEntityTexts;

	//bi-directional many-to-one association to CustomerAddressEntityVarchar
	@OneToMany(mappedBy="eavAttribute")
	private Set<CustomerAddressEntityVarchar> customerAddressEntityVarchars;

	//bi-directional one-to-one association to CustomerEavAttribute
	@OneToOne(mappedBy="eavAttribute")
	private CustomerEavAttribute customerEavAttribute;

//	//bi-directional many-to-one association to CustomerEavAttributeWebsite
//	@OneToMany(mappedBy="eavAttribute")
//	private Set<CustomerEavAttributeWebsite> customerEavAttributeWebsites;

	//bi-directional many-to-one association to CustomerEntityDatetime
	@OneToMany(mappedBy="eavAttribute")
	private Set<CustomerEntityDatetime> customerEntityDatetimes;

	//bi-directional many-to-one association to CustomerEntityDecimal
	@OneToMany(mappedBy="eavAttribute")
	private Set<CustomerEntityDecimal> customerEntityDecimals;

	//bi-directional many-to-one association to CustomerEntityInt
	@OneToMany(mappedBy="eavAttribute")
	private Set<CustomerEntityInt> customerEntityInts;

	//bi-directional many-to-one association to CustomerEntityText
	@OneToMany(mappedBy="eavAttribute")
	private Set<CustomerEntityText> customerEntityTexts;

	//bi-directional many-to-one association to CustomerEntityVarchar
	@OneToMany(mappedBy="eavAttribute")
	private Set<CustomerEntityVarchar> customerEntityVarchars;

//	//bi-directional many-to-one association to CustomerFormAttribute
//	@OneToMany(mappedBy="eavAttribute")
//	private Set<CustomerFormAttribute> customerFormAttributes;

	//bi-directional many-to-one association to EavEntityType
    @ManyToOne
	@JoinColumn(name="entity_type_id")
	private EavEntityType eavEntityType;

	//bi-directional many-to-one association to EavAttributeLabel
	@OneToMany(mappedBy="eavAttribute")
	private Set<EavAttributeLabel> eavAttributeLabels;

	//bi-directional many-to-one association to EavAttributeOption
	@OneToMany(mappedBy="eavAttribute")
	private Set<EavAttributeOption> eavAttributeOptions;

	//bi-directional many-to-one association to EavEntityAttribute
	@OneToMany(mappedBy="eavAttribute")
	private Set<EavEntityAttribute> eavEntityAttributes;

	//bi-directional many-to-one association to EavFormElement
	@OneToMany(mappedBy="eavAttribute")
	private Set<EavFormElement> eavFormElements;

	//bi-directional many-to-one association to GooglebaseAttribute
	@OneToMany(mappedBy="eavAttribute")
	private Set<GooglebaseAttribute> googlebaseAttributes;

//	//bi-directional many-to-one association to SalesruleProductAttribute
//	@OneToMany(mappedBy="eavAttribute")
//	private Set<SalesruleProductAttribute> salesruleProductAttributes;

	//bi-directional many-to-one association to WeeeTax
	@OneToMany(mappedBy="eavAttribute")
	private Set<WeeeTax> weeeTaxs;

    public EavAttribute() {
    }

	public int getAttributeId() {
		return this.attributeId;
	}

	public void setAttributeId(int attributeId) {
		this.attributeId = attributeId;
	}

	public String getAttributeCode() {
		return this.attributeCode;
	}

	public void setAttributeCode(String attributeCode) {
		this.attributeCode = attributeCode;
	}

	public String getAttributeModel() {
		return this.attributeModel;
	}

	public void setAttributeModel(String attributeModel) {
		this.attributeModel = attributeModel;
	}

	public String getBackendModel() {
		return this.backendModel;
	}

	public void setBackendModel(String backendModel) {
		this.backendModel = backendModel;
	}

	public String getBackendTable() {
		return this.backendTable;
	}

	public void setBackendTable(String backendTable) {
		this.backendTable = backendTable;
	}

	public String getBackendType() {
		return this.backendType;
	}

	public void setBackendType(String backendType) {
		this.backendType = backendType;
	}

	public String getDefaultValue() {
		return this.defaultValue;
	}

	public void setDefaultValue(String defaultValue) {
		this.defaultValue = defaultValue;
	}

	public String getFrontendClass() {
		return this.frontendClass;
	}

	public void setFrontendClass(String frontendClass) {
		this.frontendClass = frontendClass;
	}

	public String getFrontendInput() {
		return this.frontendInput;
	}

	public void setFrontendInput(String frontendInput) {
		this.frontendInput = frontendInput;
	}

	public String getFrontendLabel() {
		return this.frontendLabel;
	}

	public void setFrontendLabel(String frontendLabel) {
		this.frontendLabel = frontendLabel;
	}

	public String getFrontendModel() {
		return this.frontendModel;
	}

	public void setFrontendModel(String frontendModel) {
		this.frontendModel = frontendModel;
	}

	public int getIsRequired() {
		return this.isRequired;
	}

	public void setIsRequired(int isRequired) {
		this.isRequired = isRequired;
	}

	public int getIsUnique() {
		return this.isUnique;
	}

	public void setIsUnique(int isUnique) {
		this.isUnique = isUnique;
	}

	public int getIsUserDefined() {
		return this.isUserDefined;
	}

	public void setIsUserDefined(int isUserDefined) {
		this.isUserDefined = isUserDefined;
	}

	public String getNote() {
		return this.note;
	}

	public void setNote(String note) {
		this.note = note;
	}

	public String getSourceModel() {
		return this.sourceModel;
	}

	public void setSourceModel(String sourceModel) {
		this.sourceModel = sourceModel;
	}

	public Set<CatalogCategoryEntityDatetime> getCatalogCategoryEntityDatetimes() {
		return this.catalogCategoryEntityDatetimes;
	}

	public void setCatalogCategoryEntityDatetimes(Set<CatalogCategoryEntityDatetime> catalogCategoryEntityDatetimes) {
		this.catalogCategoryEntityDatetimes = catalogCategoryEntityDatetimes;
	}
	
	public Set<CatalogCategoryEntityDecimal> getCatalogCategoryEntityDecimals() {
		return this.catalogCategoryEntityDecimals;
	}

	public void setCatalogCategoryEntityDecimals(Set<CatalogCategoryEntityDecimal> catalogCategoryEntityDecimals) {
		this.catalogCategoryEntityDecimals = catalogCategoryEntityDecimals;
	}
	
	public Set<CatalogCategoryEntityInt> getCatalogCategoryEntityInts() {
		return this.catalogCategoryEntityInts;
	}

	public void setCatalogCategoryEntityInts(Set<CatalogCategoryEntityInt> catalogCategoryEntityInts) {
		this.catalogCategoryEntityInts = catalogCategoryEntityInts;
	}
	
	public Set<CatalogCategoryEntityText> getCatalogCategoryEntityTexts() {
		return this.catalogCategoryEntityTexts;
	}

	public void setCatalogCategoryEntityTexts(Set<CatalogCategoryEntityText> catalogCategoryEntityTexts) {
		this.catalogCategoryEntityTexts = catalogCategoryEntityTexts;
	}
	
	public Set<CatalogCategoryEntityVarchar> getCatalogCategoryEntityVarchars() {
		return this.catalogCategoryEntityVarchars;
	}

	public void setCatalogCategoryEntityVarchars(Set<CatalogCategoryEntityVarchar> catalogCategoryEntityVarchars) {
		this.catalogCategoryEntityVarchars = catalogCategoryEntityVarchars;
	}
	
	public CatalogEavAttribute getCatalogEavAttribute() {
		return this.catalogEavAttribute;
	}

	public void setCatalogEavAttribute(CatalogEavAttribute catalogEavAttribute) {
		this.catalogEavAttribute = catalogEavAttribute;
	}
	
	public Set<CatalogProductEntityDatetime> getCatalogProductEntityDatetimes() {
		return this.catalogProductEntityDatetimes;
	}

	public void setCatalogProductEntityDatetimes(Set<CatalogProductEntityDatetime> catalogProductEntityDatetimes) {
		this.catalogProductEntityDatetimes = catalogProductEntityDatetimes;
	}
	
	public Set<CatalogProductEntityDecimal> getCatalogProductEntityDecimals() {
		return this.catalogProductEntityDecimals;
	}

	public void setCatalogProductEntityDecimals(Set<CatalogProductEntityDecimal> catalogProductEntityDecimals) {
		this.catalogProductEntityDecimals = catalogProductEntityDecimals;
	}
	
	public Set<CatalogProductEntityGallery> getCatalogProductEntityGalleries() {
		return this.catalogProductEntityGalleries;
	}

	public void setCatalogProductEntityGalleries(Set<CatalogProductEntityGallery> catalogProductEntityGalleries) {
		this.catalogProductEntityGalleries = catalogProductEntityGalleries;
	}
	
	public Set<CatalogProductEntityInt> getCatalogProductEntityInts() {
		return this.catalogProductEntityInts;
	}

	public void setCatalogProductEntityInts(Set<CatalogProductEntityInt> catalogProductEntityInts) {
		this.catalogProductEntityInts = catalogProductEntityInts;
	}
	
	public Set<CatalogProductEntityMediaGallery> getCatalogProductEntityMediaGalleries() {
		return this.catalogProductEntityMediaGalleries;
	}

	public void setCatalogProductEntityMediaGalleries(Set<CatalogProductEntityMediaGallery> catalogProductEntityMediaGalleries) {
		this.catalogProductEntityMediaGalleries = catalogProductEntityMediaGalleries;
	}
	
	public Set<CatalogProductEntityText> getCatalogProductEntityTexts() {
		return this.catalogProductEntityTexts;
	}

	public void setCatalogProductEntityTexts(Set<CatalogProductEntityText> catalogProductEntityTexts) {
		this.catalogProductEntityTexts = catalogProductEntityTexts;
	}
	
	public Set<CatalogProductEntityVarchar> getCatalogProductEntityVarchars() {
		return this.catalogProductEntityVarchars;
	}

	public void setCatalogProductEntityVarchars(Set<CatalogProductEntityVarchar> catalogProductEntityVarchars) {
		this.catalogProductEntityVarchars = catalogProductEntityVarchars;
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
	
	public CustomerEavAttribute getCustomerEavAttribute() {
		return this.customerEavAttribute;
	}

	public void setCustomerEavAttribute(CustomerEavAttribute customerEavAttribute) {
		this.customerEavAttribute = customerEavAttribute;
	}
	
//	public Set<CustomerEavAttributeWebsite> getCustomerEavAttributeWebsites() {
//		return this.customerEavAttributeWebsites;
//	}
//
//	public void setCustomerEavAttributeWebsites(Set<CustomerEavAttributeWebsite> customerEavAttributeWebsites) {
//		this.customerEavAttributeWebsites = customerEavAttributeWebsites;
//	}
	
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
	
//	public Set<CustomerFormAttribute> getCustomerFormAttributes() {
//		return this.customerFormAttributes;
//	}
//
//	public void setCustomerFormAttributes(Set<CustomerFormAttribute> customerFormAttributes) {
//		this.customerFormAttributes = customerFormAttributes;
//	}
	
	public EavEntityType getEavEntityType() {
		return this.eavEntityType;
	}

	public void setEavEntityType(EavEntityType eavEntityType) {
		this.eavEntityType = eavEntityType;
	}
	
	public Set<EavAttributeLabel> getEavAttributeLabels() {
		return this.eavAttributeLabels;
	}

	public void setEavAttributeLabels(Set<EavAttributeLabel> eavAttributeLabels) {
		this.eavAttributeLabels = eavAttributeLabels;
	}
	
	public Set<EavAttributeOption> getEavAttributeOptions() {
		return this.eavAttributeOptions;
	}

	public void setEavAttributeOptions(Set<EavAttributeOption> eavAttributeOptions) {
		this.eavAttributeOptions = eavAttributeOptions;
	}
	
	public Set<EavEntityAttribute> getEavEntityAttributes() {
		return this.eavEntityAttributes;
	}

	public void setEavEntityAttributes(Set<EavEntityAttribute> eavEntityAttributes) {
		this.eavEntityAttributes = eavEntityAttributes;
	}
	
	public Set<EavFormElement> getEavFormElements() {
		return this.eavFormElements;
	}

	public void setEavFormElements(Set<EavFormElement> eavFormElements) {
		this.eavFormElements = eavFormElements;
	}
	
	public Set<GooglebaseAttribute> getGooglebaseAttributes() {
		return this.googlebaseAttributes;
	}

	public void setGooglebaseAttributes(Set<GooglebaseAttribute> googlebaseAttributes) {
		this.googlebaseAttributes = googlebaseAttributes;
	}
	
//	public Set<SalesruleProductAttribute> getSalesruleProductAttributes() {
//		return this.salesruleProductAttributes;
//	}
//
//	public void setSalesruleProductAttributes(Set<SalesruleProductAttribute> salesruleProductAttributes) {
//		this.salesruleProductAttributes = salesruleProductAttributes;
//	}
	
	public Set<WeeeTax> getWeeeTaxs() {
		return this.weeeTaxs;
	}

	public void setWeeeTaxs(Set<WeeeTax> weeeTaxs) {
		this.weeeTaxs = weeeTaxs;
	}
	
}