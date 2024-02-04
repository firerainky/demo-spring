package com.zky.demospring.controller;

import com.zky.demospring.domain.AjaxResponse;
import com.zky.demospring.domain.Article;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
@RequestMapping("/articles")
public class ArticleController {

    @PostMapping
    public AjaxResponse saveArticle(@RequestBody Article article) {
        log.info("saveArticle: " + article);
        return AjaxResponse.success(article);
    }

    @GetMapping("/{id}")
    public AjaxResponse getArticle(@PathVariable("id") Long id) {
        Article article = Article.builder().id(id)
                .author("zky").content("spring boot")
                .title("t1").build();
        return AjaxResponse.success(article);
    }
}
