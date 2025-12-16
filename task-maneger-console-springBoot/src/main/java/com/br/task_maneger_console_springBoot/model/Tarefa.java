package com.br.task_maneger_console_springBoot.model;

import jakarta.persistence.*;

@Entity
public class Tarefa {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String titulo;

    @Column(columnDefinition = "TEXT")
    private String descricao;

    @Enumerated(EnumType.STRING)
    private StatusTarefa status;

    public Tarefa(){

    }

    public Tarefa(String titulo, String descricao){

        this.descricao = descricao;

        this.titulo = titulo;

        this.status = StatusTarefa.PENDENTE;

    }
}
