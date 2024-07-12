package org.example.smartagriculture.service.impl;

import jakarta.annotation.Resource;
import org.example.smartagriculture.mapper.NewsMapper;
import org.example.smartagriculture.model.News;
import org.example.smartagriculture.service.NewsService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NewsServiceImpl implements NewsService {
    @Resource
    NewsMapper newsMapper;

    @Override
    public int add(News news) {
        return newsMapper.insert(news);
    }

    @Override
    public int delete(int id) {
        return newsMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int update(News news) {
        return newsMapper.updateByPrimaryKeySelective(news);
    }

    @Override
    public List<News> findAll() {
        return newsMapper.findAll();
    }
}
