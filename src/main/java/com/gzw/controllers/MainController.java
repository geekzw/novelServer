package com.gzw.controllers;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.gzw.FileUtil;
import com.gzw.domain.Category;
import com.gzw.domain.Chapter;
import com.gzw.domain.MainInfo;
import com.gzw.service.MainServer;
import com.gzw.service.impl.MainServerImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by gzw on 2017/4/1.
 */
@Controller
public class MainController {

    @Autowired
    MainServerImpl mainServer;

//    @ResponseBody
//    @RequestMapping("/api/mainInfo")
//    public String getMainInfoAll(){
//        MainInfo[] infos = mainServer.getMainInfoAll();
//        String string = JSON.toJSONString(infos);
//        return string;
//    }

    @ResponseBody
    @RequestMapping("/api/mainInfo/name/{name}")
    public String getMainInfoByName(@PathVariable String name){
        MainInfo info = mainServer.getMainInfoByName(name);
        String string = JSON.toJSONString(info);
        return string;
    }

    @ResponseBody
    @RequestMapping("/api/mainInfo")
    public String getMainInfo(){
        Category[] categories = mainServer.getCategoryAll();
        MainInfo[] infos = mainServer.getHot();
        String json1 = JSON.toJSONString(categories);
        String json2 = JSON.toJSONString(infos);
        return json1+json2;
    }

    @ResponseBody
    @RequestMapping("/api/mainInfo/allChapter/bookName/{name}")
    public String getAllChapter(@PathVariable String name){
        Chapter[] chapters = mainServer.getAllChapter(name);
        return JSON.toJSONString(chapters);
    }

    @ResponseBody
    @RequestMapping("/api/mainInfo/chapterContent/ChapterName/{name}/bookid/{id}")
    public String getAllChapter(@PathVariable String name,@PathVariable String id){
        String path = mainServer.getChapterPath(name,Integer.valueOf(id));
        System.out.print(path);
        return FileUtil.getFileContent(path);
    }
}
