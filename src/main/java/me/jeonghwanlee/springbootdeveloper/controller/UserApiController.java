package me.jeonghwanlee.springbootdeveloper.controller;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import lombok.RequiredArgsConstructor;
import me.jeonghwanlee.springbootdeveloper.dto.AddUserRequest;
import me.jeonghwanlee.springbootdeveloper.service.UserService;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.web.authentication.logout.SecurityContextLogoutHandler;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

/**
 * @author jeonghwanlee
 * @date 2023-12-03
 */
@Controller
@RequiredArgsConstructor
public class UserApiController {

    private final UserService userService;

    @PostMapping("/user")
    public String signUp(AddUserRequest request) {
        userService.save(request);
        return "redirect:/login";
    }

    @GetMapping("/logout")
    public String logout(HttpServletRequest request, HttpServletResponse response) {
        new SecurityContextLogoutHandler().logout(request, response, SecurityContextHolder.getContext().getAuthentication());
        return "redirect:/login";
    }
}
