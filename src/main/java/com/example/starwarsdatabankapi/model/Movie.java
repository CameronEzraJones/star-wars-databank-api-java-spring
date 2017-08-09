package com.example.starwarsdatabankapi.model;

import org.neo4j.ogm.annotation.GraphId;
import org.neo4j.ogm.annotation.NodeEntity;

import java.util.Date;
import java.util.List;

@NodeEntity
public class Movie {

    @GraphId
    private Long id;

    private String name;
    private String director;
    private String rating;
    private String runtime;
    private List<String> writers;
    private List<String> stars;
    private Long released;
    private List<String> tags;
    private String crawl;

    public Movie() {};

    protected Movie(Long id, String name, String director, String rating, String runtime, List<String> writers, List<String> stars, Long released, List<String> tags, String crawl) {
        this.id = id;
        this.name = name;
        this.director = director;
        this.rating = rating;
        this.runtime = runtime;
        this.writers = writers;
        this.stars = stars;
        this.released = released;
        this.tags = tags;
        this.crawl = crawl;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public String getRuntime() {
        return runtime;
    }

    public void setRuntime(String runtime) {
        this.runtime = runtime;
    }

    public List<String> getWriters() {
        return writers;
    }

    public void setWriters(List<String> writers) {
        this.writers = writers;
    }

    public List<String> getStars() {
        return stars;
    }

    public void setStars(List<String> stars) {
        this.stars = stars;
    }

    public Long getReleased() {
        return released;
    }

    public void setReleased(Long released) {
        this.released = released;
    }

    public List<String> getTags() {
        return tags;
    }

    public void setTags(List<String> tags) {
        this.tags = tags;
    }

    public String getCrawl() {
        return crawl;
    }

    public void setCrawl(String crawl) {
        this.crawl = crawl;
    }
}
