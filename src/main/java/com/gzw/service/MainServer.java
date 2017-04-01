package com.gzw.service;

import com.gzw.domain.Category;
import com.gzw.domain.Chapter;
import com.gzw.domain.MainInfo;

/**
 * Created by gzw on 2017/4/1.
 */
public interface MainServer {

    public MainInfo[] getMainInfoAll();

    public MainInfo getMainInfoByName(String name);

    public Category[] getCategoryAll();

    public MainInfo[] getHot();

    public Chapter[] getAllChapter(String name);

    public String getChapterPath(String name,int id);
}
