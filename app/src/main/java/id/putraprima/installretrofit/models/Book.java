package id.putraprima.installretrofit.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by putraprima on 04/11/17.
 */

public class Book {

    @SerializedName("url")
    @Expose
    private String url;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("isbn")
    @Expose
    private String isbn;
    @SerializedName("authors")
    @Expose
    private List<String> authors = null;
    @SerializedName("numberOfPages")
    @Expose
    private Integer numberOfPages;
    @SerializedName("publisher")
    @Expose
    private String publisher;
    @SerializedName("country")
    @Expose
    private String country;
    @SerializedName("mediaType")
    @Expose
    private String mediaType;
    @SerializedName("released")
    @Expose
    private String released;
    @SerializedName("characters")
    @Expose
    private List<String> characters = null;
    @SerializedName("povCharacters")
    @Expose
    private List<String> povCharacters = null;

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public List<String> getAuthors() {
        return authors;
    }

    public void setAuthors(List<String> authors) {
        this.authors = authors;
    }

    public Integer getNumberOfPages() {
        return numberOfPages;
    }

    public void setNumberOfPages(Integer numberOfPages) {
        this.numberOfPages = numberOfPages;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getMediaType() {
        return mediaType;
    }

    public void setMediaType(String mediaType) {
        this.mediaType = mediaType;
    }

    public String getReleased() {
        return released;
    }

    public void setReleased(String released) {
        this.released = released;
    }

    public List<String> getCharacters() {
        return characters;
    }

    public void setCharacters(List<String> characters) {
        this.characters = characters;
    }

    public List<String> getPovCharacters() {
        return povCharacters;
    }

    public void setPovCharacters(List<String> povCharacters) {
        this.povCharacters = povCharacters;
    }

}

