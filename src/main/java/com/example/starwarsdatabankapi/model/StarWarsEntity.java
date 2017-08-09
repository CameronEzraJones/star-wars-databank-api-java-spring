package com.example.starwarsdatabankapi.model;

import org.springframework.data.neo4j.annotation.QueryResult;

@QueryResult
public class StarWarsEntity {
    Long id;
    String name;
    String description;
    String image_link;
    String databank_link;

    public StarWarsEntity() {
    }

    public StarWarsEntity(Long id, String name, String description, String image_link, String databank_link) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.image_link = image_link;
        this.databank_link = databank_link;
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getImage_link() {
        return image_link;
    }

    public void setImage_link(String image_link) {
        this.image_link = image_link;
    }

    public String getDatabank_link() {
        return databank_link;
    }

    public void setDatabank_link(String databank_link) {
        this.databank_link = databank_link;
    }
}
