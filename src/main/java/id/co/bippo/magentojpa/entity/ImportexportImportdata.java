package id.co.bippo.magentojpa.entity;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the importexport_importdata database table.
 * 
 */
@Entity
@Table(name="importexport_importdata")
public class ImportexportImportdata implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;

	private Object behavior;

    @Lob()
	private String data;

	private String entity;

    public ImportexportImportdata() {
    }

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Object getBehavior() {
		return this.behavior;
	}

	public void setBehavior(Object behavior) {
		this.behavior = behavior;
	}

	public String getData() {
		return this.data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public String getEntity() {
		return this.entity;
	}

	public void setEntity(String entity) {
		this.entity = entity;
	}

}