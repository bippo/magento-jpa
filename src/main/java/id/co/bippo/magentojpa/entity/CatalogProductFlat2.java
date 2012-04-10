package id.co.bippo.magentojpa.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;
import java.math.BigDecimal;
import java.util.Date;


/**
 * The persistent class for the catalog_product_flat_2 database table.
 * 
 */
@Entity
@Table(name="catalog_product_flat_2")
public class CatalogProductFlat2 implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="entity_id")
	private int entityId;

	@Column(name="attribute_set_id")
	private int attributeSetId;

	@Column(name="children_clothing_color")
	private int childrenClothingColor;

	@Column(name="children_clothing_color_value")
	private String childrenClothingColorValue;

	@Column(name="children_clothing_size")
	private int childrenClothingSize;

	@Column(name="children_clothing_size_value")
	private String childrenClothingSizeValue;

	private BigDecimal cost;

	@Column(name="created_at")
	private Timestamp createdAt;

	@Column(name="enable_googlecheckout")
	private short enableGooglecheckout;

	@Column(name="gift_message_available")
	private short giftMessageAvailable;

	@Column(name="has_options")
	private short hasOptions;

	@Column(name="image_label")
	private String imageLabel;

	@Column(name="is_imported")
	private short isImported;

	@Column(name="is_recurring")
	private short isRecurring;

	@Column(name="links_exist")
	private int linksExist;

	@Column(name="links_purchased_separately")
	private int linksPurchasedSeparately;

	@Column(name="links_title")
	private String linksTitle;

	@Column(name="men_clothing_color")
	private int menClothingColor;

	@Column(name="men_clothing_color_value")
	private String menClothingColorValue;

	@Column(name="men_clothing_size")
	private int menClothingSize;

	@Column(name="men_clothing_size_value")
	private String menClothingSizeValue;

	private BigDecimal msrp;

	@Column(name="msrp_display_actual_price_type")
	private String msrpDisplayActualPriceType;

	@Column(name="msrp_enabled")
	private short msrpEnabled;

	private String name;

    @Temporal( TemporalType.TIMESTAMP)
	@Column(name="news_from_date")
	private Date newsFromDate;

    @Temporal( TemporalType.TIMESTAMP)
	@Column(name="news_to_date")
	private Date newsToDate;

	private BigDecimal price;

	@Column(name="price_type")
	private int priceType;

	@Column(name="price_view")
	private int priceView;

    @Lob()
	@Column(name="recurring_profile")
	private String recurringProfile;

	@Column(name="required_options")
	private int requiredOptions;

	@Column(name="shipment_type")
	private int shipmentType;

    @Lob()
	@Column(name="short_description")
	private String shortDescription;

	private String sku;

	@Column(name="sku_type")
	private int skuType;

	@Column(name="small_image")
	private String smallImage;

	@Column(name="small_image_label")
	private String smallImageLabel;

    @Temporal( TemporalType.TIMESTAMP)
	@Column(name="special_from_date")
	private Date specialFromDate;

	@Column(name="special_price")
	private BigDecimal specialPrice;

    @Temporal( TemporalType.TIMESTAMP)
	@Column(name="special_to_date")
	private Date specialToDate;

	@Column(name="super_color")
	private int superColor;

	@Column(name="super_color_value")
	private String superColorValue;

	@Column(name="tax_class_id")
	private int taxClassId;

	private String thumbnail;

	@Column(name="thumbnail_label")
	private String thumbnailLabel;

	@Column(name="type_id")
	private String typeId;

	@Column(name="updated_at")
	private Timestamp updatedAt;

	@Column(name="url_key")
	private String urlKey;

	@Column(name="url_path")
	private String urlPath;

	private int visibility;

	private BigDecimal weight;

	@Column(name="weight_type")
	private int weightType;

	@Column(name="women_clothing_color")
	private int womenClothingColor;

	@Column(name="women_clothing_color_value")
	private String womenClothingColorValue;

	@Column(name="women_clothing_size")
	private int womenClothingSize;

	@Column(name="women_clothing_size_value")
	private String womenClothingSizeValue;

	//bi-directional one-to-one association to CatalogProductEntity
	@OneToOne
	@JoinColumn(name="entity_id")
	private CatalogProductEntity catalogProductEntity;

    public CatalogProductFlat2() {
    }

	public int getEntityId() {
		return this.entityId;
	}

	public void setEntityId(int entityId) {
		this.entityId = entityId;
	}

	public int getAttributeSetId() {
		return this.attributeSetId;
	}

	public void setAttributeSetId(int attributeSetId) {
		this.attributeSetId = attributeSetId;
	}

	public int getChildrenClothingColor() {
		return this.childrenClothingColor;
	}

	public void setChildrenClothingColor(int childrenClothingColor) {
		this.childrenClothingColor = childrenClothingColor;
	}

	public String getChildrenClothingColorValue() {
		return this.childrenClothingColorValue;
	}

	public void setChildrenClothingColorValue(String childrenClothingColorValue) {
		this.childrenClothingColorValue = childrenClothingColorValue;
	}

	public int getChildrenClothingSize() {
		return this.childrenClothingSize;
	}

	public void setChildrenClothingSize(int childrenClothingSize) {
		this.childrenClothingSize = childrenClothingSize;
	}

	public String getChildrenClothingSizeValue() {
		return this.childrenClothingSizeValue;
	}

	public void setChildrenClothingSizeValue(String childrenClothingSizeValue) {
		this.childrenClothingSizeValue = childrenClothingSizeValue;
	}

	public BigDecimal getCost() {
		return this.cost;
	}

	public void setCost(BigDecimal cost) {
		this.cost = cost;
	}

	public Timestamp getCreatedAt() {
		return this.createdAt;
	}

	public void setCreatedAt(Timestamp createdAt) {
		this.createdAt = createdAt;
	}

	public short getEnableGooglecheckout() {
		return this.enableGooglecheckout;
	}

	public void setEnableGooglecheckout(short enableGooglecheckout) {
		this.enableGooglecheckout = enableGooglecheckout;
	}

	public short getGiftMessageAvailable() {
		return this.giftMessageAvailable;
	}

	public void setGiftMessageAvailable(short giftMessageAvailable) {
		this.giftMessageAvailable = giftMessageAvailable;
	}

	public short getHasOptions() {
		return this.hasOptions;
	}

	public void setHasOptions(short hasOptions) {
		this.hasOptions = hasOptions;
	}

	public String getImageLabel() {
		return this.imageLabel;
	}

	public void setImageLabel(String imageLabel) {
		this.imageLabel = imageLabel;
	}

	public short getIsImported() {
		return this.isImported;
	}

	public void setIsImported(short isImported) {
		this.isImported = isImported;
	}

	public short getIsRecurring() {
		return this.isRecurring;
	}

	public void setIsRecurring(short isRecurring) {
		this.isRecurring = isRecurring;
	}

	public int getLinksExist() {
		return this.linksExist;
	}

	public void setLinksExist(int linksExist) {
		this.linksExist = linksExist;
	}

	public int getLinksPurchasedSeparately() {
		return this.linksPurchasedSeparately;
	}

	public void setLinksPurchasedSeparately(int linksPurchasedSeparately) {
		this.linksPurchasedSeparately = linksPurchasedSeparately;
	}

	public String getLinksTitle() {
		return this.linksTitle;
	}

	public void setLinksTitle(String linksTitle) {
		this.linksTitle = linksTitle;
	}

	public int getMenClothingColor() {
		return this.menClothingColor;
	}

	public void setMenClothingColor(int menClothingColor) {
		this.menClothingColor = menClothingColor;
	}

	public String getMenClothingColorValue() {
		return this.menClothingColorValue;
	}

	public void setMenClothingColorValue(String menClothingColorValue) {
		this.menClothingColorValue = menClothingColorValue;
	}

	public int getMenClothingSize() {
		return this.menClothingSize;
	}

	public void setMenClothingSize(int menClothingSize) {
		this.menClothingSize = menClothingSize;
	}

	public String getMenClothingSizeValue() {
		return this.menClothingSizeValue;
	}

	public void setMenClothingSizeValue(String menClothingSizeValue) {
		this.menClothingSizeValue = menClothingSizeValue;
	}

	public BigDecimal getMsrp() {
		return this.msrp;
	}

	public void setMsrp(BigDecimal msrp) {
		this.msrp = msrp;
	}

	public String getMsrpDisplayActualPriceType() {
		return this.msrpDisplayActualPriceType;
	}

	public void setMsrpDisplayActualPriceType(String msrpDisplayActualPriceType) {
		this.msrpDisplayActualPriceType = msrpDisplayActualPriceType;
	}

	public short getMsrpEnabled() {
		return this.msrpEnabled;
	}

	public void setMsrpEnabled(short msrpEnabled) {
		this.msrpEnabled = msrpEnabled;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getNewsFromDate() {
		return this.newsFromDate;
	}

	public void setNewsFromDate(Date newsFromDate) {
		this.newsFromDate = newsFromDate;
	}

	public Date getNewsToDate() {
		return this.newsToDate;
	}

	public void setNewsToDate(Date newsToDate) {
		this.newsToDate = newsToDate;
	}

	public BigDecimal getPrice() {
		return this.price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}

	public int getPriceType() {
		return this.priceType;
	}

	public void setPriceType(int priceType) {
		this.priceType = priceType;
	}

	public int getPriceView() {
		return this.priceView;
	}

	public void setPriceView(int priceView) {
		this.priceView = priceView;
	}

	public String getRecurringProfile() {
		return this.recurringProfile;
	}

	public void setRecurringProfile(String recurringProfile) {
		this.recurringProfile = recurringProfile;
	}

	public int getRequiredOptions() {
		return this.requiredOptions;
	}

	public void setRequiredOptions(int requiredOptions) {
		this.requiredOptions = requiredOptions;
	}

	public int getShipmentType() {
		return this.shipmentType;
	}

	public void setShipmentType(int shipmentType) {
		this.shipmentType = shipmentType;
	}

	public String getShortDescription() {
		return this.shortDescription;
	}

	public void setShortDescription(String shortDescription) {
		this.shortDescription = shortDescription;
	}

	public String getSku() {
		return this.sku;
	}

	public void setSku(String sku) {
		this.sku = sku;
	}

	public int getSkuType() {
		return this.skuType;
	}

	public void setSkuType(int skuType) {
		this.skuType = skuType;
	}

	public String getSmallImage() {
		return this.smallImage;
	}

	public void setSmallImage(String smallImage) {
		this.smallImage = smallImage;
	}

	public String getSmallImageLabel() {
		return this.smallImageLabel;
	}

	public void setSmallImageLabel(String smallImageLabel) {
		this.smallImageLabel = smallImageLabel;
	}

	public Date getSpecialFromDate() {
		return this.specialFromDate;
	}

	public void setSpecialFromDate(Date specialFromDate) {
		this.specialFromDate = specialFromDate;
	}

	public BigDecimal getSpecialPrice() {
		return this.specialPrice;
	}

	public void setSpecialPrice(BigDecimal specialPrice) {
		this.specialPrice = specialPrice;
	}

	public Date getSpecialToDate() {
		return this.specialToDate;
	}

	public void setSpecialToDate(Date specialToDate) {
		this.specialToDate = specialToDate;
	}

	public int getSuperColor() {
		return this.superColor;
	}

	public void setSuperColor(int superColor) {
		this.superColor = superColor;
	}

	public String getSuperColorValue() {
		return this.superColorValue;
	}

	public void setSuperColorValue(String superColorValue) {
		this.superColorValue = superColorValue;
	}

	public int getTaxClassId() {
		return this.taxClassId;
	}

	public void setTaxClassId(int taxClassId) {
		this.taxClassId = taxClassId;
	}

	public String getThumbnail() {
		return this.thumbnail;
	}

	public void setThumbnail(String thumbnail) {
		this.thumbnail = thumbnail;
	}

	public String getThumbnailLabel() {
		return this.thumbnailLabel;
	}

	public void setThumbnailLabel(String thumbnailLabel) {
		this.thumbnailLabel = thumbnailLabel;
	}

	public String getTypeId() {
		return this.typeId;
	}

	public void setTypeId(String typeId) {
		this.typeId = typeId;
	}

	public Timestamp getUpdatedAt() {
		return this.updatedAt;
	}

	public void setUpdatedAt(Timestamp updatedAt) {
		this.updatedAt = updatedAt;
	}

	public String getUrlKey() {
		return this.urlKey;
	}

	public void setUrlKey(String urlKey) {
		this.urlKey = urlKey;
	}

	public String getUrlPath() {
		return this.urlPath;
	}

	public void setUrlPath(String urlPath) {
		this.urlPath = urlPath;
	}

	public int getVisibility() {
		return this.visibility;
	}

	public void setVisibility(int visibility) {
		this.visibility = visibility;
	}

	public BigDecimal getWeight() {
		return this.weight;
	}

	public void setWeight(BigDecimal weight) {
		this.weight = weight;
	}

	public int getWeightType() {
		return this.weightType;
	}

	public void setWeightType(int weightType) {
		this.weightType = weightType;
	}

	public int getWomenClothingColor() {
		return this.womenClothingColor;
	}

	public void setWomenClothingColor(int womenClothingColor) {
		this.womenClothingColor = womenClothingColor;
	}

	public String getWomenClothingColorValue() {
		return this.womenClothingColorValue;
	}

	public void setWomenClothingColorValue(String womenClothingColorValue) {
		this.womenClothingColorValue = womenClothingColorValue;
	}

	public int getWomenClothingSize() {
		return this.womenClothingSize;
	}

	public void setWomenClothingSize(int womenClothingSize) {
		this.womenClothingSize = womenClothingSize;
	}

	public String getWomenClothingSizeValue() {
		return this.womenClothingSizeValue;
	}

	public void setWomenClothingSizeValue(String womenClothingSizeValue) {
		this.womenClothingSizeValue = womenClothingSizeValue;
	}

	public CatalogProductEntity getCatalogProductEntity() {
		return this.catalogProductEntity;
	}

	public void setCatalogProductEntity(CatalogProductEntity catalogProductEntity) {
		this.catalogProductEntity = catalogProductEntity;
	}
	
}