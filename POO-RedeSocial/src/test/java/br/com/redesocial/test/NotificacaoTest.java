package br.com.redesocial.test;

import br.com.redesocial.interfaces.Notificacao;
import br.com.redesocial.model.Mensagem;
import br.com.redesocial.model.NotificacaoCurtida;
import br.com.redesocial.model.NotificacaoMensagem;
import br.com.redesocial.model.Postagem;
import br.com.redesocial.model.Usuario;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class NotificacaoTest {
    @Test
    void deveCriarNotificacaoDeMensagem() {
        Usuario remetente = new Usuario(1, "a@email.com", "123", "Ana");
        Usuario destinatario = new Usuario(2, "g@email.com", "123", "Gustavo");
        Mensagem mensagem = new Mensagem(remetente, destinatario, "Oi");

        Notificacao notificacao = new NotificacaoMensagem(mensagem);

        assertTrue(notificacao.getMensagem().contains("Nova mensagem"));
        assertTrue(notificacao.getMensagem().contains("Ana"));
    }

    @Test
    void deveCriarNotificacaoDeCurtida() {
        Usuario autor = new Usuario(1, "autor@email.com", "123", "Autor");
        Usuario leitor = new Usuario(2, "leitor@email.com", "123", "Leitor");
        Postagem postagem = new Postagem(1, autor, "Postagem teste");

        Notificacao notificacao = new NotificacaoCurtida(leitor, postagem);

        assertTrue(notificacao.getMensagem().contains("curtiu"));
        assertTrue(notificacao.getMensagem().contains("Autor"));
    }
}
