package id.co.bippo.magentojpa.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Set;


/**
 * The persistent class for the api_role database table.
 * 
 */
@Entity
@Table(name="api_role")
public class ApiRole implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="role_id")
	private int roleId;

	@Column(name="parent_id")
	private int parentId;

	@Column(name="role_name")
	private String roleName;

	@Column(name="role_type")
	private String roleType;

	@Column(name="sort_order")
	private int sortOrder;

	@Column(name="tree_level")
	private int treeLevel;

	@Column(name="user_id")
	private int userId;

	//bi-directional many-to-one association to ApiRule
	@OneToMany(mappedBy="apiRole")
	private Set<ApiRule> apiRules;

    public ApiRole() {
    }

	public int getRoleId() {
		return this.roleId;
	}

	public void setRoleId(int roleId) {
		this.roleId = roleId;
	}

	public int getParentId() {
		return this.parentId;
	}

	public void setParentId(int parentId) {
		this.parentId = parentId;
	}

	public String getRoleName() {
		return this.roleName;
	}

	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}

	public String getRoleType() {
		return this.roleType;
	}

	public void setRoleType(String roleType) {
		this.roleType = roleType;
	}

	public int getSortOrder() {
		return this.sortOrder;
	}

	public void setSortOrder(int sortOrder) {
		this.sortOrder = sortOrder;
	}

	public int getTreeLevel() {
		return this.treeLevel;
	}

	public void setTreeLevel(int treeLevel) {
		this.treeLevel = treeLevel;
	}

	public int getUserId() {
		return this.userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public Set<ApiRule> getApiRules() {
		return this.apiRules;
	}

	public void setApiRules(Set<ApiRule> apiRules) {
		this.apiRules = apiRules;
	}
	
}