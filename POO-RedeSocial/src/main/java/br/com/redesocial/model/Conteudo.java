package br.com.redesocial.model;

import java.time.LocalDateTime;

public abstract class Conteudo {
    private int id;
    private Usuario autor;
    private String texto;
    private LocalDateTime dataCriacao;

    public Conteudo(int id, Usuario autor, String texto) {
        this.id = id;
        this.autor = autor;
        this.texto = texto;
        this.dataCriacao = LocalDateTime.now();
    }

    public int getId() {
        return id;
    }

    public Usuario getAutor() {
        return autor;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public LocalDateTime getDataCriacao() {
        return dataCriacao;
    }

    public abstract String exibir();
}
