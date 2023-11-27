package me.jeonghwanlee.springbootdeveloper.repository;

import me.jeonghwanlee.springbootdeveloper.domain.Article;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author jeonghwanlee
 * @date 2023-11-27
 */
public interface BlogRepository extends JpaRepository<Article, Long> {
}
