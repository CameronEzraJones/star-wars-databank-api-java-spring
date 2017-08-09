package com.example.starwarsdatabankapi.service;

import com.example.starwarsdatabankapi.model.NameIds;
import com.example.starwarsdatabankapi.model.TvShow;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface TvShowService {
    public List<NameIds> getAllShows();

    TvShow getShowById(Long tvShowId);

    List<NameIds> getEntitiesOfTypeInShow(Long tvShowId, String filterTerm);
}
