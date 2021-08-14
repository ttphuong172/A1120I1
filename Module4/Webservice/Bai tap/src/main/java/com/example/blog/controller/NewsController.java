package com.example.blog.controller;

import com.example.blog.model.News;
import com.example.blog.service.NewsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("news")
public class NewsController {
    @Autowired
    private NewsService newsService;
    @GetMapping("")
    public ResponseEntity<Page<News>> loadNews(@RequestParam(value = "page",defaultValue = "0") int page){
        Page<News> newsPage=newsService.selectAllNews(PageRequest.of(page,10));
        return new ResponseEntity<>(newsPage, HttpStatus.OK);
    }
    @GetMapping("{id}")
    public ResponseEntity<News> getNews(@PathVariable int id){
        News news=newsService.findNewsById(id);
        if(news==null){
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(news,HttpStatus.OK);
    }
    @PostMapping("create")
    public ResponseEntity<String> createNews(@RequestBody News news){
        newsService.saveNews(news);
        return new ResponseEntity<>("Tao thanh cong",HttpStatus.OK);
    }
    @PutMapping("update/{id}")
    public ResponseEntity<News> editNews(@PathVariable int id,@RequestBody News news){
        News currentNews=newsService.findNewsById(id);
        if (currentNews==null){
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        currentNews.setHeader(news.getHeader());
        currentNews.setContent(news.getContent());
        currentNews.setCategory(news.getCategory());
        newsService.saveNews(currentNews);
        return new ResponseEntity<>(currentNews,HttpStatus.OK);
    }
    @DeleteMapping("delete/{id}")
    public ResponseEntity<String> deleteNews(@PathVariable int id){
        News news=newsService.findNewsById(id);
        if (news==null){
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        newsService.removeNews(news);
        return new ResponseEntity<>("Xoa thanh cong",HttpStatus.OK);
    }

}
