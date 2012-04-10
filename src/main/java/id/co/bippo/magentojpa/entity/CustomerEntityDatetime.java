package id.co.bippo.magentojpa.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the customer_entity_datetime database table.
 * 
 */
@Entity
@Table(name="customer_entity_datetime")
public class CustomerEntityDatetime implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="value_id")
	private int valueId;

    @Temporal( TemporalType.TIMESTAMP)
	private Date value;

	//bi-directional many-to-one association to EavAttribute
    @ManyToOne
	@JoinColumn(name="attribute_id")
	private EavAttribute eavAttribute;

	//bi-directional many-to-one association to EavEntityType
    @ManyToOne
	@JoinColumn(name="entity_type_id")
	private EavEntityType eavEntityType;

	//bi-directional many-to-one association to CustomerEntity
    @ManyToOne
	@JoinColumn(name="entity_id")
	private CustomerEntity customerEntity;

    public CustomerEntityDatetime() {
    }

	public int getValueId() {
		return this.valueId;
	}

	public void setValueId(int valueId) {
		this.valueId = valueId;
	}

	public Date getValue() {
		return this.value;
	}

	public void setValue(Date value) {
		this.value = value;
	}

	public EavAttribute getEavAttribute() {
		return this.eavAttribute;
	}

	public void setEavAttribute(EavAttribute eavAttribute) {
		this.eavAttribute = eavAttribute;
	}
	
	public EavEntityType getEavEntityType() {
		return this.eavEntityType;
	}

	public void setEavEntityType(EavEntityType eavEntityType) {
		this.eavEntityType = eavEntityType;
	}
	
	public CustomerEntity getCustomerEntity() {
		return this.customerEntity;
	}

	public void setCustomerEntity(CustomerEntity customerEntity) {
		this.customerEntity = customerEntity;
	}
	
}