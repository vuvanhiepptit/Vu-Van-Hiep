package com.luvina.restfulapi.entities;

import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

import javax.persistence.*;

@Entity
@Table(name = "tbl_area")
public class TblAreaEntity {
	
	@Id
	@Column(name = "area_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@Column(name = "area_kana")
	private String areaKana;
	
	@Column(name = "area")
	private String area;
	
	@Column(name = "chome_area")
	private int chomeArea;
	
	@Column(name = "koaza_area")
	private int koazaArea;
	
	@Column(name = "multi_post_area")
	private int multiPostArea;
	
	@ManyToOne(fetch = FetchType.LAZY, optional = false)
	@JoinColumn(name = "city_id")
	@Fetch(FetchMode.JOIN)
	private TblCityEntity tblCityEntity;
	
	@ManyToOne(fetch = FetchType.LAZY, optional = false)
	@JoinColumn(name = "old_post_id")
	@Fetch(FetchMode.JOIN)
	private TblOldPostEntity tblOldPostEntity;
	
	@ManyToOne(fetch = FetchType.LAZY, optional = false)
	@JoinColumn(name = "post_id")
	@Fetch(FetchMode.JOIN)
	private TblPostEntity tblPostEntity;
	
	
	public String getArea() {
		return area;
	}
	
	public String getAreaKana() {
		return areaKana;
	}
	
	public void setAreaKana(String areaKana) {
		this.areaKana = areaKana;
	}
	
	public void setArea(String area) {
		this.area = area;
	}
	
	public int getChomeArea() {
		return chomeArea;
	}
	
	public void setChomeArea(int chomeArea) {
		this.chomeArea = chomeArea;
	}
	
	public int getKoazaArea() {
		return koazaArea;
	}
	
	public void setKoazaArea(int koazaArea) {
		this.koazaArea = koazaArea;
	}
	
	public int getMultiPostArea() {
		return multiPostArea;
	}
	
	public void setMultiPostArea(int multiPostArea) {
		this.multiPostArea = multiPostArea;
	}
	
	public TblCityEntity getTblCityEntity() {
		return tblCityEntity;
	}
	
	public void setTblCityEntity(TblCityEntity tblCityEntity) {
		this.tblCityEntity = tblCityEntity;
	}
	
	public TblOldPostEntity getTblOldPostEntity() {
		return tblOldPostEntity;
	}
	
	public void setTblOldPostEntity(TblOldPostEntity tblOldPostEntity) {
		this.tblOldPostEntity = tblOldPostEntity;
	}
	
	public TblPostEntity getTblPostEntity() {
		return tblPostEntity;
	}
	
	public void setTblPostEntity(TblPostEntity tblPostEntity) {
		this.tblPostEntity = tblPostEntity;
	}
	

}
