package com.desafio.apirest.models.remote;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Stories{

	@JsonProperty("collectionURI")
	private String collectionURI;

	@JsonProperty("available")
	private int available;

	@JsonProperty("returned")
	private int returned;

	@JsonProperty("items")
	private List<ItemsItem> items;

	public void setCollectionURI(String collectionURI){
		this.collectionURI = collectionURI;
	}

	public String getCollectionURI(){
		return collectionURI;
	}

	public void setAvailable(int available){
		this.available = available;
	}

	public int getAvailable(){
		return available;
	}

	public void setReturned(int returned){
		this.returned = returned;
	}

	public int getReturned(){
		return returned;
	}

	public void setItems(List<ItemsItem> items){
		this.items = items;
	}

	public List<ItemsItem> getItems(){
		return items;
	}

	@Override
 	public String toString(){
		return 
			"Stories{" + 
			"collectionURI = '" + collectionURI + '\'' + 
			",available = '" + available + '\'' + 
			",returned = '" + returned + '\'' + 
			",items = '" + items + '\'' + 
			"}";
		}
}