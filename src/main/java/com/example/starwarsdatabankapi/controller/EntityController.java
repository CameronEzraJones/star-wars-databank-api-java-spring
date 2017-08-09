package com.example.starwarsdatabankapi.controller;

import com.example.starwarsdatabankapi.model.StarWarsEntity;
import com.example.starwarsdatabankapi.service.EntityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "/entity")
public class EntityController {
    @Autowired
    EntityService entityService;

    @RequestMapping(value = "/{entityId}")
    ResponseEntity<StarWarsEntity> getEntityById(@PathVariable Long entityId) {
        StarWarsEntity entity = entityService.getEntityById(entityId);
        if(entity == null) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(null);
        }
        return ResponseEntity.status(HttpStatus.OK).body(entity);
    }
}
