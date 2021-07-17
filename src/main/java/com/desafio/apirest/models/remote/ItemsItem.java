package com.desafio.apirest.models.remote;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ItemsItem{

	@JsonProperty("name")
	private String name;

	@JsonProperty("resourceURI")
	private String resourceURI;

	@JsonProperty("type")
	private String type;

	public void setName(String name){
		this.name = name;
	}

	public String getName(){
		return name;
	}

	public void setResourceURI(String resourceURI){
		this.resourceURI = resourceURI;
	}

	public String getResourceURI(){
		return resourceURI;
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
			"ItemsItem{" + 
			"name = '" + name + '\'' + 
			",resourceURI = '" + resourceURI + '\'' + 
			",type = '" + type + '\'' + 
			"}";
		}
}