package com.example.starwarsdatabankapi.model;

import org.springframework.data.neo4j.annotation.QueryResult;

@QueryResult
public class NameIds {
    private String name;
    private Long id;

    public NameIds() {
    }

    public NameIds(String name, Long id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
