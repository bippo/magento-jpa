package id.co.bippo.magentojpa.entity;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the find_feed_import_codes database table.
 * 
 */
@Entity
@Table(name="find_feed_import_codes")
public class FindFeedImportCode implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="code_id")
	private int codeId;

	@Column(name="eav_code")
	private String eavCode;

	@Column(name="import_code")
	private String importCode;

	@Column(name="is_imported")
	private int isImported;

    public FindFeedImportCode() {
    }

	public int getCodeId() {
		return this.codeId;
	}

	public void setCodeId(int codeId) {
		this.codeId = codeId;
	}

	public String getEavCode() {
		return this.eavCode;
	}

	public void setEavCode(String eavCode) {
		this.eavCode = eavCode;
	}

	public String getImportCode() {
		return this.importCode;
	}

	public void setImportCode(String importCode) {
		this.importCode = importCode;
	}

	public int getIsImported() {
		return this.isImported;
	}

	public void setIsImported(int isImported) {
		this.isImported = isImported;
	}

}