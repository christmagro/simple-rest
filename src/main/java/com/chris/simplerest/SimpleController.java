package com.chris.simplerest;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class SimpleController {

    @GetMapping("hello")
    public String getHello() {
        log.info("Info Received");
        return "Hello Gals";
    }
}
