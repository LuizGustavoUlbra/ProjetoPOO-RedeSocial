package br.com.redesocial.model;

import br.com.redesocial.interfaces.Notificacao;

public class NotificacaoMensagem implements Notificacao {
    private Mensagem mensagem;

    public NotificacaoMensagem(Mensagem mensagem) {
        this.mensagem = mensagem;
    }

    @Override
    public void enviar() {
        System.out.println(getMensagem());
    }

    @Override
    public String getMensagem() {
        return "Nova mensagem recebida de " + mensagem.getRemetente().getPerfil().getNomeExibicao();
    }
}
