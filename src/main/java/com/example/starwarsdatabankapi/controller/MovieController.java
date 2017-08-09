package com.example.starwarsdatabankapi.controller;

import com.example.starwarsdatabankapi.model.Movie;
import com.example.starwarsdatabankapi.model.NameIds;
import com.example.starwarsdatabankapi.service.MovieService;
import com.example.starwarsdatabankapi.util.StarwarsdatabankapiException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.Arrays;
import java.util.List;

@Controller
@RequestMapping(value = "/movie")
public class MovieController {
    @Autowired
    private MovieService movieService;

    @Value("${starwarsdatabankapi.core.filterterms}")
    private String[] filterTerms;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public ResponseEntity<List<NameIds>> getAllMovies() {
        return ResponseEntity.status(HttpStatus.OK).body(movieService.getAllMovies());
    }

    @RequestMapping(value = "/{movieId}", method = RequestMethod.GET)
    public ResponseEntity<Movie> getMovieById(@PathVariable Long movieId) {
        Movie movie = movieService.getMovieById(movieId);
        if(movie == null) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(null);
        }
        return ResponseEntity.status(HttpStatus.OK).body(movie);
    }

    @RequestMapping(value = "/{movieId}/{filterTerm}", method = RequestMethod.GET)
    public ResponseEntity<List<NameIds>> getEntitiesOfTypeInMovie(@PathVariable Long movieId, @PathVariable String filterTerm) throws StarwarsdatabankapiException {
        if(Arrays.asList(filterTerms).indexOf(filterTerm) < 0) {
            throw new StarwarsdatabankapiException("Invalid filter term");
        }
        List<NameIds> entities = movieService.getEntitiesOfTypeInMovie(movieId, filterTerm);
        if(entities.size() <= 0) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(null);
        }
        return ResponseEntity.status(HttpStatus.OK).body(entities);
    }
}
