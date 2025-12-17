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

    @Column(nullable = false)
    @Enumerated(EnumType.STRING)
    private StatusTarefa status;

    public String toString(){

        return "Tarefa{" + "id = " + id + ", Título = " +  titulo + ", Descrição = " + descricao + ", Status = " + status;

    }

    public Tarefa(){

    }

    public Tarefa(String titulo, String descricao){

        this.descricao = descricao;

        this.titulo = titulo;

        this.status = StatusTarefa.PENDENTE;

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public StatusTarefa getStatus() {
        return status;
    }

    public void setStatus(StatusTarefa status) {
        this.status = status;
    }
}
