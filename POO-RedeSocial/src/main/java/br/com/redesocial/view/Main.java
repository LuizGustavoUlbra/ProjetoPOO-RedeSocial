package br.com.redesocial.view;

import br.com.redesocial.model.Comentario;
import br.com.redesocial.model.Mensagem;
import br.com.redesocial.model.NotificacaoCurtida;
import br.com.redesocial.model.NotificacaoMensagem;
import br.com.redesocial.model.Postagem;
import br.com.redesocial.model.RedeSocial;
import br.com.redesocial.model.Usuario;
import br.com.redesocial.service.RedeSocialService;

public class Main {
    public static void main(String[] args) {
        RedeSocial redeSocial = new RedeSocial("MiniSocial");
        RedeSocialService service = new RedeSocialService(redeSocial);

        Usuario gustavo = service.cadastrarUsuario("gustavo@email.com", "123", "Gustavo");
        Usuario ana = service.cadastrarUsuario("ana@email.com", "456", "Ana");

        Postagem postagem = service.criarPostagemTexto(gustavo, "Meu primeiro post na rede social!");
        postagem.curtir(ana);

        Comentario comentario = new Comentario(1, ana, "Muito bom!");
        postagem.comentar(comentario);

        Mensagem mensagem = new Mensagem(ana, gustavo, "Oi, tudo bem?");

        System.out.println(postagem.exibir());
        System.out.println(comentario.exibir());
        System.out.println(mensagem.exibir());

        new NotificacaoCurtida(ana, postagem).enviar();
        new NotificacaoMensagem(mensagem).enviar();
    }
}
