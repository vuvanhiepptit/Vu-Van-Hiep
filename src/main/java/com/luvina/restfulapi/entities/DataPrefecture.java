package com.luvina.restfulapi.entities;

import java.util.List;

public class DataPrefecture {
	
	private List<Prefecture> data;
	
	private String result;
	
	
	public DataPrefecture(List<Prefecture> data) {
		this.data = data;
		this.result = "success";
	}
	
	public String getResult() {
		return result;
	}
	
	public void setResult(String result) {
		this.result = result;
	}
	
	public void setData(List<Prefecture> data) {
		this.data = data;
	}
	
	public List<Prefecture> getData() {
		return data;
	}
}
