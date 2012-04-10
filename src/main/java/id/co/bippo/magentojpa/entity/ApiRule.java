package id.co.bippo.magentojpa.entity;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the api_rule database table.
 * 
 */
@Entity
@Table(name="api_rule")
public class ApiRule implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="rule_id")
	private int ruleId;

	@Column(name="api_permission")
	private String apiPermission;

	@Column(name="api_privileges")
	private String apiPrivileges;

	@Column(name="assert_id")
	private int assertId;

	@Column(name="resource_id")
	private String resourceId;

	@Column(name="role_type")
	private String roleType;

	//bi-directional many-to-one association to ApiRole
    @ManyToOne
	@JoinColumn(name="role_id")
	private ApiRole apiRole;

    public ApiRule() {
    }

	public int getRuleId() {
		return this.ruleId;
	}

	public void setRuleId(int ruleId) {
		this.ruleId = ruleId;
	}

	public String getApiPermission() {
		return this.apiPermission;
	}

	public void setApiPermission(String apiPermission) {
		this.apiPermission = apiPermission;
	}

	public String getApiPrivileges() {
		return this.apiPrivileges;
	}

	public void setApiPrivileges(String apiPrivileges) {
		this.apiPrivileges = apiPrivileges;
	}

	public int getAssertId() {
		return this.assertId;
	}

	public void setAssertId(int assertId) {
		this.assertId = assertId;
	}

	public String getResourceId() {
		return this.resourceId;
	}

	public void setResourceId(String resourceId) {
		this.resourceId = resourceId;
	}

	public String getRoleType() {
		return this.roleType;
	}

	public void setRoleType(String roleType) {
		this.roleType = roleType;
	}

	public ApiRole getApiRole() {
		return this.apiRole;
	}

	public void setApiRole(ApiRole apiRole) {
		this.apiRole = apiRole;
	}
	
}