package com.ruppyrup.translationservice.services;

import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class TranslationService {

//    private Map<String, String> lookup = Map.of(
//            "hello", "Bonjour",
//            "time", "temps",
//            "name", "Nom",
//            "message", "un message",
//            "i", "je",
//            "this", "c'est",
//            "from", "de",
//            "new", "nouveau",
//            "ok", "dacord",
//            "in", "dans");


    private Map<String, String> lookupFrench = new HashMap<>();

    {
        lookupFrench.put("hello", "Bonjour");
        lookupFrench.put("time", "temps");
        lookupFrench.put("name", "Nom");
        lookupFrench.put("message", "un message");
        lookupFrench.put("i", "je");
        lookupFrench.put("this", "c'est");
        lookupFrench.put("from", "de");
        lookupFrench.put("new", "nouveau");
        lookupFrench.put("ok", "dacord");
        lookupFrench.put("to", "💝");
        lookupFrench.put("over", "plus de");
        lookupFrench.put("on", "sur");
        lookupFrench.put("for", "pour");
        lookupFrench.put("one", "‍🔥");
    }


    public String translate(String message) {
        return Arrays.stream(message.split(" "))
                .map(word -> Optional.ofNullable(lookupFrench.get(word.toLowerCase())).orElse(word))
                .collect(Collectors.joining(" "));
    }
}
