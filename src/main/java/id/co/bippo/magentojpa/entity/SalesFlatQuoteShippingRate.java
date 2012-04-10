package id.co.bippo.magentojpa.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;
import java.math.BigDecimal;


/**
 * The persistent class for the sales_flat_quote_shipping_rate database table.
 * 
 */
@Entity
@Table(name="sales_flat_quote_shipping_rate")
public class SalesFlatQuoteShippingRate implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="rate_id")
	private int rateId;

	private String carrier;

	@Column(name="carrier_title")
	private String carrierTitle;

	private String code;

	@Column(name="created_at")
	private Timestamp createdAt;

    @Lob()
	@Column(name="error_message")
	private String errorMessage;

	private String method;

    @Lob()
	@Column(name="method_description")
	private String methodDescription;

    @Lob()
	@Column(name="method_title")
	private String methodTitle;

	private BigDecimal price;

	@Column(name="updated_at")
	private Timestamp updatedAt;

	//bi-directional many-to-one association to SalesFlatQuoteAddress
    @ManyToOne
	@JoinColumn(name="address_id")
	private SalesFlatQuoteAddress salesFlatQuoteAddress;

    public SalesFlatQuoteShippingRate() {
    }

	public int getRateId() {
		return this.rateId;
	}

	public void setRateId(int rateId) {
		this.rateId = rateId;
	}

	public String getCarrier() {
		return this.carrier;
	}

	public void setCarrier(String carrier) {
		this.carrier = carrier;
	}

	public String getCarrierTitle() {
		return this.carrierTitle;
	}

	public void setCarrierTitle(String carrierTitle) {
		this.carrierTitle = carrierTitle;
	}

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public Timestamp getCreatedAt() {
		return this.createdAt;
	}

	public void setCreatedAt(Timestamp createdAt) {
		this.createdAt = createdAt;
	}

	public String getErrorMessage() {
		return this.errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

	public String getMethod() {
		return this.method;
	}

	public void setMethod(String method) {
		this.method = method;
	}

	public String getMethodDescription() {
		return this.methodDescription;
	}

	public void setMethodDescription(String methodDescription) {
		this.methodDescription = methodDescription;
	}

	public String getMethodTitle() {
		return this.methodTitle;
	}

	public void setMethodTitle(String methodTitle) {
		this.methodTitle = methodTitle;
	}

	public BigDecimal getPrice() {
		return this.price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}

	public Timestamp getUpdatedAt() {
		return this.updatedAt;
	}

	public void setUpdatedAt(Timestamp updatedAt) {
		this.updatedAt = updatedAt;
	}

	public SalesFlatQuoteAddress getSalesFlatQuoteAddress() {
		return this.salesFlatQuoteAddress;
	}

	public void setSalesFlatQuoteAddress(SalesFlatQuoteAddress salesFlatQuoteAddress) {
		this.salesFlatQuoteAddress = salesFlatQuoteAddress;
	}
	
}