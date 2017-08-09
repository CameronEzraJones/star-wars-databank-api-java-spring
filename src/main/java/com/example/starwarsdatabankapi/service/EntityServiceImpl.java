package com.example.starwarsdatabankapi.service;

import com.example.starwarsdatabankapi.model.StarWarsEntity;
import com.example.starwarsdatabankapi.repository.EntityRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class EntityServiceImpl implements EntityService {
    @Autowired
    private EntityRepository entityRepository;

    @Override
    public StarWarsEntity getEntityById(Long entityId) {
        return entityRepository.getEntityById(entityId);
    }
}
