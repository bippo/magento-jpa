package id.co.bippo.magentojpa.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Set;


/**
 * The persistent class for the sales_billing_agreement database table.
 * 
 */
@Entity
@Table(name="sales_billing_agreement")
public class SalesBillingAgreement implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="agreement_id")
	private int agreementId;

	@Column(name="agreement_label")
	private String agreementLabel;

	@Column(name="created_at")
	private Timestamp createdAt;

	@Column(name="method_code")
	private String methodCode;

	@Column(name="reference_id")
	private String referenceId;

	private String status;

	@Column(name="updated_at")
	private Timestamp updatedAt;

	//bi-directional many-to-one association to CustomerEntity
    @ManyToOne
	@JoinColumn(name="customer_id")
	private CustomerEntity customerEntity;

	//bi-directional many-to-one association to CoreStore
    @ManyToOne
	@JoinColumn(name="store_id")
	private CoreStore coreStore;

	//bi-directional many-to-many association to SalesFlatOrder
	@ManyToMany(mappedBy="salesBillingAgreements")
	private Set<SalesFlatOrder> salesFlatOrders;

    public SalesBillingAgreement() {
    }

	public int getAgreementId() {
		return this.agreementId;
	}

	public void setAgreementId(int agreementId) {
		this.agreementId = agreementId;
	}

	public String getAgreementLabel() {
		return this.agreementLabel;
	}

	public void setAgreementLabel(String agreementLabel) {
		this.agreementLabel = agreementLabel;
	}

	public Timestamp getCreatedAt() {
		return this.createdAt;
	}

	public void setCreatedAt(Timestamp createdAt) {
		this.createdAt = createdAt;
	}

	public String getMethodCode() {
		return this.methodCode;
	}

	public void setMethodCode(String methodCode) {
		this.methodCode = methodCode;
	}

	public String getReferenceId() {
		return this.referenceId;
	}

	public void setReferenceId(String referenceId) {
		this.referenceId = referenceId;
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Timestamp getUpdatedAt() {
		return this.updatedAt;
	}

	public void setUpdatedAt(Timestamp updatedAt) {
		this.updatedAt = updatedAt;
	}

	public CustomerEntity getCustomerEntity() {
		return this.customerEntity;
	}

	public void setCustomerEntity(CustomerEntity customerEntity) {
		this.customerEntity = customerEntity;
	}
	
	public CoreStore getCoreStore() {
		return this.coreStore;
	}

	public void setCoreStore(CoreStore coreStore) {
		this.coreStore = coreStore;
	}
	
	public Set<SalesFlatOrder> getSalesFlatOrders() {
		return this.salesFlatOrders;
	}

	public void setSalesFlatOrders(Set<SalesFlatOrder> salesFlatOrders) {
		this.salesFlatOrders = salesFlatOrders;
	}
	
}