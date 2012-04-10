package id.co.bippo.magentojpa.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Set;


/**
 * The persistent class for the eav_attribute_option database table.
 * 
 */
@Entity
@Table(name="eav_attribute_option")
public class EavAttributeOption implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="option_id")
	private int optionId;

	@Column(name="sort_order")
	private int sortOrder;

	//bi-directional many-to-one association to EavAttribute
    @ManyToOne
	@JoinColumn(name="attribute_id")
	private EavAttribute eavAttribute;

	//bi-directional many-to-one association to EavAttributeOptionValue
	@OneToMany(mappedBy="eavAttributeOption")
	private Set<EavAttributeOptionValue> eavAttributeOptionValues;

    public EavAttributeOption() {
    }

	public int getOptionId() {
		return this.optionId;
	}

	public void setOptionId(int optionId) {
		this.optionId = optionId;
	}

	public int getSortOrder() {
		return this.sortOrder;
	}

	public void setSortOrder(int sortOrder) {
		this.sortOrder = sortOrder;
	}

	public EavAttribute getEavAttribute() {
		return this.eavAttribute;
	}

	public void setEavAttribute(EavAttribute eavAttribute) {
		this.eavAttribute = eavAttribute;
	}
	
	public Set<EavAttributeOptionValue> getEavAttributeOptionValues() {
		return this.eavAttributeOptionValues;
	}

	public void setEavAttributeOptionValues(Set<EavAttributeOptionValue> eavAttributeOptionValues) {
		this.eavAttributeOptionValues = eavAttributeOptionValues;
	}
	
}