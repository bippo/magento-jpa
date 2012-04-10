package id.co.bippo.magentojpa.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Set;


/**
 * The persistent class for the rating database table.
 * 
 */
@Entity
@Table(name="rating")
public class Rating implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="rating_id")
	private int ratingId;

	private int position;

	@Column(name="rating_code")
	private String ratingCode;

	//bi-directional many-to-one association to RatingEntity
    @ManyToOne
	@JoinColumn(name="entity_id")
	private RatingEntity ratingEntity;

	//bi-directional many-to-one association to RatingOption
	@OneToMany(mappedBy="rating")
	private Set<RatingOption> ratingOptions;

	//bi-directional many-to-one association to RatingOptionVoteAggregated
	@OneToMany(mappedBy="rating")
	private Set<RatingOptionVoteAggregated> ratingOptionVoteAggregateds;

	//bi-directional many-to-many association to CoreStore
	@ManyToMany(mappedBy="ratings")
	private Set<CoreStore> coreStores;

//	//bi-directional many-to-one association to RatingTitle
//	@OneToMany(mappedBy="rating")
//	private Set<RatingTitle> ratingTitles;

    public Rating() {
    }

	public int getRatingId() {
		return this.ratingId;
	}

	public void setRatingId(int ratingId) {
		this.ratingId = ratingId;
	}

	public int getPosition() {
		return this.position;
	}

	public void setPosition(int position) {
		this.position = position;
	}

	public String getRatingCode() {
		return this.ratingCode;
	}

	public void setRatingCode(String ratingCode) {
		this.ratingCode = ratingCode;
	}

	public RatingEntity getRatingEntity() {
		return this.ratingEntity;
	}

	public void setRatingEntity(RatingEntity ratingEntity) {
		this.ratingEntity = ratingEntity;
	}
	
	public Set<RatingOption> getRatingOptions() {
		return this.ratingOptions;
	}

	public void setRatingOptions(Set<RatingOption> ratingOptions) {
		this.ratingOptions = ratingOptions;
	}
	
	public Set<RatingOptionVoteAggregated> getRatingOptionVoteAggregateds() {
		return this.ratingOptionVoteAggregateds;
	}

	public void setRatingOptionVoteAggregateds(Set<RatingOptionVoteAggregated> ratingOptionVoteAggregateds) {
		this.ratingOptionVoteAggregateds = ratingOptionVoteAggregateds;
	}
	
	public Set<CoreStore> getCoreStores() {
		return this.coreStores;
	}

	public void setCoreStores(Set<CoreStore> coreStores) {
		this.coreStores = coreStores;
	}
	
//	public Set<RatingTitle> getRatingTitles() {
//		return this.ratingTitles;
//	}
//
//	public void setRatingTitles(Set<RatingTitle> ratingTitles) {
//		this.ratingTitles = ratingTitles;
//	}
	
}