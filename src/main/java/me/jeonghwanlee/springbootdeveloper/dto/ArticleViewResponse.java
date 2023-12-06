package me.jeonghwanlee.springbootdeveloper.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import me.jeonghwanlee.springbootdeveloper.domain.Article;

import java.time.LocalDateTime;

/**
 * @author jeonghwanlee
 * @date 2023-12-03
 */
@Getter
@NoArgsConstructor
public class ArticleViewResponse {

    private Long id;
    private String title;
    private String content;
    private LocalDateTime createdAt;
    private String author;

    public ArticleViewResponse(Article article) {
        this.id = article.getId();
        this.title = article.getTitle();
        this.content = article.getContent();
        this.createdAt = article.getCreatedAt();
        this.author = article.getAuthor();
    }
}
