package com.t3h.spring.repository;

import com.t3h.spring.entities.News;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface NewsRepository extends CrudRepository<News, Integer> {
    public List<News> findNewsByTitle(String title);
}
