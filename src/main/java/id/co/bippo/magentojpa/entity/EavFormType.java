package id.co.bippo.magentojpa.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Set;


/**
 * The persistent class for the eav_form_type database table.
 * 
 */
@Entity
@Table(name="eav_form_type")
public class EavFormType implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="type_id")
	private int typeId;

	private String code;

	@Column(name="is_system")
	private int isSystem;

	private String label;

	private String theme;

	//bi-directional many-to-one association to EavFormElement
	@OneToMany(mappedBy="eavFormType")
	private Set<EavFormElement> eavFormElements;

	//bi-directional many-to-one association to EavFormFieldset
	@OneToMany(mappedBy="eavFormType")
	private Set<EavFormFieldset> eavFormFieldsets;

	//bi-directional many-to-one association to CoreStore
    @ManyToOne
	@JoinColumn(name="store_id")
	private CoreStore coreStore;

	//bi-directional many-to-many association to EavEntityType
	@ManyToMany(mappedBy="eavFormTypes")
	private Set<EavEntityType> eavEntityTypes;

    public EavFormType() {
    }

	public int getTypeId() {
		return this.typeId;
	}

	public void setTypeId(int typeId) {
		this.typeId = typeId;
	}

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public int getIsSystem() {
		return this.isSystem;
	}

	public void setIsSystem(int isSystem) {
		this.isSystem = isSystem;
	}

	public String getLabel() {
		return this.label;
	}

	public void setLabel(String label) {
		this.label = label;
	}

	public String getTheme() {
		return this.theme;
	}

	public void setTheme(String theme) {
		this.theme = theme;
	}

	public Set<EavFormElement> getEavFormElements() {
		return this.eavFormElements;
	}

	public void setEavFormElements(Set<EavFormElement> eavFormElements) {
		this.eavFormElements = eavFormElements;
	}
	
	public Set<EavFormFieldset> getEavFormFieldsets() {
		return this.eavFormFieldsets;
	}

	public void setEavFormFieldsets(Set<EavFormFieldset> eavFormFieldsets) {
		this.eavFormFieldsets = eavFormFieldsets;
	}
	
	public CoreStore getCoreStore() {
		return this.coreStore;
	}

	public void setCoreStore(CoreStore coreStore) {
		this.coreStore = coreStore;
	}
	
	public Set<EavEntityType> getEavEntityTypes() {
		return this.eavEntityTypes;
	}

	public void setEavEntityTypes(Set<EavEntityType> eavEntityTypes) {
		this.eavEntityTypes = eavEntityTypes;
	}
	
}