package com.sixone.imovie.filmmaker.service;


import com.sixone.imovie.filmmaker.entry.FilmMaker;

public interface FilmMakerService {

    void insertMaker (FilmMaker maker);

    FilmMaker getMaker(int id);
}
