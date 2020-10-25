package com.t3h.spring.service;

import com.t3h.spring.entities.News;
import com.t3h.spring.repository.NewsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NewsService {

    @Autowired
    private NewsRepository newsRepository;

    public List<News> getAllNews() {
        return (List<News>) newsRepository.findAll();
    }

    public void deleteNews(int id) {
        newsRepository.deleteById(id);
    }
    public News insertOrUpdate(News news) {
        return newsRepository.save(news);
    }
}
