package com.desafio.apirest.models.remote;

import com.fasterxml.jackson.annotation.JsonProperty;

public class UrlsItem{

	@JsonProperty("type")
	private String type;

	@JsonProperty("url")
	private String url;

	public void setType(String type){
		this.type = type;
	}

	public String getType(){
		return type;
	}

	public void setUrl(String url){
		this.url = url;
	}

	public String getUrl(){
		return url;
	}

	@Override
 	public String toString(){
		return 
			"UrlsItem{" + 
			"type = '" + type + '\'' + 
			",url = '" + url + '\'' + 
			"}";
		}
}