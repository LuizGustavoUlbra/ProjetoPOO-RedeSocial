package br.com.redesocial.model;

import br.com.redesocial.interfaces.Interativo;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Comentario extends Conteudo implements Interativo {
    private List<Usuario> curtidas;
    private List<Comentario> respostas;

    public Comentario(int id, Usuario autor, String texto) {
        super(id, autor, texto);
        this.curtidas = new ArrayList<>();
        this.respostas = new ArrayList<>();
    }

    @Override
    public void curtir(Usuario usuario) {
        if (!curtidas.contains(usuario)) {
            curtidas.add(usuario);
        }
    }

    @Override
    public void comentar(Comentario comentario) {
        respostas.add(comentario);
    }

    @Override
    public int getTotalCurtidas() {
        return curtidas.size();
    }

    public List<Comentario> getRespostas() {
        return Collections.unmodifiableList(respostas);
    }

    @Override
    public String exibir() {
        return "Comentário de " + getAutor().getPerfil().getNomeExibicao() + ": " + getTexto();
    }
}
