package com.desafio.apirest.models.local;



import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import lombok.Builder;
import lombok.Data;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.*;

@Entity(name = "ComicsMarvel")
@Data

@JsonDeserialize(as = ComicsMarvel.class)

public class ComicsMarvel  {


    @Id
    private int id;
    private String title;
    private String description;
    private String isbn;
    private ArrayList<Double> prices;
    private ArrayList<String> creators;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public ArrayList<Double> getPrices() {
        return prices;
    }

    public void setPrices(ArrayList<Double> prices) {
        this.prices = prices;
    }

    public List<String> getCreators() {
        return creators;
    }

    public void setCreators(ArrayList<String> creators) {
        this.creators = creators;
    }

    public ComicsMarvel(int id, String title, String description, String isbn, ArrayList<Double> prices, ArrayList<String> creators) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.isbn = isbn;
        this.prices = prices;
        this.creators = creators;
    }

    public ComicsMarvel() {
    }

    @Override
    public String toString() {
        return "ComicsMarvel{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", isbn='" + isbn + '\'' +
                ", prices=" + prices +
                ", creators=" + creators +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;

        if (!(o instanceof ComicsMarvel)) return false;

        ComicsMarvel that = (ComicsMarvel) o;

        return new EqualsBuilder().append(getId(), that.getId()).append(getTitle(), that.getTitle()).append(getDescription(), that.getDescription()).append(getIsbn(), that.getIsbn()).append(getPrices(), that.getPrices()).append(getCreators(), that.getCreators()).isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(getId()).append(getTitle()).append(getDescription()).append(getIsbn()).append(getPrices()).append(getCreators()).toHashCode();
    }
}
