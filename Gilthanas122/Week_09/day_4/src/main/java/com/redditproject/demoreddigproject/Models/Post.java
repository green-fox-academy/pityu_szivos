package com.redditproject.demoreddigproject.Models;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Post {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String title;
    private String url;
    private Integer likeCounter = 0;

    @Temporal(TemporalType.TIMESTAMP)
    private Date date = new Date();

    public Post() {
    }

    public Post(String title, String url) {
        this.title = title;
        this.url = url;
        likeCounter = 0;
        date = new Date();
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Integer getLikeCounter() {
        return likeCounter;
    }

    public void setLikeCounterUp() {
        this.likeCounter++;
    }

    public void setLikeCounterDown() {
        this.likeCounter--;
    }


    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Post{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", url='" + url + '\'' +
                ", likeCounter=" + likeCounter +
                '}';
    }
}
