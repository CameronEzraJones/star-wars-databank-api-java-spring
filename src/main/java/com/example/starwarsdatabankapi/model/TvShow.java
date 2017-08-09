package com.example.starwarsdatabankapi.model;

import org.neo4j.ogm.annotation.GraphId;
import org.neo4j.ogm.annotation.NodeEntity;
import org.springframework.data.neo4j.annotation.QueryResult;

import java.util.List;

@NodeEntity
public class TvShow {
    @GraphId
    private Long id;

    private String name;
    private List<String> creators;
    private Integer show_start;
    private Integer show_end;
    private String runtime;
    private String rating;
    private List<String> stars;
    private Integer seasons;
    private Integer number_episodes;
    private List<String> tags;

    public TvShow() {
    }

    protected TvShow(Long id, String name, List<String> creators, Integer show_start, Integer show_end, String runtime, String rating, List<String> stars, Integer seasons, Integer number_episodes, List<String> tags) {
        this.id = id;
        this.name = name;
        this.creators = creators;
        this.show_start = show_start;
        this.show_end = show_end;
        this.runtime = runtime;
        this.rating = rating;
        this.stars = stars;
        this.seasons = seasons;
        this.number_episodes = number_episodes;
        this.tags = tags;
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

    public List<String> getCreators() {
        return creators;
    }

    public void setCreators(List<String> creators) {
        this.creators = creators;
    }

    public Integer getShow_start() {
        return show_start;
    }

    public void setShow_start(Integer show_start) {
        this.show_start = show_start;
    }

    public Integer getShow_end() {
        return show_end;
    }

    public void setShow_end(Integer show_end) {
        this.show_end = show_end;
    }

    public String getRuntime() {
        return runtime;
    }

    public void setRuntime(String runtime) {
        this.runtime = runtime;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public List<String> getStars() {
        return stars;
    }

    public void setStars(List<String> stars) {
        this.stars = stars;
    }

    public Integer getSeasons() {
        return seasons;
    }

    public void setSeasons(Integer seasons) {
        this.seasons = seasons;
    }

    public Integer getNumber_episodes() {
        return number_episodes;
    }

    public void setNumber_episodes(Integer number_episodes) {
        this.number_episodes = number_episodes;
    }

    public List<String> getTags() {
        return tags;
    }

    public void setTags(List<String> tags) {
        this.tags = tags;
    }
}
