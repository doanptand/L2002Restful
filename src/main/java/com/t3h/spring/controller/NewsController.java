package com.t3h.spring.controller;

import com.t3h.spring.entities.News;
import com.t3h.spring.service.NewsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/news")
public class NewsController {
    @Autowired
    private NewsService newsService;

    @GetMapping("/all")
    public List<News> getAllNews() {
        return newsService.getAllNews();
    }

    @PostMapping("/add")
    public News insertNews(@RequestBody News news) {
        return newsService.insertOrUpdate(news);
    }

}
