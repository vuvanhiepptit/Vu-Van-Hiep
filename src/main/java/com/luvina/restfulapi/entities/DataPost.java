package com.luvina.restfulapi.entities;

import java.util.List;

public class DataPost {
	
	private List<Post> data;
	
	private String result;

	public DataPost(List<Post> data, String result) {
		this.data = data;
		this.result = result;
	}
	
	public List<Post> getData() {
		return data;
	}
	
	public void setData(List<Post> data) {
		this.data = data;
	}
	
	public String getResult() {
		return result;
	}
	
	public void setResult(String result) {
		this.result = result;
	}
}
