package me.jeonghwanlee.springbootdeveloper.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author jeonghwanlee
 * @date 2023-12-03
 */
@Controller
public class UserViewController {

    @GetMapping("/login")
    public String login() {
        return "login";
    }

    @GetMapping("/signup")
    public String signup() {
        return "signup";
    }
}
