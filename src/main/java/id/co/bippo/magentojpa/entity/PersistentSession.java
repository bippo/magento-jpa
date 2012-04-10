package id.co.bippo.magentojpa.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;


/**
 * The persistent class for the persistent_session database table.
 * 
 */
@Entity
@Table(name="persistent_session")
public class PersistentSession implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="persistent_id")
	private int persistentId;

    @Lob()
	private String info;

	private String key;

	@Column(name="updated_at")
	private Timestamp updatedAt;

	//bi-directional many-to-one association to CustomerEntity
    @ManyToOne
	@JoinColumn(name="customer_id")
	private CustomerEntity customerEntity;

	//bi-directional many-to-one association to CoreWebsite
    @ManyToOne
	@JoinColumn(name="website_id")
	private CoreWebsite coreWebsite;

    public PersistentSession() {
    }

	public int getPersistentId() {
		return this.persistentId;
	}

	public void setPersistentId(int persistentId) {
		this.persistentId = persistentId;
	}

	public String getInfo() {
		return this.info;
	}

	public void setInfo(String info) {
		this.info = info;
	}

	public String getKey() {
		return this.key;
	}

	public void setKey(String key) {
		this.key = key;
	}

	public Timestamp getUpdatedAt() {
		return this.updatedAt;
	}

	public void setUpdatedAt(Timestamp updatedAt) {
		this.updatedAt = updatedAt;
	}

	public CustomerEntity getCustomerEntity() {
		return this.customerEntity;
	}

	public void setCustomerEntity(CustomerEntity customerEntity) {
		this.customerEntity = customerEntity;
	}
	
	public CoreWebsite getCoreWebsite() {
		return this.coreWebsite;
	}

	public void setCoreWebsite(CoreWebsite coreWebsite) {
		this.coreWebsite = coreWebsite;
	}
	
}