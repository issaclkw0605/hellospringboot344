package com.example.hellospringboot344.controller.impl;

import com.example.hellospringboot344.controller.HelloController;
import com.example.hellospringboot344.response.HelloResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
@CrossOrigin("*")
@Slf4j
public class HelloControllerImpl implements HelloController {
    @GetMapping("/hello" )
    public HelloResponse sayHello() {
        return new HelloResponse("welcome to hello world");
    }
}
