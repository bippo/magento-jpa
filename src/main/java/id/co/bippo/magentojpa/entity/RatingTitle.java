package id.co.bippo.magentojpa.entity;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the rating_title database table.
 * 
 */
@Entity
@Table(name="rating_title")
public class RatingTitle implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private RatingTitlePK id;

	private String value;

	//bi-directional many-to-one association to Rating
    @ManyToOne
	@JoinColumn(name="rating_id")
	private Rating rating;

	//bi-directional many-to-one association to CoreStore
    @ManyToOne
	@JoinColumn(name="store_id")
	private CoreStore coreStore;

    public RatingTitle() {
    }

	public RatingTitlePK getId() {
		return this.id;
	}

	public void setId(RatingTitlePK id) {
		this.id = id;
	}
	
	public String getValue() {
		return this.value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public Rating getRating() {
		return this.rating;
	}

	public void setRating(Rating rating) {
		this.rating = rating;
	}
	
	public CoreStore getCoreStore() {
		return this.coreStore;
	}

	public void setCoreStore(CoreStore coreStore) {
		this.coreStore = coreStore;
	}
	
}