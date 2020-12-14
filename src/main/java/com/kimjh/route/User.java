package com.kimjh.route;

import org.springframework.web.bind.annotation.*;

@RestController
public class User {
    @GetMapping("/users")
    public String users() {
        return "Users!";
    }
}
