package id.co.bippo.magentojpa.entity;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the core_cache_option database table.
 * 
 */
@Entity
@Table(name="core_cache_option")
public class CoreCacheOption implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private String code;

	private short value;

    public CoreCacheOption() {
    }

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public short getValue() {
		return this.value;
	}

	public void setValue(short value) {
		this.value = value;
	}

}