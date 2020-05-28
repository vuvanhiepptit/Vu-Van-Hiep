package com.luvina.restfulapi.entities;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "tbl_post")
public class TblPostEntity {
	
	@Id
	@Column(name = "post_id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	
	@Column(name = "post_code")
	private String postCode;
	
	@Column(name = "update_show")
	private int updateShow;
	
	@Column(name = "change_reason")
	private int changeReason;
	
	@Column(name = "multi_area")
	private int multiArea;
	
	@OneToMany(targetEntity = TblCityEntity.class, mappedBy = "id", fetch = FetchType.LAZY)
	private Set<TblAreaEntity> tblAreaEntities;
	
	
	public long getId() {
		return id;
	}
	
	public void setId(long id) {
		this.id = id;
	}
	
	public String getPostCode() {
		return postCode;
	}
	
	public void setPostCode(String postCode) {
		this.postCode = postCode;
	}
	
	public int getUpdateShow() {
		return updateShow;
	}
	
	public void setUpdateShow(int updateShow) {
		this.updateShow = updateShow;
	}
	
	public int getChangeReason() {
		return changeReason;
	}
	
	public void setChangeReason(int changeReason) {
		this.changeReason = changeReason;
	}
	
	public int getMultiArea() {
		return multiArea;
	}
	
	public void setMultiArea(int multiArea) {
		this.multiArea = multiArea;
	}
	
	public Set<TblAreaEntity> getTblAreaEntities() {
		return tblAreaEntities;
	}
	
	public void setTblAreaEntities(Set<TblAreaEntity> tblAreaEntities) {
		this.tblAreaEntities = tblAreaEntities;
	}
}
