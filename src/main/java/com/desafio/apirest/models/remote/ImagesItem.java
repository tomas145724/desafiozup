package com.desafio.apirest.models.remote;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ImagesItem{

	@JsonProperty("path")
	private String path;

	@JsonProperty("extension")
	private String extension;

	public void setPath(String path){
		this.path = path;
	}

	public String getPath(){
		return path;
	}

	public void setExtension(String extension){
		this.extension = extension;
	}

	public String getExtension(){
		return extension;
	}

	@Override
 	public String toString(){
		return 
			"ImagesItem{" + 
			"path = '" + path + '\'' + 
			",extension = '" + extension + '\'' + 
			"}";
		}
}