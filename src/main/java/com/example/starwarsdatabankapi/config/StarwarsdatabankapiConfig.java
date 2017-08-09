package com.example.starwarsdatabankapi.config;

import com.example.starwarsdatabankapi.service.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class StarwarsdatabankapiConfig {
    @Bean
    public TvShowService showService() {
        return new TvShowServiceImpl();
    }

    @Bean
    public MovieService movieService() {
        return new MovieServiceImpl();
    }

    @Bean
    public EntityService entityService() {
        return new EntityServiceImpl();
    }
}
