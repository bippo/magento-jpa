package id.co.bippo.magentojpa.entity;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the rating_title database table.
 * 
 */
@Embeddable
public class RatingTitlePK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="rating_id")
	private int ratingId;

	@Column(name="store_id")
	private int storeId;

    public RatingTitlePK() {
    }
	public int getRatingId() {
		return this.ratingId;
	}
	public void setRatingId(int ratingId) {
		this.ratingId = ratingId;
	}
	public int getStoreId() {
		return this.storeId;
	}
	public void setStoreId(int storeId) {
		this.storeId = storeId;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof RatingTitlePK)) {
			return false;
		}
		RatingTitlePK castOther = (RatingTitlePK)other;
		return 
			(this.ratingId == castOther.ratingId)
			&& (this.storeId == castOther.storeId);

    }
    
	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.ratingId;
		hash = hash * prime + this.storeId;
		
		return hash;
    }
}