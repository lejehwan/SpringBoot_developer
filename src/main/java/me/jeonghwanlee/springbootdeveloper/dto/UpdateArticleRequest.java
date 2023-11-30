package me.jeonghwanlee.springbootdeveloper.dto;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

/**
 * @author jeonghwanlee
 * @date 2023-11-30
 */
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
public class UpdateArticleRequest {

    private String title;
    private String content;
}
