package id.co.bippo.magentojpa.entity;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the customer_eav_attribute_website database table.
 * 
 */
@Entity
@Table(name="customer_eav_attribute_website")
public class CustomerEavAttributeWebsite implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private CustomerEavAttributeWebsitePK id;

    @Lob()
	@Column(name="default_value")
	private String defaultValue;

	@Column(name="is_required")
	private int isRequired;

	@Column(name="is_visible")
	private int isVisible;

	@Column(name="multiline_count")
	private int multilineCount;

//	//bi-directional many-to-one association to EavAttribute
//    @ManyToOne
//	@JoinColumn(name="attribute_id")
//	private EavAttribute eavAttribute;
//
//	//bi-directional many-to-one association to CoreWebsite
//    @ManyToOne
//	@JoinColumn(name="website_id")
//	private CoreWebsite coreWebsite;

    public CustomerEavAttributeWebsite() {
    }

	public CustomerEavAttributeWebsitePK getId() {
		return this.id;
	}

	public void setId(CustomerEavAttributeWebsitePK id) {
		this.id = id;
	}
	
	public String getDefaultValue() {
		return this.defaultValue;
	}

	public void setDefaultValue(String defaultValue) {
		this.defaultValue = defaultValue;
	}

	public int getIsRequired() {
		return this.isRequired;
	}

	public void setIsRequired(int isRequired) {
		this.isRequired = isRequired;
	}

	public int getIsVisible() {
		return this.isVisible;
	}

	public void setIsVisible(int isVisible) {
		this.isVisible = isVisible;
	}

	public int getMultilineCount() {
		return this.multilineCount;
	}

	public void setMultilineCount(int multilineCount) {
		this.multilineCount = multilineCount;
	}

//	public EavAttribute getEavAttribute() {
//		return this.eavAttribute;
//	}
//
//	public void setEavAttribute(EavAttribute eavAttribute) {
//		this.eavAttribute = eavAttribute;
//	}
//	
//	public CoreWebsite getCoreWebsite() {
//		return this.coreWebsite;
//	}
//
//	public void setCoreWebsite(CoreWebsite coreWebsite) {
//		this.coreWebsite = coreWebsite;
//	}
	
}