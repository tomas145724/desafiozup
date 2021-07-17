package com.desafio.apirest.models.remote;

import com.fasterxml.jackson.annotation.JsonProperty;

public class DatesItem{

	@JsonProperty("date")
	private String date;

	@JsonProperty("type")
	private String type;

	public void setDate(String date){
		this.date = date;
	}

	public String getDate(){
		return date;
	}

	public void setType(String type){
		this.type = type;
	}

	public String getType(){
		return type;
	}

	@Override
 	public String toString(){
		return 
			"DatesItem{" + 
			"date = '" + date + '\'' + 
			",type = '" + type + '\'' + 
			"}";
		}
}