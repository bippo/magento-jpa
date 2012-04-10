package id.co.bippo.magentojpa.entity;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the googlebase_attributes database table.
 * 
 */
@Entity
@Table(name="googlebase_attributes")
public class GooglebaseAttribute implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;

	@Column(name="gbase_attribute")
	private String gbaseAttribute;

	//bi-directional many-to-one association to EavAttribute
    @ManyToOne
	@JoinColumn(name="attribute_id")
	private EavAttribute eavAttribute;

	//bi-directional many-to-one association to GooglebaseType
    @ManyToOne
	@JoinColumn(name="type_id")
	private GooglebaseType googlebaseType;

    public GooglebaseAttribute() {
    }

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getGbaseAttribute() {
		return this.gbaseAttribute;
	}

	public void setGbaseAttribute(String gbaseAttribute) {
		this.gbaseAttribute = gbaseAttribute;
	}

	public EavAttribute getEavAttribute() {
		return this.eavAttribute;
	}

	public void setEavAttribute(EavAttribute eavAttribute) {
		this.eavAttribute = eavAttribute;
	}
	
	public GooglebaseType getGooglebaseType() {
		return this.googlebaseType;
	}

	public void setGooglebaseType(GooglebaseType googlebaseType) {
		this.googlebaseType = googlebaseType;
	}
	
}