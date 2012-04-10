package id.co.bippo.magentojpa.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Set;


/**
 * The persistent class for the checkout_agreement database table.
 * 
 */
@Entity
@Table(name="checkout_agreement")
public class CheckoutAgreement implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="agreement_id")
	private int agreementId;

    @Lob()
	@Column(name="checkbox_text")
	private String checkboxText;

    @Lob()
	private String content;

	@Column(name="content_height")
	private String contentHeight;

	@Column(name="is_active")
	private short isActive;

	@Column(name="is_html")
	private short isHtml;

	private String name;

	//bi-directional many-to-many association to CoreStore
    @ManyToMany
	@JoinTable(
		name="checkout_agreement_store"
		, joinColumns={
			@JoinColumn(name="agreement_id")
			}
		, inverseJoinColumns={
			@JoinColumn(name="store_id")
			}
		)
	private Set<CoreStore> coreStores;

    public CheckoutAgreement() {
    }

	public int getAgreementId() {
		return this.agreementId;
	}

	public void setAgreementId(int agreementId) {
		this.agreementId = agreementId;
	}

	public String getCheckboxText() {
		return this.checkboxText;
	}

	public void setCheckboxText(String checkboxText) {
		this.checkboxText = checkboxText;
	}

	public String getContent() {
		return this.content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getContentHeight() {
		return this.contentHeight;
	}

	public void setContentHeight(String contentHeight) {
		this.contentHeight = contentHeight;
	}

	public short getIsActive() {
		return this.isActive;
	}

	public void setIsActive(short isActive) {
		this.isActive = isActive;
	}

	public short getIsHtml() {
		return this.isHtml;
	}

	public void setIsHtml(short isHtml) {
		this.isHtml = isHtml;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Set<CoreStore> getCoreStores() {
		return this.coreStores;
	}

	public void setCoreStores(Set<CoreStore> coreStores) {
		this.coreStores = coreStores;
	}
	
}