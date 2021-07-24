package com.desafio.apirest.models.remote;

import com.fasterxml.jackson.annotation.JsonProperty;

public class PricesItem{

	@JsonProperty("price")
	private double price;

	@JsonProperty("type")
	private String type;

	public void setPrice(double price){
		this.price = price;
	}

	public double getPrice(){
		return price;
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
			"PricesItem{" + 
			"price = '" + price + '\'' + 
			",type = '" + type + '\'' + 
			"}";
		}
}