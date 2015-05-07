package com.skillsup.hibernate.dao.entity;

import javax.persistence.*;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

@Entity
@Table(name = "COMPOSITION")
public class Composition {

    @Id
    @Column
    private long id;

    @Column(name = "TITLE")
    private String title;

    @Column(name = "AUTHOR")
    private String author;

    @OneToOne(mappedBy = "composition")
    @Fetch(FetchMode.JOIN)
    private Performance performance;

    public Performance getPerformance() {
        return performance;
    }


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public String toString() {
        return "Composition{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", author='" + author +
                '}';
    }
}