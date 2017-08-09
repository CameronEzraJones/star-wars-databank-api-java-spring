package com.example.starwarsdatabankapi.service;

import com.example.starwarsdatabankapi.model.NameIds;
import com.example.starwarsdatabankapi.model.TvShow;
import com.example.starwarsdatabankapi.repository.TvShowRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class TvShowServiceImpl implements TvShowService {
    @Autowired
    private TvShowRepository tvShowRepository;

    @Override
    public List<NameIds> getAllShows() {
        return tvShowRepository.getAllTvShows();
    }

    @Override
    public TvShow getShowById(Long tvShowId) {
        return tvShowRepository.findOne(tvShowId);
    }

    @Override
    public List<NameIds> getEntitiesOfTypeInShow(Long tvShowId, String filterTerm) {
        return tvShowRepository.getEntitiesByTypeInShow(tvShowId, filterTerm);
    }
}
