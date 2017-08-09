package com.example.starwarsdatabankapi.service;

import com.example.starwarsdatabankapi.model.Movie;
import com.example.starwarsdatabankapi.model.NameIds;
import com.example.starwarsdatabankapi.repository.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class MovieServiceImpl implements MovieService {
    @Autowired
    private MovieRepository movieRepository;

    @Override
    public List<NameIds> getAllMovies() {
        return movieRepository.getAllMovies();
    }

    @Override
    public Movie getMovieById(Long movieId) {
        return movieRepository.findOne(movieId);
    }

    @Override
    public List<NameIds> getEntitiesOfTypeInMovie(Long movieId, String filterTerm) {
        return movieRepository.getEntitesOfTypeInMovie(movieId, filterTerm);
    }
}
