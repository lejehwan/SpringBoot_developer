package me.jeonghwanlee.springbootdeveloper.service;

import lombok.RequiredArgsConstructor;
import me.jeonghwanlee.springbootdeveloper.domain.Article;
import me.jeonghwanlee.springbootdeveloper.dto.AddArticleRequest;
import me.jeonghwanlee.springbootdeveloper.repository.BlogRepository;
import org.springframework.stereotype.Service;

/**
 * @author jeonghwanlee
 * @date 2023-11-27
 */
@Service
@RequiredArgsConstructor
public class BlogService {

    private final BlogRepository blogRepository;

    public Article save(AddArticleRequest request) {
        return blogRepository.save(request.toEntity());
    }
}
