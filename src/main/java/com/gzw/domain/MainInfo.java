package com.gzw.domain;

/**
 * Created by gzw on 2017/4/1.
 */
public class MainInfo {

    public String category;
    public String name;
    public String image;
    public String author;
    public String updatetime;
    public String status;
    public String news;
    public String description;

    public MainInfo() {
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getUpdatetime() {
        return updatetime;
    }

    public void setUpdatetime(String updatetime) {
        this.updatetime = updatetime;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getNews() {
        return news;
    }

    public void setNews(String news) {
        this.news = news;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "MainInfo{" +
                "category='" + category + '\'' +
                ", name='" + name + '\'' +
                ", image='" + image + '\'' +
                ", author='" + author + '\'' +
                ", updatetime='" + updatetime + '\'' +
                ", status='" + status + '\'' +
                ", news='" + news + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
