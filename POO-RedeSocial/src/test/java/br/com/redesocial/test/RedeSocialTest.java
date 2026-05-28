package br.com.redesocial.test;

import br.com.redesocial.model.Postagem;
import br.com.redesocial.model.PostagemImagem;
import br.com.redesocial.model.RedeSocial;
import br.com.redesocial.model.Usuario;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class RedeSocialTest {
    @Test
    void deveAdicionarUsuarioNaRedeSocial() {
        RedeSocial redeSocial = new RedeSocial("MiniSocial");
        Usuario usuario = new Usuario(1, "usuario@email.com", "123", "Usuário");

        redeSocial.adicionarUsuario(usuario);

        assertEquals(1, redeSocial.getUsuarios().size());
    }

    @Test
    void devePublicarPostagemUsandoSobrecarga() {
        RedeSocial redeSocial = new RedeSocial("MiniSocial");
        Usuario usuario = new Usuario(1, "usuario@email.com", "123", "Usuário");

        Postagem postagemTexto = redeSocial.publicar(usuario, "Texto simples");
        PostagemImagem postagemImagem = redeSocial.publicar(usuario, "Texto com imagem", "imagem.png");

        assertEquals(2, redeSocial.getPostagens().size());
        assertEquals("Texto simples", postagemTexto.getTexto());
        assertEquals("imagem.png", postagemImagem.getUrlImagem());
    }
}
