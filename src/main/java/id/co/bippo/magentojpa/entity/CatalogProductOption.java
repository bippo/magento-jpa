package id.co.bippo.magentojpa.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Set;


/**
 * The persistent class for the catalog_product_option database table.
 * 
 */
@Entity
@Table(name="catalog_product_option")
public class CatalogProductOption implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="option_id")
	private int optionId;

	@Column(name="file_extension")
	private String fileExtension;

	@Column(name="image_size_x")
	private int imageSizeX;

	@Column(name="image_size_y")
	private int imageSizeY;

	@Column(name="is_require")
	private short isRequire;

	@Column(name="max_characters")
	private int maxCharacters;

	private String sku;

	@Column(name="sort_order")
	private int sortOrder;

	private String type;

	//bi-directional many-to-one association to CatalogProductEntity
    @ManyToOne
	@JoinColumn(name="product_id")
	private CatalogProductEntity catalogProductEntity;

	//bi-directional many-to-one association to CatalogProductOptionPrice
	@OneToMany(mappedBy="catalogProductOption")
	private Set<CatalogProductOptionPrice> catalogProductOptionPrices;

	//bi-directional many-to-one association to CatalogProductOptionTitle
	@OneToMany(mappedBy="catalogProductOption")
	private Set<CatalogProductOptionTitle> catalogProductOptionTitles;

	//bi-directional many-to-one association to CatalogProductOptionTypeValue
	@OneToMany(mappedBy="catalogProductOption")
	private Set<CatalogProductOptionTypeValue> catalogProductOptionTypeValues;

    public CatalogProductOption() {
    }

	public int getOptionId() {
		return this.optionId;
	}

	public void setOptionId(int optionId) {
		this.optionId = optionId;
	}

	public String getFileExtension() {
		return this.fileExtension;
	}

	public void setFileExtension(String fileExtension) {
		this.fileExtension = fileExtension;
	}

	public int getImageSizeX() {
		return this.imageSizeX;
	}

	public void setImageSizeX(int imageSizeX) {
		this.imageSizeX = imageSizeX;
	}

	public int getImageSizeY() {
		return this.imageSizeY;
	}

	public void setImageSizeY(int imageSizeY) {
		this.imageSizeY = imageSizeY;
	}

	public short getIsRequire() {
		return this.isRequire;
	}

	public void setIsRequire(short isRequire) {
		this.isRequire = isRequire;
	}

	public int getMaxCharacters() {
		return this.maxCharacters;
	}

	public void setMaxCharacters(int maxCharacters) {
		this.maxCharacters = maxCharacters;
	}

	public String getSku() {
		return this.sku;
	}

	public void setSku(String sku) {
		this.sku = sku;
	}

	public int getSortOrder() {
		return this.sortOrder;
	}

	public void setSortOrder(int sortOrder) {
		this.sortOrder = sortOrder;
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
	
	public Set<CatalogProductOptionPrice> getCatalogProductOptionPrices() {
		return this.catalogProductOptionPrices;
	}

	public void setCatalogProductOptionPrices(Set<CatalogProductOptionPrice> catalogProductOptionPrices) {
		this.catalogProductOptionPrices = catalogProductOptionPrices;
	}
	
	public Set<CatalogProductOptionTitle> getCatalogProductOptionTitles() {
		return this.catalogProductOptionTitles;
	}

	public void setCatalogProductOptionTitles(Set<CatalogProductOptionTitle> catalogProductOptionTitles) {
		this.catalogProductOptionTitles = catalogProductOptionTitles;
	}
	
	public Set<CatalogProductOptionTypeValue> getCatalogProductOptionTypeValues() {
		return this.catalogProductOptionTypeValues;
	}

	public void setCatalogProductOptionTypeValues(Set<CatalogProductOptionTypeValue> catalogProductOptionTypeValues) {
		this.catalogProductOptionTypeValues = catalogProductOptionTypeValues;
	}
	
}