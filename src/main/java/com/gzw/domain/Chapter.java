package com.gzw.domain;

/**
 * Created by gzw on 2017/4/1.
 */
public class Chapter {

    public String name;
    public int articleid;

    public Chapter() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getArticleid() {
        return articleid;
    }

    public void setArticleid(int articleid) {
        this.articleid = articleid;
    }

    @Override
    public String toString() {
        return "Chapter{" +
                "name='" + name + '\'' +
                ", articleid=" + articleid +
                '}';
    }
}
