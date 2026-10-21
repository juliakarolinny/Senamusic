package com.senai.senamusic.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class musica {

    @Id

    private int id;
    private String nome;
    private Genero gereno;
    private int idArtista;
}
