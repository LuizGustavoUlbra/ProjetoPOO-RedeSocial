package br.com.redesocial.test;

import br.com.redesocial.model.Comentario;
import br.com.redesocial.model.Usuario;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ComentarioTest {
    @Test
    void deveCurtirComentarioSemDuplicarCurtidaDoMesmoUsuario() {
        Usuario autor = new Usuario(1, "autor@email.com", "123", "Autor");
        Usuario leitor = new Usuario(2, "leitor@email.com", "123", "Leitor");
        Comentario comentario = new Comentario(1, autor, "Muito bom!");

        comentario.curtir(leitor);
        comentario.curtir(leitor);

        assertEquals(1, comentario.getTotalCurtidas());
    }

    @Test
    void deveAdicionarRespostaAoComentario() {
        Usuario autor = new Usuario(1, "autor@email.com", "123", "Autor");
        Usuario leitor = new Usuario(2, "leitor@email.com", "123", "Leitor");
        Comentario comentario = new Comentario(1, autor, "Comentário principal");
        Comentario resposta = new Comentario(2, leitor, "Resposta do comentário");

        comentario.comentar(resposta);

        assertEquals(1, comentario.getRespostas().size());
        assertEquals("Resposta do comentário", comentario.getRespostas().get(0).getTexto());
    }

    @Test
    void deveExibirComentarioComNomeDoAutorETexto() {
        Usuario autor = new Usuario(1, "autor@email.com", "123", "Autor");
        Comentario comentario = new Comentario(1, autor, "Comentário teste");

        String resultado = comentario.exibir();

        assertTrue(resultado.contains("Autor"));
        assertTrue(resultado.contains("Comentário teste"));
    }
}
