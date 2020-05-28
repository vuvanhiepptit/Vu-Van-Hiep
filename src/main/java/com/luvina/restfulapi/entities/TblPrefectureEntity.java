package com.luvina.restfulapi.entities;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "tbl_prefecture")
public class TblPrefectureEntity {
	
	@Id
	@Column(name = "prefecture_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@Column(name = "prefecture_kana")
	private String prefectureKana;
	
	@Column(name = "prefecture")
	private String prefecture;
	
	@Column(name = "prefecture_code")
	private String prefectureCode;
	
	@OneToMany(targetEntity = TblCityEntity.class, mappedBy = "id", fetch = FetchType.LAZY)
	private Set<TblCityEntity> tblCityEntities;
	
	
	public Set<TblCityEntity> getTblCityEntities() {
		return tblCityEntities;
	}
	
	public void setTblCityEntities(Set<TblCityEntity> tblCityEntities) {
		this.tblCityEntities = tblCityEntities;
	}
	
	public long getId() {
		return id;
	}
	
	public void setId(long id) {
		this.id = id;
	}
	
	public String getPrefecture() {
		return prefecture;
	}
	
	public void setPrefecture(String prefecture) {
		this.prefecture = prefecture;
	}
	
	public String getPrefectureKana() {
		return prefectureKana;
	}
	
	public void setPrefectureKana(String prefectureKana) {
		this.prefectureKana = prefectureKana;
	}
	
	public String getPrefectureCode() {
		return prefectureCode;
	}
	
	public void setPrefectureCode(String prefectureCode) {
		this.prefectureCode = prefectureCode;
	}
}
