package com.ruppyrup.translationservice.services;

import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class TranslationService {

    private Map<String, String> lookup = Map.of(
            "Hello", "Bonjour",
            "time", "temps",
            "name", "Nom",
            "message", "un message",
            "I", "je",
            "this", "c'est",
            "from", "de",
            "new", "nouveau",
            "ok", "dacord",
            "in", "dans");



    public String translate(String message) {
        return Arrays.stream(message.split(" "))
                .map(word -> Optional.ofNullable(lookup.get(word)).orElse(word))
                .collect(Collectors.joining(" "));
    }




}
