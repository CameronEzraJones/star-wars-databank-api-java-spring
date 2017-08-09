package com.example.starwarsdatabankapi.repository;

import com.example.starwarsdatabankapi.model.NameIds;
import com.example.starwarsdatabankapi.model.TvShow;
import org.springframework.data.neo4j.annotation.Query;
import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TvShowRepository extends Neo4jRepository<TvShow, Long> {
    @Query("MATCH (n:TvShow) RETURN n.name as name, ID(n) as id")
    List<NameIds> getAllTvShows();

    @Query("MATCH (n:TvShow)<-[:Appearances]-(b) WHERE ID(n) = {tvShowId} AND {filterTerm} IN LABELS(b) RETURN b.name as name, ID(b) as id")
    List<NameIds> getEntitiesByTypeInShow(@Param("tvShowId") Long tvShowId, @Param("filterTerm") String filterTerm);
}
