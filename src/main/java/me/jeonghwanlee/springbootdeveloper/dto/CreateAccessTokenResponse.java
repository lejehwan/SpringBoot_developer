package me.jeonghwanlee.springbootdeveloper.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * @author jeonghwanlee
 * @date 2023-12-03
 */
@Getter
@AllArgsConstructor
public class CreateAccessTokenResponse {

    private String accessToken;
}
