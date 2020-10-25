package com.t3h.spring.entities;

import org.springframework.context.annotation.Primary;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "news")
public class News {


    @Id
    @Column(name = "_id")
    private int id;
    @Column(name = "_title")
    private String title;
    @Column(name = "_description")
    private String description;
    @Column(name = "_pub_date")
    private String pubDate;

    public News() {
    }

    public News(int id, String title, String description, String pubDate) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.pubDate = pubDate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPubDate() {
        return pubDate;
    }

    public void setPubDate(String pubDate) {
        this.pubDate = pubDate;
    }
}
