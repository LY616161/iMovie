package com.sixone.imovie.filmmaker.controller;

import com.sixone.imovie.filmmaker.entry.Movie;
import com.sixone.imovie.filmmaker.feign.FeignMovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FeignController {
    @Autowired
    private FeignMovieService feignMovieService;
    @GetMapping("/fallback")
    public String fallback() {
        return "fallback";
    }

    @GetMapping("/movie/{id}")
    public Movie findById(@PathVariable("id") int id){
        return feignMovieService.getUserInfo(id);
    }
}
