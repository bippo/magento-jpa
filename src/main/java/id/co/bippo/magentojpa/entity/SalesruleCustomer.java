package id.co.bippo.magentojpa.entity;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the salesrule_customer database table.
 * 
 */
@Entity
@Table(name="salesrule_customer")
public class SalesruleCustomer implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="rule_customer_id")
	private int ruleCustomerId;

	@Column(name="times_used")
	private int timesUsed;

	//bi-directional many-to-one association to CustomerEntity
    @ManyToOne
	@JoinColumn(name="customer_id")
	private CustomerEntity customerEntity;

	//bi-directional many-to-one association to Salesrule
    @ManyToOne
	@JoinColumn(name="rule_id")
	private Salesrule salesrule;

    public SalesruleCustomer() {
    }

	public int getRuleCustomerId() {
		return this.ruleCustomerId;
	}

	public void setRuleCustomerId(int ruleCustomerId) {
		this.ruleCustomerId = ruleCustomerId;
	}

	public int getTimesUsed() {
		return this.timesUsed;
	}

	public void setTimesUsed(int timesUsed) {
		this.timesUsed = timesUsed;
	}

	public CustomerEntity getCustomerEntity() {
		return this.customerEntity;
	}

	public void setCustomerEntity(CustomerEntity customerEntity) {
		this.customerEntity = customerEntity;
	}
	
	public Salesrule getSalesrule() {
		return this.salesrule;
	}

	public void setSalesrule(Salesrule salesrule) {
		this.salesrule = salesrule;
	}
	
}