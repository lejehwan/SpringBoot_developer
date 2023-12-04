package me.jeonghwanlee.springbootdeveloper.service;

import lombok.RequiredArgsConstructor;
import me.jeonghwanlee.springbootdeveloper.config.jwt.TokenProvider;
import me.jeonghwanlee.springbootdeveloper.domain.User;
import org.springframework.stereotype.Service;

import java.time.Duration;

/**
 * @author jeonghwanlee
 * @date 2023-12-03
 */
@Service
@RequiredArgsConstructor
public class TokenService {

    private final TokenProvider tokenProvider;
    private final RefreshTokenService refreshTokenService;
    private final UserService userService;

    public String createNewAccessToken(String refreshToken) {
        if (!tokenProvider.validToken(refreshToken)) {
            throw new IllegalArgumentException("Unexpected token");
        }

        Long userId = refreshTokenService.findByRefreshToken(refreshToken).getUserId();
        User user = userService.findById(userId);

        return tokenProvider.generateToken(user, Duration.ofHours(2));
    }

}

