package com.desafio.apirest.models.remote;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Data{

	@JsonProperty("total")
	private int total;

	@JsonProperty("offset")
	private int offset;

	@JsonProperty("limit")
	private int limit;

	@JsonProperty("count")
	private int count;

	@JsonProperty("results")
	private List<ResultsItem> results;

	public void setTotal(int total){
		this.total = total;
	}

	public int getTotal(){
		return total;
	}

	public void setOffset(int offset){
		this.offset = offset;
	}

	public int getOffset(){
		return offset;
	}

	public void setLimit(int limit){
		this.limit = limit;
	}

	public int getLimit(){
		return limit;
	}

	public void setCount(int count){
		this.count = count;
	}

	public int getCount(){
		return count;
	}

	public void setResults(List<ResultsItem> results){
		this.results = results;
	}

	public List<ResultsItem> getResults(){
		return results;
	}

	@Override
 	public String toString(){
		return 
			"Data{" + 
			"total = '" + total + '\'' + 
			",offset = '" + offset + '\'' + 
			",limit = '" + limit + '\'' + 
			",count = '" + count + '\'' + 
			",results = '" + results + '\'' + 
			"}";
		}
}