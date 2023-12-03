package me.jeonghwanlee.springbootdeveloper.dto;

import lombok.Getter;
import lombok.Setter;

/**
 * @author jeonghwanlee
 * @date 2023-12-03
 */
@Getter
@Setter
public class AddUserRequest {

    private String email;
    private String password;
}
