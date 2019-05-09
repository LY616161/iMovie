package com.sixone.imovie.filmmaker.mapper;

import com.sixone.imovie.filmmaker.entry.FilmMaker;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface FilmMakerMapper {
    @Insert("INSERT INTO maker(name,age) VALUES ('克里斯托弗诺兰',50)")
    void insertMaker (FilmMaker maker);

    @Select("SELECT id, name, profession, age, birth,create_date as createDate FROM maker where id = #{id}")
    FilmMaker getMaker(@Param("id") int id);

}
