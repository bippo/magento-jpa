package id.co.bippo.magentojpa.entity;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the admin_rule database table.
 * 
 */
@Entity
@Table(name="admin_rule")
public class AdminRule implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="rule_id")
	private int ruleId;

	@Column(name="assert_id")
	private int assertId;

	private String permission;

	private String privileges;

	@Column(name="resource_id")
	private String resourceId;

	@Column(name="role_type")
	private String roleType;

	//bi-directional many-to-one association to AdminRole
    @ManyToOne
	@JoinColumn(name="role_id")
	private AdminRole adminRole;

    public AdminRule() {
    }

	public int getRuleId() {
		return this.ruleId;
	}

	public void setRuleId(int ruleId) {
		this.ruleId = ruleId;
	}

	public int getAssertId() {
		return this.assertId;
	}

	public void setAssertId(int assertId) {
		this.assertId = assertId;
	}

	public String getPermission() {
		return this.permission;
	}

	public void setPermission(String permission) {
		this.permission = permission;
	}

	public String getPrivileges() {
		return this.privileges;
	}

	public void setPrivileges(String privileges) {
		this.privileges = privileges;
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

	public AdminRole getAdminRole() {
		return this.adminRole;
	}

	public void setAdminRole(AdminRole adminRole) {
		this.adminRole = adminRole;
	}
	
}