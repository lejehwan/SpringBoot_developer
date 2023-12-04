package me.jeonghwanlee.springbootdeveloper.service;

import lombok.RequiredArgsConstructor;
import me.jeonghwanlee.springbootdeveloper.domain.RefreshToken;
import me.jeonghwanlee.springbootdeveloper.repository.RefreshTokenRepository;
import org.springframework.stereotype.Service;

/**
 * @author jeonghwanlee
 * @date 2023-12-03
 */
@Service
@RequiredArgsConstructor
public class RefreshTokenService {

    private final RefreshTokenRepository refreshTokenRepository;

    public RefreshToken findByRefreshToken(String refreshToken) {
        return refreshTokenRepository.findByRefreshToken(refreshToken)
                .orElseThrow(() -> new IllegalArgumentException("Unexpected token"));
    }
}
