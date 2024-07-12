package org.example.smartagriculture.controller;

import jakarta.annotation.Resource;
import org.example.smartagriculture.common.R;
import org.example.smartagriculture.model.News;
import org.example.smartagriculture.service.NewsService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/news")
public class NewsController {
    @Resource
    NewsService newsService;

    @PostMapping("/add")
    public R<String> addNews(@RequestBody News news) {
        int judge = newsService.add(news);
        if (judge == 1) {
            return R.ok("添加成功");
        }
        return R.fail("添加失败");
    }

    @PostMapping("/delete")
    public R<String> deleteNews(@RequestParam("id") int id) {
        int judge = newsService.delete(id);
        if (judge == 1) {
            return R.ok("删除成功");
        }
        return R.fail("删除失败");
    }

    @PostMapping("/update")
    public R<String> updateNews(@RequestBody News news) {
        int judge = newsService.update(news);
        if (judge == 1) {
            return R.ok("添加成功");
        }
        return R.fail("添加失败");
    }

    @PostMapping("/search")
    public List<News> searchNews() {
        return newsService.findAll();
    }
}
