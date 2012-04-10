package id.co.bippo.magentojpa.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;
import java.math.BigDecimal;
import java.util.Set;


/**
 * The persistent class for the sales_recurring_profile database table.
 * 
 */
@Entity
@Table(name="sales_recurring_profile")
public class SalesRecurringProfile implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="profile_id")
	private int profileId;

    @Lob()
	@Column(name="additional_info")
	private String additionalInfo;

	@Column(name="bill_failed_later")
	private int billFailedLater;

    @Lob()
	@Column(name="billing_address_info")
	private String billingAddressInfo;

	@Column(name="billing_amount")
	private BigDecimal billingAmount;

	@Column(name="created_at")
	private Timestamp createdAt;

	@Column(name="currency_code")
	private String currencyCode;

	@Column(name="init_amount")
	private BigDecimal initAmount;

	@Column(name="init_may_fail")
	private int initMayFail;

	@Column(name="internal_reference_id")
	private String internalReferenceId;

	@Column(name="method_code")
	private String methodCode;

    @Lob()
	@Column(name="order_info")
	private String orderInfo;

    @Lob()
	@Column(name="order_item_info")
	private String orderItemInfo;

	@Column(name="period_frequency")
	private int periodFrequency;

	@Column(name="period_max_cycles")
	private int periodMaxCycles;

	@Column(name="period_unit")
	private String periodUnit;

    @Lob()
	@Column(name="profile_vendor_info")
	private String profileVendorInfo;

	@Column(name="reference_id")
	private String referenceId;

	@Column(name="schedule_description")
	private String scheduleDescription;

    @Lob()
	@Column(name="shipping_address_info")
	private String shippingAddressInfo;

	@Column(name="shipping_amount")
	private BigDecimal shippingAmount;

	@Column(name="start_datetime")
	private Timestamp startDatetime;

	private String state;

	@Column(name="subscriber_name")
	private String subscriberName;

	@Column(name="suspension_threshold")
	private int suspensionThreshold;

	@Column(name="tax_amount")
	private BigDecimal taxAmount;

    @Lob()
	@Column(name="trial_billing_amount")
	private String trialBillingAmount;

	@Column(name="trial_period_frequency")
	private int trialPeriodFrequency;

	@Column(name="trial_period_max_cycles")
	private int trialPeriodMaxCycles;

	@Column(name="trial_period_unit")
	private String trialPeriodUnit;

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

	//bi-directional many-to-one association to SalesRecurringProfileOrder
	@OneToMany(mappedBy="salesRecurringProfile")
	private Set<SalesRecurringProfileOrder> salesRecurringProfileOrders;

    public SalesRecurringProfile() {
    }

	public int getProfileId() {
		return this.profileId;
	}

	public void setProfileId(int profileId) {
		this.profileId = profileId;
	}

	public String getAdditionalInfo() {
		return this.additionalInfo;
	}

	public void setAdditionalInfo(String additionalInfo) {
		this.additionalInfo = additionalInfo;
	}

	public int getBillFailedLater() {
		return this.billFailedLater;
	}

	public void setBillFailedLater(int billFailedLater) {
		this.billFailedLater = billFailedLater;
	}

	public String getBillingAddressInfo() {
		return this.billingAddressInfo;
	}

	public void setBillingAddressInfo(String billingAddressInfo) {
		this.billingAddressInfo = billingAddressInfo;
	}

	public BigDecimal getBillingAmount() {
		return this.billingAmount;
	}

	public void setBillingAmount(BigDecimal billingAmount) {
		this.billingAmount = billingAmount;
	}

	public Timestamp getCreatedAt() {
		return this.createdAt;
	}

	public void setCreatedAt(Timestamp createdAt) {
		this.createdAt = createdAt;
	}

	public String getCurrencyCode() {
		return this.currencyCode;
	}

	public void setCurrencyCode(String currencyCode) {
		this.currencyCode = currencyCode;
	}

	public BigDecimal getInitAmount() {
		return this.initAmount;
	}

	public void setInitAmount(BigDecimal initAmount) {
		this.initAmount = initAmount;
	}

	public int getInitMayFail() {
		return this.initMayFail;
	}

	public void setInitMayFail(int initMayFail) {
		this.initMayFail = initMayFail;
	}

	public String getInternalReferenceId() {
		return this.internalReferenceId;
	}

	public void setInternalReferenceId(String internalReferenceId) {
		this.internalReferenceId = internalReferenceId;
	}

	public String getMethodCode() {
		return this.methodCode;
	}

	public void setMethodCode(String methodCode) {
		this.methodCode = methodCode;
	}

	public String getOrderInfo() {
		return this.orderInfo;
	}

	public void setOrderInfo(String orderInfo) {
		this.orderInfo = orderInfo;
	}

	public String getOrderItemInfo() {
		return this.orderItemInfo;
	}

	public void setOrderItemInfo(String orderItemInfo) {
		this.orderItemInfo = orderItemInfo;
	}

	public int getPeriodFrequency() {
		return this.periodFrequency;
	}

	public void setPeriodFrequency(int periodFrequency) {
		this.periodFrequency = periodFrequency;
	}

	public int getPeriodMaxCycles() {
		return this.periodMaxCycles;
	}

	public void setPeriodMaxCycles(int periodMaxCycles) {
		this.periodMaxCycles = periodMaxCycles;
	}

	public String getPeriodUnit() {
		return this.periodUnit;
	}

	public void setPeriodUnit(String periodUnit) {
		this.periodUnit = periodUnit;
	}

	public String getProfileVendorInfo() {
		return this.profileVendorInfo;
	}

	public void setProfileVendorInfo(String profileVendorInfo) {
		this.profileVendorInfo = profileVendorInfo;
	}

	public String getReferenceId() {
		return this.referenceId;
	}

	public void setReferenceId(String referenceId) {
		this.referenceId = referenceId;
	}

	public String getScheduleDescription() {
		return this.scheduleDescription;
	}

	public void setScheduleDescription(String scheduleDescription) {
		this.scheduleDescription = scheduleDescription;
	}

	public String getShippingAddressInfo() {
		return this.shippingAddressInfo;
	}

	public void setShippingAddressInfo(String shippingAddressInfo) {
		this.shippingAddressInfo = shippingAddressInfo;
	}

	public BigDecimal getShippingAmount() {
		return this.shippingAmount;
	}

	public void setShippingAmount(BigDecimal shippingAmount) {
		this.shippingAmount = shippingAmount;
	}

	public Timestamp getStartDatetime() {
		return this.startDatetime;
	}

	public void setStartDatetime(Timestamp startDatetime) {
		this.startDatetime = startDatetime;
	}

	public String getState() {
		return this.state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getSubscriberName() {
		return this.subscriberName;
	}

	public void setSubscriberName(String subscriberName) {
		this.subscriberName = subscriberName;
	}

	public int getSuspensionThreshold() {
		return this.suspensionThreshold;
	}

	public void setSuspensionThreshold(int suspensionThreshold) {
		this.suspensionThreshold = suspensionThreshold;
	}

	public BigDecimal getTaxAmount() {
		return this.taxAmount;
	}

	public void setTaxAmount(BigDecimal taxAmount) {
		this.taxAmount = taxAmount;
	}

	public String getTrialBillingAmount() {
		return this.trialBillingAmount;
	}

	public void setTrialBillingAmount(String trialBillingAmount) {
		this.trialBillingAmount = trialBillingAmount;
	}

	public int getTrialPeriodFrequency() {
		return this.trialPeriodFrequency;
	}

	public void setTrialPeriodFrequency(int trialPeriodFrequency) {
		this.trialPeriodFrequency = trialPeriodFrequency;
	}

	public int getTrialPeriodMaxCycles() {
		return this.trialPeriodMaxCycles;
	}

	public void setTrialPeriodMaxCycles(int trialPeriodMaxCycles) {
		this.trialPeriodMaxCycles = trialPeriodMaxCycles;
	}

	public String getTrialPeriodUnit() {
		return this.trialPeriodUnit;
	}

	public void setTrialPeriodUnit(String trialPeriodUnit) {
		this.trialPeriodUnit = trialPeriodUnit;
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
	
	public Set<SalesRecurringProfileOrder> getSalesRecurringProfileOrders() {
		return this.salesRecurringProfileOrders;
	}

	public void setSalesRecurringProfileOrders(Set<SalesRecurringProfileOrder> salesRecurringProfileOrders) {
		this.salesRecurringProfileOrders = salesRecurringProfileOrders;
	}
	
}