package com.example.starwarsdatabankapi.repository;

import com.example.starwarsdatabankapi.model.Movie;
import com.example.starwarsdatabankapi.model.NameIds;
import org.springframework.data.neo4j.annotation.Query;
import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface MovieRepository extends Neo4jRepository<Movie, Long> {
    @Query("MATCH (n:Movie) RETURN n.name as name, ID(n) as id")
    List<NameIds> getAllMovies();

    @Query("MATCH (n:Movie)<-[:Appearances]-(b) WHERE ID(n) = {movieId} AND {filterTerm} IN LABELS(b) RETURN b.name as name, ID(b) as id")
    List<NameIds> getEntitesOfTypeInMovie(@Param("movieId") Long movieId, @Param("filterTerm") String filterTerm);
}
