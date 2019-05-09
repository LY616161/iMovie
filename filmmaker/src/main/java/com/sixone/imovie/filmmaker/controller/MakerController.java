package com.sixone.imovie.filmmaker.controller;

import com.sixone.imovie.filmmaker.entry.FilmMaker;
import com.sixone.imovie.filmmaker.service.FilmMakerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/maker")
public class MakerController {
    @Autowired
    private FilmMakerService filmMakerService;

    @GetMapping("/test")
    public String test(){
        return "test";
    }

    @GetMapping("/{id}")
    public FilmMaker getMaker(@PathVariable("id") int id){
        return filmMakerService.getMaker(id);
    }
}
