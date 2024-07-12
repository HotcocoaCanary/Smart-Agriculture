package org.example.smartagriculture.service;

import org.example.smartagriculture.model.News;

import java.util.List;

public interface NewsService {
    int add(News news);

    int delete(int id);

    int update(News news);

    List<News> findAll();
}
