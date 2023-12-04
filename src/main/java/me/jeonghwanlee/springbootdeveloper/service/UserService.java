package me.jeonghwanlee.springbootdeveloper.service;

import lombok.RequiredArgsConstructor;
import me.jeonghwanlee.springbootdeveloper.domain.User;
import me.jeonghwanlee.springbootdeveloper.dto.AddUserRequest;
import me.jeonghwanlee.springbootdeveloper.repository.UserRepository;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

/**
 * @author jeonghwanlee
 * @date 2023-12-03
 */
@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;
    private final BCryptPasswordEncoder bCryptPasswordEncoder;

    public Long save(AddUserRequest request) {
        return userRepository.save(User.builder()
                .email(request.getEmail())
                .password(bCryptPasswordEncoder.encode(request.getPassword()))
                .build()).getId();
    }

    public User findById(Long userId) {
        return userRepository.findById(userId)
                .orElseThrow(() -> new IllegalArgumentException("Unexpected user"));
    }
}
