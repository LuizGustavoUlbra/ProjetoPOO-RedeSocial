package br.com.redesocial.model;

import br.com.redesocial.interfaces.Interativo;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Postagem extends Conteudo implements Interativo {
    private List<Usuario> curtidas;
    private List<Comentario> comentarios;

    public Postagem(int id, Usuario autor, String texto) {
        super(id, autor, texto);
        this.curtidas = new ArrayList<>();
        this.comentarios = new ArrayList<>();
    }

    @Override
    public void curtir(Usuario usuario) {
        if (!curtidas.contains(usuario)) {
            curtidas.add(usuario);
        }
    }

    @Override
    public void comentar(Comentario comentario) {
        comentarios.add(comentario);
    }

    @Override
    public int getTotalCurtidas() {
        return curtidas.size();
    }

    public List<Comentario> getComentarios() {
        return Collections.unmodifiableList(comentarios);
    }

    @Override
    public String exibir() {
        return "Postagem de " + getAutor().getPerfil().getNomeExibicao() + ": " + getTexto();
    }
}
