package com.example.starwarsdatabankapi.repository;

import com.example.starwarsdatabankapi.model.StarWarsEntity;
import org.springframework.data.neo4j.annotation.Query;
import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.data.repository.query.Param;

public interface EntityRepository extends Neo4jRepository<Object, Long>{
    @Query("MATCH (n) WHERE ID(n) = {entityId} AND NOT \"TvShow\" IN Labels(n) AND NOT \"Movie\" IN Labels(n) RETURN" +
            " ID(n) as id," +
            " n.name as name," +
            " n.description as description," +
            " n.image_link as image_link," +
            " n.databank_link as databank_link")
    StarWarsEntity getEntityById(@Param("entityId") Long entityId);
}
