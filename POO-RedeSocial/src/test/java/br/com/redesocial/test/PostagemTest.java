package br.com.redesocial.test;

import br.com.redesocial.model.Comentario;
import br.com.redesocial.model.Postagem;
import br.com.redesocial.model.PostagemImagem;
import br.com.redesocial.model.Usuario;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class PostagemTest {
    @Test
    void deveCurtirEComentarPostagem() {
        Usuario autor = new Usuario(1, "autor@email.com", "123", "Autor");
        Usuario leitor = new Usuario(2, "leitor@email.com", "123", "Leitor");
        Postagem postagem = new Postagem(1, autor, "Olá mundo");
        Comentario comentario = new Comentario(1, leitor, "Legal!");

        postagem.curtir(leitor);
        postagem.curtir(leitor);
        postagem.comentar(comentario);

        assertEquals(1, postagem.getTotalCurtidas());
        assertEquals(1, postagem.getComentarios().size());
    }

    @Test
    void deveSobrescreverMetodoExibirEmPostagemImagem() {
        Usuario autor = new Usuario(1, "autor@email.com", "123", "Autor");
        PostagemImagem imagem = new PostagemImagem(1, autor, "Foto do dia", "foto.jpg");

        assertTrue(imagem.exibir().contains("Postagem com imagem"));
        assertTrue(imagem.exibir().contains("foto.jpg"));
    }
}
