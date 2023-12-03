package me.jeonghwanlee.springbootdeveloper.dto;

import lombok.Getter;
import me.jeonghwanlee.springbootdeveloper.domain.Article;

/**
 * @author jeonghwanlee
 * @date 2023-12-03
 */
@Getter
public class ArticleListViewResponse {

    private final Long id;
    private final String title;
    private final String content;

    public ArticleListViewResponse(Article article) {
        this.id = article.getId();
        this.title = article.getTitle();
        this.content = article.getContent();
    }
}
