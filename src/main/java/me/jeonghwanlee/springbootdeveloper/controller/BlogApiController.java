package me.jeonghwanlee.springbootdeveloper.controller;

import lombok.RequiredArgsConstructor;
import me.jeonghwanlee.springbootdeveloper.domain.Article;
import me.jeonghwanlee.springbootdeveloper.dto.AddArticleRequest;
import me.jeonghwanlee.springbootdeveloper.service.BlogService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.http.HttpStatus.CREATED;

/**
 * @author jeonghwanlee
 * @date 2023-11-27
 */
@RestController
@RequiredArgsConstructor
public class BlogApiController {

    private final BlogService blogService;

    @PostMapping("/api/articles")
    public ResponseEntity<Article> addArticle(@RequestBody AddArticleRequest request) {
        Article savedArticle = blogService.save(request);
        return ResponseEntity.status(CREATED)
                .body(savedArticle);
    }
}
