package com.sixone.imovie.movie.controller;

import com.sixone.imovie.movie.entity.Movie;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController()
public class MovieController {

    @GetMapping("/movie/{id}")
    public Movie getMovie(@PathVariable("id") int id){
        Movie movie = new Movie();
        movie.setId(id);
        movie.setName("黑暗骑士");
        return movie;
    }

}
