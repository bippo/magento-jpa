package id.co.bippo.magentojpa.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Set;


/**
 * The persistent class for the cms_block database table.
 * 
 */
@Entity
@Table(name="cms_block")
public class CmsBlock implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="block_id")
	private short blockId;

    @Lob()
	private String content;

	@Column(name="creation_time")
	private Timestamp creationTime;

	private String identifier;

	@Column(name="is_active")
	private short isActive;

	private String title;

	@Column(name="update_time")
	private Timestamp updateTime;

	//bi-directional many-to-many association to CoreStore
	@ManyToMany(mappedBy="cmsBlocks")
	private Set<CoreStore> coreStores;

    public CmsBlock() {
    }

	public short getBlockId() {
		return this.blockId;
	}

	public void setBlockId(short blockId) {
		this.blockId = blockId;
	}

	public String getContent() {
		return this.content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Timestamp getCreationTime() {
		return this.creationTime;
	}

	public void setCreationTime(Timestamp creationTime) {
		this.creationTime = creationTime;
	}

	public String getIdentifier() {
		return this.identifier;
	}

	public void setIdentifier(String identifier) {
		this.identifier = identifier;
	}

	public short getIsActive() {
		return this.isActive;
	}

	public void setIsActive(short isActive) {
		this.isActive = isActive;
	}

	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Timestamp getUpdateTime() {
		return this.updateTime;
	}

	public void setUpdateTime(Timestamp updateTime) {
		this.updateTime = updateTime;
	}

	public Set<CoreStore> getCoreStores() {
		return this.coreStores;
	}

	public void setCoreStores(Set<CoreStore> coreStores) {
		this.coreStores = coreStores;
	}
	
}