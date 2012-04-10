package id.co.bippo.magentojpa.entity;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the admin_assert database table.
 * 
 */
@Entity
@Table(name="admin_assert")
public class AdminAssert implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="assert_id")
	private int assertId;

    @Lob()
	@Column(name="assert_data")
	private String assertData;

	@Column(name="assert_type")
	private String assertType;

    public AdminAssert() {
    }

	public int getAssertId() {
		return this.assertId;
	}

	public void setAssertId(int assertId) {
		this.assertId = assertId;
	}

	public String getAssertData() {
		return this.assertData;
	}

	public void setAssertData(String assertData) {
		this.assertData = assertData;
	}

	public String getAssertType() {
		return this.assertType;
	}

	public void setAssertType(String assertType) {
		this.assertType = assertType;
	}

}