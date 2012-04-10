package id.co.bippo.magentojpa.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Set;


/**
 * The persistent class for the catalogsearch_query database table.
 * 
 */
@Entity
@Table(name="catalogsearch_query")
public class CatalogsearchQuery implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="query_id")
	private int queryId;

	@Column(name="display_in_terms")
	private short displayInTerms;

	@Column(name="is_active")
	private short isActive;

	@Column(name="is_processed")
	private short isProcessed;

	@Column(name="num_results")
	private int numResults;

	private int popularity;

	@Column(name="query_text")
	private String queryText;

	private String redirect;

	@Column(name="synonym_for")
	private String synonymFor;

	@Column(name="updated_at")
	private Timestamp updatedAt;

	//bi-directional many-to-one association to CoreStore
    @ManyToOne
	@JoinColumn(name="store_id")
	private CoreStore coreStore;

	//bi-directional many-to-one association to CatalogsearchResult
	@OneToMany(mappedBy="catalogsearchQuery")
	private Set<CatalogsearchResult> catalogsearchResults;

    public CatalogsearchQuery() {
    }

	public int getQueryId() {
		return this.queryId;
	}

	public void setQueryId(int queryId) {
		this.queryId = queryId;
	}

	public short getDisplayInTerms() {
		return this.displayInTerms;
	}

	public void setDisplayInTerms(short displayInTerms) {
		this.displayInTerms = displayInTerms;
	}

	public short getIsActive() {
		return this.isActive;
	}

	public void setIsActive(short isActive) {
		this.isActive = isActive;
	}

	public short getIsProcessed() {
		return this.isProcessed;
	}

	public void setIsProcessed(short isProcessed) {
		this.isProcessed = isProcessed;
	}

	public int getNumResults() {
		return this.numResults;
	}

	public void setNumResults(int numResults) {
		this.numResults = numResults;
	}

	public int getPopularity() {
		return this.popularity;
	}

	public void setPopularity(int popularity) {
		this.popularity = popularity;
	}

	public String getQueryText() {
		return this.queryText;
	}

	public void setQueryText(String queryText) {
		this.queryText = queryText;
	}

	public String getRedirect() {
		return this.redirect;
	}

	public void setRedirect(String redirect) {
		this.redirect = redirect;
	}

	public String getSynonymFor() {
		return this.synonymFor;
	}

	public void setSynonymFor(String synonymFor) {
		this.synonymFor = synonymFor;
	}

	public Timestamp getUpdatedAt() {
		return this.updatedAt;
	}

	public void setUpdatedAt(Timestamp updatedAt) {
		this.updatedAt = updatedAt;
	}

	public CoreStore getCoreStore() {
		return this.coreStore;
	}

	public void setCoreStore(CoreStore coreStore) {
		this.coreStore = coreStore;
	}
	
	public Set<CatalogsearchResult> getCatalogsearchResults() {
		return this.catalogsearchResults;
	}

	public void setCatalogsearchResults(Set<CatalogsearchResult> catalogsearchResults) {
		this.catalogsearchResults = catalogsearchResults;
	}
	
}