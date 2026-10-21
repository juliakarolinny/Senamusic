package com.senai.senamusic.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class artista {
    @Id
    private String id;

    private String nome;
    private String estilo;
}
