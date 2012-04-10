package id.co.bippo.magentojpa.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the catalogsearch_result database table.
 * 
 */
@Entity
@Table(name="catalogsearch_result")
public class CatalogsearchResult implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private CatalogsearchResultPK id;

	private BigDecimal relevance;

//	//bi-directional many-to-one association to CatalogsearchQuery
//    @ManyToOne
//	@JoinColumn(name="query_id")
//	private CatalogsearchQuery catalogsearchQuery;
//
//	//bi-directional many-to-one association to CatalogProductEntity
//    @ManyToOne
//	@JoinColumn(name="product_id")
//	private CatalogProductEntity catalogProductEntity;

    public CatalogsearchResult() {
    }

	public CatalogsearchResultPK getId() {
		return this.id;
	}

	public void setId(CatalogsearchResultPK id) {
		this.id = id;
	}
	
	public BigDecimal getRelevance() {
		return this.relevance;
	}

	public void setRelevance(BigDecimal relevance) {
		this.relevance = relevance;
	}

//	public CatalogsearchQuery getCatalogsearchQuery() {
//		return this.catalogsearchQuery;
//	}
//
//	public void setCatalogsearchQuery(CatalogsearchQuery catalogsearchQuery) {
//		this.catalogsearchQuery = catalogsearchQuery;
//	}
//	
//	public CatalogProductEntity getCatalogProductEntity() {
//		return this.catalogProductEntity;
//	}
//
//	public void setCatalogProductEntity(CatalogProductEntity catalogProductEntity) {
//		this.catalogProductEntity = catalogProductEntity;
//	}
	
}