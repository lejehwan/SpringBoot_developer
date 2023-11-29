package me.jeonghwanlee.springbootdeveloper.dto;

import lombok.Getter;
import me.jeonghwanlee.springbootdeveloper.domain.Article;

/**
 * @author jeonghwanlee
 * @date 2023-11-29
 */
@Getter
public class ArticleResponse {
    private final String title;
    private final String content;

    public ArticleResponse(Article article) {
        this.title = article.getTitle();
        this.content = article.getContent();
    }
}
