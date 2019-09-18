package com.huawei.generate01;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class UserResource2 {

    private final Logger log = LoggerFactory.getLogger(UserResource2.class);

    @GetMapping("/test2")
    public String getAuthorities() {
        return "hello world";
    }
}
