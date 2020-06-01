package com.luvina.restfulapi.entities;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "tbl_old_post")
public class TblOldPostEntity {
	
	@Id
	@Column(name = "old_post_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@Column(name = "old_post_code")
	private String oldPostCode;
	
	@OneToMany(targetEntity = TblCityEntity.class, mappedBy = "id", fetch = FetchType.LAZY)
	private Set<TblAreaEntity> tblAreaEntities;
	
	

	public String getOldPostCode() {
		return oldPostCode;
	}
	
	public void setOldPostCode(String oldPostCode) {
		this.oldPostCode = oldPostCode;
	}
	
	public Set<TblAreaEntity> getTblAreaEntities() {
		return tblAreaEntities;
	}
	
	public void setTblAreaEntities(Set<TblAreaEntity> tblAreaEntities) {
		this.tblAreaEntities = tblAreaEntities;
	}

}
