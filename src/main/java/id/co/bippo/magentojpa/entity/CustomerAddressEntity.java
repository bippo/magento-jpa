package id.co.bippo.magentojpa.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Set;


/**
 * The persistent class for the customer_address_entity database table.
 * 
 */
@Entity
@Table(name="customer_address_entity")
public class CustomerAddressEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="entity_id")
	private int entityId;

	@Column(name="attribute_set_id")
	private int attributeSetId;

	@Column(name="created_at")
	private Timestamp createdAt;

	@Column(name="entity_type_id")
	private int entityTypeId;

	@Column(name="increment_id")
	private String incrementId;

	@Column(name="is_active")
	private int isActive;

	@Column(name="updated_at")
	private Timestamp updatedAt;

	//bi-directional many-to-one association to CustomerEntity
    @ManyToOne
	@JoinColumn(name="parent_id")
	private CustomerEntity customerEntity;

	//bi-directional many-to-one association to CustomerAddressEntityDatetime
	@OneToMany(mappedBy="customerAddressEntity")
	private Set<CustomerAddressEntityDatetime> customerAddressEntityDatetimes;

	//bi-directional many-to-one association to CustomerAddressEntityDecimal
	@OneToMany(mappedBy="customerAddressEntity")
	private Set<CustomerAddressEntityDecimal> customerAddressEntityDecimals;

	//bi-directional many-to-one association to CustomerAddressEntityInt
	@OneToMany(mappedBy="customerAddressEntity")
	private Set<CustomerAddressEntityInt> customerAddressEntityInts;

	//bi-directional many-to-one association to CustomerAddressEntityText
	@OneToMany(mappedBy="customerAddressEntity")
	private Set<CustomerAddressEntityText> customerAddressEntityTexts;

	//bi-directional many-to-one association to CustomerAddressEntityVarchar
	@OneToMany(mappedBy="customerAddressEntity")
	private Set<CustomerAddressEntityVarchar> customerAddressEntityVarchars;

    public CustomerAddressEntity() {
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

	public Timestamp getCreatedAt() {
		return this.createdAt;
	}

	public void setCreatedAt(Timestamp createdAt) {
		this.createdAt = createdAt;
	}

	public int getEntityTypeId() {
		return this.entityTypeId;
	}

	public void setEntityTypeId(int entityTypeId) {
		this.entityTypeId = entityTypeId;
	}

	public String getIncrementId() {
		return this.incrementId;
	}

	public void setIncrementId(String incrementId) {
		this.incrementId = incrementId;
	}

	public int getIsActive() {
		return this.isActive;
	}

	public void setIsActive(int isActive) {
		this.isActive = isActive;
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
	
}