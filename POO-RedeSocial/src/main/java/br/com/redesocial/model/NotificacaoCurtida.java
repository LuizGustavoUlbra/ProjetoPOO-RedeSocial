package br.com.redesocial.model;

import br.com.redesocial.interfaces.Notificacao;

public class NotificacaoCurtida implements Notificacao {
    private Usuario usuario;
    private Conteudo conteudo;

    public NotificacaoCurtida(Usuario usuario, Conteudo conteudo) {
        this.usuario = usuario;
        this.conteudo = conteudo;
    }

    @Override
    public void enviar() {
        System.out.println(getMensagem());
    }

    @Override
    public String getMensagem() {
        return usuario.getPerfil().getNomeExibicao()
                + " curtiu o conteúdo de "
                + conteudo.getAutor().getPerfil().getNomeExibicao();
    }
}
