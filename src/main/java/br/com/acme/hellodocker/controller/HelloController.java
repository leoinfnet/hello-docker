package br.com.acme.hellodocker.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/hello")
public class HelloController {
    Logger logger = LoggerFactory.getLogger(HelloController.class);
    @GetMapping
    public ResponseEntity<?> hello(){
        logger.info("Hello From Docker");
        return ResponseEntity.ok(Map.of("message", "Hello From Docker"));

    }
}
