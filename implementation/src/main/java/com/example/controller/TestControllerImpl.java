package com.example.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestControllerImpl implements TestController {

    public ResponseEntity<String> test(){
        return ResponseEntity.ok("Hello!");
    }
}
