package com.ruppyrup.translationservice.controllers;

import com.ruppyrup.translationservice.services.TranslationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TranslationController {

    @Autowired
    TranslationService translationService;

    @PostMapping("/translation")
    public ResponseEntity<String> translate(@RequestBody String message) {
        System.out.println("Translationg message: " + message);
        return new ResponseEntity<>(translationService.translate(message), HttpStatus.OK);
    }
}
