package com.gzw.mapper;

import com.gzw.domain.Category;
import com.gzw.domain.Chapter;
import com.gzw.domain.MainInfo;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

/**
 * Created by gzw on 2017/4/1.
 */
public interface MainMapper {

    //获取全部书籍
    @Select("select * from articlemain")
    public MainInfo[] getMainInfoAll();
    //根据书名获取书籍
    @Select("select * from articlemain where name=#{name}")
    public MainInfo getMainInfoByName(@Param("name") String name);
    //获取全部类别
    @Select("select * from category")
    public Category[] getcategoryAll();
    //获取热门书籍
    @Select("select * from articlemain where name in (select name from hot)")
    public MainInfo[] getHot();
    //根据书名获取章节名称
    @Select("select name,articleid from chapter where articleid = (select id from articlemain where name=#{name})")
    public Chapter[] getAllChapter(@Param("name") String name);
    //根据书籍id和章节名,获取章节内容地址
    @Select("select path from chapter where name=#{name} and articleid=#{id}")
    public String getChapterPath(@Param("name") String name,@Param("id") int id);

}
