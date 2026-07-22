package com.fakenews.fakenewsdetector;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/news")
public class NewsController {

    private final NewsService newsService;

    public NewsController(NewsService newsService) {
        this.newsService = newsService;
    }

    @GetMapping("/check")
    public String checkNews(@RequestParam String text) {

        return newsService.detectNews(text);
    }
}
