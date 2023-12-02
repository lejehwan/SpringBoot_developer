package me.jeonghwanlee.springbootdeveloper.repository;

import me.jeonghwanlee.springbootdeveloper.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

/**
 * @author jeonghwanlee
 * @date 2023-12-02
 */
public interface UserRepository extends JpaRepository<User, Long> {

    Optional<User> findByEmail(String email);
}
