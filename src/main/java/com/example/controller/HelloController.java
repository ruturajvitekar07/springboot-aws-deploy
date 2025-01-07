package com.example.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping
    public ResponseEntity<?> hello(){
        return ResponseEntity.status(HttpStatus.OK).body("Hello everyone");
    }

    @GetMapping("/param")
    public ResponseEntity<?> hello1(@RequestParam("name") String name){
        return ResponseEntity.status(HttpStatus.OK).body("Hello "+name);
    }

    @GetMapping("/path/{name}")
    public ResponseEntity<?> hello2(@PathVariable("name") String name){
        return ResponseEntity.status(HttpStatus.OK).body("Hello "+name);
    }
}
