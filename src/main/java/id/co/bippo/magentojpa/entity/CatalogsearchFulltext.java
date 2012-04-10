package id.co.bippo.magentojpa.entity;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the catalogsearch_fulltext database table.
 * 
 */
@Entity
@Table(name="catalogsearch_fulltext")
public class CatalogsearchFulltext implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="fulltext_id")
	private int fulltextId;

    @Lob()
	@Column(name="data_index")
	private String dataIndex;

	@Column(name="product_id")
	private int productId;

	@Column(name="store_id")
	private int storeId;

    public CatalogsearchFulltext() {
    }

	public int getFulltextId() {
		return this.fulltextId;
	}

	public void setFulltextId(int fulltextId) {
		this.fulltextId = fulltextId;
	}

	public String getDataIndex() {
		return this.dataIndex;
	}

	public void setDataIndex(String dataIndex) {
		this.dataIndex = dataIndex;
	}

	public int getProductId() {
		return this.productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public int getStoreId() {
		return this.storeId;
	}

	public void setStoreId(int storeId) {
		this.storeId = storeId;
	}

}