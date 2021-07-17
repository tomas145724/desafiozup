package com.desafio.apirest.models.remote;

import com.fasterxml.jackson.annotation.JsonProperty;

public class CollectedIssuesItem{

	@JsonProperty("name")
	private String name;

	@JsonProperty("resourceURI")
	private String resourceURI;

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

	@Override
 	public String toString(){
		return 
			"CollectedIssuesItem{" + 
			"name = '" + name + '\'' + 
			",resourceURI = '" + resourceURI + '\'' + 
			"}";
		}
}