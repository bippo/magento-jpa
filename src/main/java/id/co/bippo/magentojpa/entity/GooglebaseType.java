package id.co.bippo.magentojpa.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Set;


/**
 * The persistent class for the googlebase_types database table.
 * 
 */
@Entity
@Table(name="googlebase_types")
public class GooglebaseType implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="type_id")
	private int typeId;

	@Column(name="gbase_itemtype")
	private String gbaseItemtype;

	@Column(name="target_country")
	private String targetCountry;

	//bi-directional many-to-one association to GooglebaseAttribute
	@OneToMany(mappedBy="googlebaseType")
	private Set<GooglebaseAttribute> googlebaseAttributes;

	//bi-directional many-to-one association to EavAttributeSet
    @ManyToOne
	@JoinColumn(name="attribute_set_id")
	private EavAttributeSet eavAttributeSet;

    public GooglebaseType() {
    }

	public int getTypeId() {
		return this.typeId;
	}

	public void setTypeId(int typeId) {
		this.typeId = typeId;
	}

	public String getGbaseItemtype() {
		return this.gbaseItemtype;
	}

	public void setGbaseItemtype(String gbaseItemtype) {
		this.gbaseItemtype = gbaseItemtype;
	}

	public String getTargetCountry() {
		return this.targetCountry;
	}

	public void setTargetCountry(String targetCountry) {
		this.targetCountry = targetCountry;
	}

	public Set<GooglebaseAttribute> getGooglebaseAttributes() {
		return this.googlebaseAttributes;
	}

	public void setGooglebaseAttributes(Set<GooglebaseAttribute> googlebaseAttributes) {
		this.googlebaseAttributes = googlebaseAttributes;
	}
	
	public EavAttributeSet getEavAttributeSet() {
		return this.eavAttributeSet;
	}

	public void setEavAttributeSet(EavAttributeSet eavAttributeSet) {
		this.eavAttributeSet = eavAttributeSet;
	}
	
}