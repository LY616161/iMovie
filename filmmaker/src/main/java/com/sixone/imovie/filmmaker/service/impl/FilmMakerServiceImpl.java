package com.sixone.imovie.filmmaker.service.impl;

import com.sixone.imovie.filmmaker.entry.FilmMaker;
import com.sixone.imovie.filmmaker.mapper.FilmMakerMapper;
import com.sixone.imovie.filmmaker.service.FilmMakerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FilmMakerServiceImpl implements FilmMakerService{
    @Autowired
    private FilmMakerMapper filmMakerMapper;


    @Override
    public void insertMaker(FilmMaker maker) {

    }

    @Override
    public FilmMaker getMaker(int id) {
        FilmMaker filmMaker = filmMakerMapper.getMaker(id);
        return filmMaker;
    }
}
