package me.jeonghwanlee.springbootdeveloper.controller;

import lombok.RequiredArgsConstructor;
import me.jeonghwanlee.springbootdeveloper.dto.CreateAccessTokenRequest;
import me.jeonghwanlee.springbootdeveloper.dto.CreateAccessTokenResponse;
import me.jeonghwanlee.springbootdeveloper.service.TokenService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author jeonghwanlee
 * @date 2023-12-03
 */
@RequiredArgsConstructor
@RestController
public class TokenApiController {

    private final TokenService tokenService;

    @PostMapping("/api/token")
    public ResponseEntity<CreateAccessTokenResponse> createNewAccessToken(@RequestBody CreateAccessTokenRequest request) {
        String newAccessToken = tokenService.createNewAccessToken(request.getRefreshToken());

        return ResponseEntity.status(HttpStatus.CREATED)
                .body(new CreateAccessTokenResponse(newAccessToken));
    }
}
