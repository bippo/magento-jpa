package id.co.bippo.magentojpa.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;


/**
 * The persistent class for the product_alert_stock database table.
 * 
 */
@Entity
@Table(name="product_alert_stock")
public class ProductAlertStock implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="alert_stock_id")
	private int alertStockId;

	@Column(name="add_date")
	private Timestamp addDate;

	@Column(name="send_count")
	private int sendCount;

	@Column(name="send_date")
	private Timestamp sendDate;

	private int status;

	//bi-directional many-to-one association to CatalogProductEntity
    @ManyToOne
	@JoinColumn(name="product_id")
	private CatalogProductEntity catalogProductEntity;

	//bi-directional many-to-one association to CustomerEntity
    @ManyToOne
	@JoinColumn(name="customer_id")
	private CustomerEntity customerEntity;

	//bi-directional many-to-one association to CoreWebsite
    @ManyToOne
	@JoinColumn(name="website_id")
	private CoreWebsite coreWebsite;

    public ProductAlertStock() {
    }

	public int getAlertStockId() {
		return this.alertStockId;
	}

	public void setAlertStockId(int alertStockId) {
		this.alertStockId = alertStockId;
	}

	public Timestamp getAddDate() {
		return this.addDate;
	}

	public void setAddDate(Timestamp addDate) {
		this.addDate = addDate;
	}

	public int getSendCount() {
		return this.sendCount;
	}

	public void setSendCount(int sendCount) {
		this.sendCount = sendCount;
	}

	public Timestamp getSendDate() {
		return this.sendDate;
	}

	public void setSendDate(Timestamp sendDate) {
		this.sendDate = sendDate;
	}

	public int getStatus() {
		return this.status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public CatalogProductEntity getCatalogProductEntity() {
		return this.catalogProductEntity;
	}

	public void setCatalogProductEntity(CatalogProductEntity catalogProductEntity) {
		this.catalogProductEntity = catalogProductEntity;
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