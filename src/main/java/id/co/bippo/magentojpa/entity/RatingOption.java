package id.co.bippo.magentojpa.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Set;


/**
 * The persistent class for the rating_option database table.
 * 
 */
@Entity
@Table(name="rating_option")
public class RatingOption implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="option_id")
	private int optionId;

	private String code;

	private int position;

	private int value;

	//bi-directional many-to-one association to Rating
    @ManyToOne
	@JoinColumn(name="rating_id")
	private Rating rating;

	//bi-directional many-to-one association to RatingOptionVote
	@OneToMany(mappedBy="ratingOption")
	private Set<RatingOptionVote> ratingOptionVotes;

    public RatingOption() {
    }

	public int getOptionId() {
		return this.optionId;
	}

	public void setOptionId(int optionId) {
		this.optionId = optionId;
	}

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public int getPosition() {
		return this.position;
	}

	public void setPosition(int position) {
		this.position = position;
	}

	public int getValue() {
		return this.value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	public Rating getRating() {
		return this.rating;
	}

	public void setRating(Rating rating) {
		this.rating = rating;
	}
	
	public Set<RatingOptionVote> getRatingOptionVotes() {
		return this.ratingOptionVotes;
	}

	public void setRatingOptionVotes(Set<RatingOptionVote> ratingOptionVotes) {
		this.ratingOptionVotes = ratingOptionVotes;
	}
	
}