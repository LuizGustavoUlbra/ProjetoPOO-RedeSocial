package br.com.redesocial.test;

import br.com.redesocial.model.Postagem;
import br.com.redesocial.model.PostagemImagem;
import br.com.redesocial.model.Usuario;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class PostagemImagemTest {
    @Test
    void deveSerUmaPostagem() {
        Usuario autor = new Usuario(1, "autor@email.com", "123", "Autor");
        PostagemImagem postagemImagem = new PostagemImagem(1, autor, "Minha foto", "foto.png");

        assertTrue(postagemImagem instanceof Postagem);
    }

    @Test
    void deveAlterarUrlDaImagem() {
        Usuario autor = new Usuario(1, "autor@email.com", "123", "Autor");
        PostagemImagem postagemImagem = new PostagemImagem(1, autor, "Minha foto", "foto-antiga.png");

        postagemImagem.setUrlImagem("foto-nova.png");

        assertEquals("foto-nova.png", postagemImagem.getUrlImagem());
    }

    @Test
    void deveExibirPostagemImagemComTextoEUrl() {
        Usuario autor = new Usuario(1, "autor@email.com", "123", "Autor");
        PostagemImagem postagemImagem = new PostagemImagem(1, autor, "Foto do dia", "foto.jpg");

        String resultado = postagemImagem.exibir();

        assertTrue(resultado.contains("Postagem com imagem"));
        assertTrue(resultado.contains("Foto do dia"));
        assertTrue(resultado.contains("foto.jpg"));
    }
}
