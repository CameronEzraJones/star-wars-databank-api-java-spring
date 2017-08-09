package com.example.starwarsdatabankapi.service;

import com.example.starwarsdatabankapi.model.Movie;
import com.example.starwarsdatabankapi.model.NameIds;

import java.util.List;

public interface MovieService {
    List<NameIds> getAllMovies();

    Movie getMovieById(Long movieId);

    List<NameIds> getEntitiesOfTypeInMovie(Long movieId, String filterTerm);
}
