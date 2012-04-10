package id.co.bippo.magentojpa.entity;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the core_translate database table.
 * 
 */
@Entity
@Table(name="core_translate")
public class CoreTranslate implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="key_id")
	private int keyId;

	private String locale;

	private String string;

	private String translate;

	//bi-directional many-to-one association to CoreStore
    @ManyToOne
	@JoinColumn(name="store_id")
	private CoreStore coreStore;

    public CoreTranslate() {
    }

	public int getKeyId() {
		return this.keyId;
	}

	public void setKeyId(int keyId) {
		this.keyId = keyId;
	}

	public String getLocale() {
		return this.locale;
	}

	public void setLocale(String locale) {
		this.locale = locale;
	}

	public String getString() {
		return this.string;
	}

	public void setString(String string) {
		this.string = string;
	}

	public String getTranslate() {
		return this.translate;
	}

	public void setTranslate(String translate) {
		this.translate = translate;
	}

	public CoreStore getCoreStore() {
		return this.coreStore;
	}

	public void setCoreStore(CoreStore coreStore) {
		this.coreStore = coreStore;
	}
	
}