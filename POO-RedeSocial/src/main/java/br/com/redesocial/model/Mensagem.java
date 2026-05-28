package br.com.redesocial.model;

import java.time.LocalDateTime;

public class Mensagem {
    private Usuario remetente;
    private Usuario destinatario;
    private String conteudo;
    private LocalDateTime dataEnvio;

    public Mensagem(Usuario remetente, Usuario destinatario, String conteudo) {
        this.remetente = remetente;
        this.destinatario = destinatario;
        this.conteudo = conteudo;
        this.dataEnvio = LocalDateTime.now();
    }

    public Usuario getRemetente() {
        return remetente;
    }

    public Usuario getDestinatario() {
        return destinatario;
    }

    public String getConteudo() {
        return conteudo;
    }

    public LocalDateTime getDataEnvio() {
        return dataEnvio;
    }

    public String exibir() {
        return "Mensagem de " + remetente.getPerfil().getNomeExibicao()
                + " para " + destinatario.getPerfil().getNomeExibicao()
                + ": " + conteudo;
    }
}
