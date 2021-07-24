package com.desafio.apirest.models.remote;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

public class ResultsItem{

	@JsonProperty("creators")
	private Creators creators;

	@JsonProperty("issueNumber")
	private int issueNumber;

	@JsonProperty("isbn")
	private String isbn;

	@JsonProperty("description")
	private Object description;

	@JsonProperty("variants")
	private List<VariantsItem> variants;

	@JsonProperty("title")
	private String title;

	@JsonProperty("diamondCode")
	private String diamondCode;

	@JsonProperty("characters")
	private Characters characters;

	@JsonProperty("urls")
	private List<UrlsItem> urls;

	@JsonProperty("ean")
	private String ean;

	@JsonProperty("collections")
	private List<Object> collections;

	@JsonProperty("modified")
	private String modified;

	@JsonProperty("id")
	private int id;

	@JsonProperty("prices")
	private List<PricesItem> prices;

	@JsonProperty("events")
	private Events events;

	@JsonProperty("collectedIssues")
	private List<Object> collectedIssues;

	@JsonProperty("pageCount")
	private int pageCount;

	@JsonProperty("thumbnail")
	private Thumbnail thumbnail;

	@JsonProperty("images")
	private List<Object> images;

	@JsonProperty("stories")
	private Stories stories;

	@JsonProperty("textObjects")
	private List<Object> textObjects;

	@JsonProperty("digitalId")
	private int digitalId;

	@JsonProperty("format")
	private String format;

	@JsonProperty("upc")
	private String upc;

	@JsonProperty("dates")
	private List<DatesItem> dates;

	@JsonProperty("resourceURI")
	private String resourceURI;

	@JsonProperty("variantDescription")
	private String variantDescription;

	@JsonProperty("issn")
	private String issn;

	@JsonProperty("series")
	private Series series;

	public void setCreators(Creators creators){
		this.creators = creators;
	}

	public Creators getCreators(){
		return creators;
	}

	public void setIssueNumber(int issueNumber){
		this.issueNumber = issueNumber;
	}

	public int getIssueNumber(){
		return issueNumber;
	}

	public void setIsbn(String isbn){
		this.isbn = isbn;
	}

	public String getIsbn(){
		return isbn;
	}

	public void setDescription(Object description){
		this.description = description;
	}

	public Object getDescription(){
		return description;
	}

	public void setVariants(List<VariantsItem> variants){
		this.variants = variants;
	}

	public List<VariantsItem> getVariants(){
		return variants;
	}

	public void setTitle(String title){
		this.title = title;
	}

	public String getTitle(){
		return title;
	}

	public void setDiamondCode(String diamondCode){
		this.diamondCode = diamondCode;
	}

	public String getDiamondCode(){
		return diamondCode;
	}

	public void setCharacters(Characters characters){
		this.characters = characters;
	}

	public Characters getCharacters(){
		return characters;
	}

	public void setUrls(List<UrlsItem> urls){
		this.urls = urls;
	}

	public List<UrlsItem> getUrls(){
		return urls;
	}

	public void setEan(String ean){
		this.ean = ean;
	}

	public String getEan(){
		return ean;
	}

	public void setCollections(List<Object> collections){
		this.collections = collections;
	}

	public List<Object> getCollections(){
		return collections;
	}

	public void setModified(String modified){
		this.modified = modified;
	}

	public String getModified(){
		return modified;
	}

	public void setId(int id){
		this.id = id;
	}

	public int getId(){
		return id;
	}

	public void setPrices(List<PricesItem> prices){
		this.prices = prices;
	}

	public List<PricesItem> getPrices(){
		return prices;
	}

	public void setEvents(Events events){
		this.events = events;
	}

	public Events getEvents(){
		return events;
	}

	public void setCollectedIssues(List<Object> collectedIssues){
		this.collectedIssues = collectedIssues;
	}

	public List<Object> getCollectedIssues(){
		return collectedIssues;
	}

	public void setPageCount(int pageCount){
		this.pageCount = pageCount;
	}

	public int getPageCount(){
		return pageCount;
	}

	public void setThumbnail(Thumbnail thumbnail){
		this.thumbnail = thumbnail;
	}

	public Thumbnail getThumbnail(){
		return thumbnail;
	}

	public void setImages(List<Object> images){
		this.images = images;
	}

	public List<Object> getImages(){
		return images;
	}

	public void setStories(Stories stories){
		this.stories = stories;
	}

	public Stories getStories(){
		return stories;
	}

	public void setTextObjects(List<Object> textObjects){
		this.textObjects = textObjects;
	}

	public List<Object> getTextObjects(){
		return textObjects;
	}

	public void setDigitalId(int digitalId){
		this.digitalId = digitalId;
	}

	public int getDigitalId(){
		return digitalId;
	}

	public void setFormat(String format){
		this.format = format;
	}

	public String getFormat(){
		return format;
	}

	public void setUpc(String upc){
		this.upc = upc;
	}

	public String getUpc(){
		return upc;
	}

	public void setDates(List<DatesItem> dates){
		this.dates = dates;
	}

	public List<DatesItem> getDates(){
		return dates;
	}

	public void setResourceURI(String resourceURI){
		this.resourceURI = resourceURI;
	}

	public String getResourceURI(){
		return resourceURI;
	}

	public void setVariantDescription(String variantDescription){
		this.variantDescription = variantDescription;
	}

	public String getVariantDescription(){
		return variantDescription;
	}

	public void setIssn(String issn){
		this.issn = issn;
	}

	public String getIssn(){
		return issn;
	}

	public void setSeries(Series series){
		this.series = series;
	}

	public Series getSeries(){
		return series;
	}

	@Override
 	public String toString(){
		return 
			"ResultsItem{" + 
			"creators = '" + creators + '\'' + 
			",issueNumber = '" + issueNumber + '\'' + 
			",isbn = '" + isbn + '\'' + 
			",description = '" + description + '\'' + 
			",variants = '" + variants + '\'' + 
			",title = '" + title + '\'' + 
			",diamondCode = '" + diamondCode + '\'' + 
			",characters = '" + characters + '\'' + 
			",urls = '" + urls + '\'' + 
			",ean = '" + ean + '\'' + 
			",collections = '" + collections + '\'' + 
			",modified = '" + modified + '\'' + 
			",id = '" + id + '\'' + 
			",prices = '" + prices + '\'' + 
			",events = '" + events + '\'' + 
			",collectedIssues = '" + collectedIssues + '\'' + 
			",pageCount = '" + pageCount + '\'' + 
			",thumbnail = '" + thumbnail + '\'' + 
			",images = '" + images + '\'' + 
			",stories = '" + stories + '\'' + 
			",textObjects = '" + textObjects + '\'' + 
			",digitalId = '" + digitalId + '\'' + 
			",format = '" + format + '\'' + 
			",upc = '" + upc + '\'' + 
			",dates = '" + dates + '\'' + 
			",resourceURI = '" + resourceURI + '\'' + 
			",variantDescription = '" + variantDescription + '\'' + 
			",issn = '" + issn + '\'' + 
			",series = '" + series + '\'' + 
			"}";
		}
}