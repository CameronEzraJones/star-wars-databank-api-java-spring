package com.example.starwarsdatabankapi.controller;

import com.example.starwarsdatabankapi.model.NameIds;
import com.example.starwarsdatabankapi.model.TvShow;
import com.example.starwarsdatabankapi.service.TvShowService;
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
@RequestMapping(value = "/show")
public class TvShowController {
    @Autowired
    private TvShowService tvShowService;

    @Value("${starwarsdatabankapi.core.filterterms}")
    private String[] filterTerms;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public ResponseEntity<List<NameIds>> getAllShows() {
        return ResponseEntity.status(HttpStatus.OK).body(tvShowService.getAllShows());
    }

    @RequestMapping(value = "/{tvShowId}", method = RequestMethod.GET)
    public ResponseEntity<TvShow> getShowById(@PathVariable Long tvShowId) {
        TvShow show = tvShowService.getShowById(tvShowId);
        if(show == null) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(null);
        }
        return ResponseEntity.status(HttpStatus.OK).body(tvShowService.getShowById(tvShowId));
    }

    @RequestMapping(value = "/{tvShowId}/{filterTerm}", method = RequestMethod.GET)
    public ResponseEntity<List<NameIds>> getEntitiesOfTypeInShow(@PathVariable Long tvShowId, @PathVariable String filterTerm) throws StarwarsdatabankapiException {
        if(Arrays.asList(filterTerms).indexOf(filterTerm) < 0) {
            throw new StarwarsdatabankapiException("Invalid filter term");
        }
        List<NameIds> entities = tvShowService.getEntitiesOfTypeInShow(tvShowId, filterTerm);
        if(entities.size() <= 0) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(null);
        }
        return ResponseEntity.status(HttpStatus.OK).body(entities);
    }
}
