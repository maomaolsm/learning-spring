package com.example.springrestdocsgradle;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.Map;

/**
 * Created by maomao on 18/1/9.
 */
@RestController
public class HomeController {

    @GetMapping("/")
    public Map<String, String> greeting() {
        return Collections.singletonMap("message", "Hello World");
    }

}
