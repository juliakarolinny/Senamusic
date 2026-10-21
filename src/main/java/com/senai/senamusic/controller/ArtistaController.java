package com.senai.senamusic.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ArtistaController {
    @GetMapping("artista")

    public String Artista(){
        return "*****Negao Original\n****" +
                "****Atila 333\n****" +
                "****Fiama 777\n****" +
                "****Fabri 666****";
    }
}
