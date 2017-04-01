package com.gzw.service.impl;

import com.gzw.domain.Category;
import com.gzw.domain.Chapter;
import com.gzw.domain.MainInfo;
import com.gzw.mapper.MainMapper;
import com.gzw.service.MainServer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by gzw on 2017/4/1.
 */
@Service
public class MainServerImpl implements MainServer{

    @Autowired
    MainMapper mainMapper;

    @Override
    public MainInfo[] getMainInfoAll() {
        return mainMapper.getMainInfoAll();
    }

    @Override
    public MainInfo getMainInfoByName(String name) {
        return mainMapper.getMainInfoByName(name);
    }

    @Override
    public Category[] getCategoryAll() {
        return mainMapper.getcategoryAll();
    }

    @Override
    public MainInfo[] getHot() {
        return mainMapper.getHot();
    }

    @Override
    public Chapter[] getAllChapter(String name) {
        return mainMapper.getAllChapter(name);
    }

    @Override
    public String getChapterPath(String name, int id) {
        return mainMapper.getChapterPath(name,id);
    }
}
