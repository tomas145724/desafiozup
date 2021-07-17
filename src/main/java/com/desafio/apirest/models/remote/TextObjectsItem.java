package com.desafio.apirest.models.remote;

import com.fasterxml.jackson.annotation.JsonProperty;

public class TextObjectsItem{

	@JsonProperty("language")
	private String language;

	@JsonProperty("text")
	private String text;

	@JsonProperty("type")
	private String type;

	public void setLanguage(String language){
		this.language = language;
	}

	public String getLanguage(){
		return language;
	}

	public void setText(String text){
		this.text = text;
	}

	public String getText(){
		return text;
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
			"TextObjectsItem{" + 
			"language = '" + language + '\'' + 
			",text = '" + text + '\'' + 
			",type = '" + type + '\'' + 
			"}";
		}
}