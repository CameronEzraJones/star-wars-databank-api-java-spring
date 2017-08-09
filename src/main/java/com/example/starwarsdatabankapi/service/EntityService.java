package com.example.starwarsdatabankapi.service;

import com.example.starwarsdatabankapi.model.StarWarsEntity;

public interface EntityService {
    StarWarsEntity getEntityById(Long entityId);
}
