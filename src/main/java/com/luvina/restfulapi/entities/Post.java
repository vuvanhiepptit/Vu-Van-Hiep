package com.luvina.restfulapi.entities;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Post {
	
	@JsonProperty("code")
	private String code;
	
	@JsonProperty("city")
	private String city;
	
	@JsonProperty("city_kana")
	private String cityKana;
	
	@JsonProperty("prefecture")
	private String prefecture;
	
	@JsonProperty("prefecture_kana")
	private String prefectureKana;
	
	@JsonProperty("prefecture_code")
	private String prefectureCode;
	
	@JsonProperty("area")
	private String area;
	
	@JsonProperty("area_kana")
	private String areaKana;
	
	@JsonProperty("multi_post_area")
	private int multiPostArea;
	
	@JsonProperty("koaza_area")
	private int koazaArea;
	
	@JsonProperty("chome_area")
	private int chomeArea;
	
	@JsonProperty("old_post_code")
	private String oldPostCode;
	
	@JsonProperty("post_code")
	private String postCode;
	
	@JsonProperty("multi_area")
	private int multiArea;
	
	@JsonProperty("update_show")
	private int updateShow;
	
	@JsonProperty("change_reason")
	private int changeReason;
	
	
	public Post(String code, String city, String cityKana, String prefecture, String prefectureKana,
			String prefectureCode, String area, String areaKana, int multiPostArea, int koazaArea, int chomeArea,
			String oldPostCode, String postCode, int multiArea, int updateShow, int changeReason) {
		this.code = code;
		this.city = city;
		this.cityKana = cityKana;
		this.prefecture = prefecture;
		this.prefectureKana = prefectureKana;
		this.prefectureCode = prefectureCode;
		this.area = area;
		this.areaKana = areaKana;
		this.multiPostArea = multiPostArea;
		this.koazaArea = koazaArea;
		this.chomeArea = chomeArea;
		this.oldPostCode = oldPostCode;
		this.postCode = postCode;
		this.multiArea = multiArea;
		this.updateShow = updateShow;
		this.changeReason = changeReason;
	}
	
	public String getCode() {
		return code;
	}
	
	public void setCode(String code) {
		this.code = code;
	}
	
	public String getCity() {
		return city;
	}
	
	public void setCity(String city) {
		this.city = city;
	}
	
	public String getCityKana() {
		return cityKana;
	}
	
	public void setCityKana(String cityKana) {
		this.cityKana = cityKana;
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
	
	public String getArea() {
		return area;
	}
	
	public void setArea(String area) {
		this.area = area;
	}
	
	public String getAreaKana() {
		return areaKana;
	}
	
	public void setAreaKana(String areaKana) {
		this.areaKana = areaKana;
	}
	
	public int getMultiPostArea() {
		return multiPostArea;
	}
	
	public void setMultiPostArea(int multiPostArea) {
		this.multiPostArea = multiPostArea;
	}
	
	public int getKoazaArea() {
		return koazaArea;
	}
	
	public void setKoazaArea(int koazaArea) {
		this.koazaArea = koazaArea;
	}
	
	public int getChomeArea() {
		return chomeArea;
	}
	
	public void setChomeArea(int chomeArea) {
		this.chomeArea = chomeArea;
	}
	
	public String getOldPostCode() {
		return oldPostCode;
	}
	
	public void setOldPostCode(String oldPostCode) {
		this.oldPostCode = oldPostCode;
	}
	
	public String getPostCode() {
		return postCode;
	}
	
	public void setPostCode(String postCode) {
		this.postCode = postCode;
	}
	
	public int getMultiArea() {
		return multiArea;
	}
	
	public void setMultiArea(int multiArea) {
		this.multiArea = multiArea;
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
}
