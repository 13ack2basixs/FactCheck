package com.hongwei.factcheck.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Data
@Entity
public class Article {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long article_id;

    private String title;
    private String content;
    private String source;
    private String url;
    private int score;
    private String summary;

    @ManyToMany(mappedBy = "savedArticles")
    private List<User> usersWhoSaved;

    public Article(String title, String content, String source, String url) {
        this.title = title;
        this.content = content;
        this.source = source;
        this.url = url;
    }
}
