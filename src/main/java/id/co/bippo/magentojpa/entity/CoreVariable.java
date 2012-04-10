package id.co.bippo.magentojpa.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Set;


/**
 * The persistent class for the core_variable database table.
 * 
 */
@Entity
@Table(name="core_variable")
public class CoreVariable implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="variable_id")
	private int variableId;

	private String code;

	private String name;

	//bi-directional many-to-one association to CoreVariableValue
	@OneToMany(mappedBy="coreVariable")
	private Set<CoreVariableValue> coreVariableValues;

    public CoreVariable() {
    }

	public int getVariableId() {
		return this.variableId;
	}

	public void setVariableId(int variableId) {
		this.variableId = variableId;
	}

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Set<CoreVariableValue> getCoreVariableValues() {
		return this.coreVariableValues;
	}

	public void setCoreVariableValues(Set<CoreVariableValue> coreVariableValues) {
		this.coreVariableValues = coreVariableValues;
	}
	
}