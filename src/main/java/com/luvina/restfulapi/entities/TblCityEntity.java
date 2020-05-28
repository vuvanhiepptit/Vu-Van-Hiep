package com.luvina.restfulapi.entities;

import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "tbl_city")
public class TblCityEntity {
	
	@Id
	@Column(name = "city_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@Column(name = "code")
	private String code;
	
	@Column(name = "city_kana")
	private String cityKana;
	
	@Column(name = "city")
	private String city;
	
	@ManyToOne(fetch = FetchType.LAZY, optional = false)
	@JoinColumn(name = "prefecture_id")
	@Fetch(FetchMode.JOIN)
	private TblPrefectureEntity tblPrefectureEntity;
	
	@OneToMany(targetEntity = TblAreaEntity.class, mappedBy = "id", fetch = FetchType.LAZY)
	private Set<TblAreaEntity> tblAreaEntities;
	
	
	public long getId() {
		return id;
	}
	
	public void setId(long id) {
		this.id = id;
	}
	
	public String getCode() {
		return code;
	}
	
	public void setCode(String code) {
		this.code = code;
	}
	
	public String getCityKana() {
		return cityKana;
	}
	
	public void setCityKana(String cityKana) {
		this.cityKana = cityKana;
	}
	
	public String getCity() {
		return city;
	}
	
	public void setCity(String city) {
		this.city = city;
	}
	
	public TblPrefectureEntity getTblPrefectureEntity() {
		return tblPrefectureEntity;
	}
	
	public void setTblPrefectureEntity(TblPrefectureEntity tblPrefectureEntity) {
		this.tblPrefectureEntity = tblPrefectureEntity;
	}
	
	public Set<TblAreaEntity> getTblAreaEntities() {
		return tblAreaEntities;
	}
	
	public void setTblAreaEntities(Set<TblAreaEntity> tblAreaEntities) {
		this.tblAreaEntities = tblAreaEntities;
	}
}
