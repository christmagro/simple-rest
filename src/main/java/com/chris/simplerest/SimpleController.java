package com.chris.simplerest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SimpleController {

    @GetMapping("hello")
    public String getHello() {
        return "Hello Guys";
    }
}
