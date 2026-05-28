package br.com.redesocial.model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class RedeSocial {
    private String nome;
    private List<Usuario> usuarios;
    private List<Postagem> postagens;

    public RedeSocial(String nome) {
        this.nome = nome;
        this.usuarios = new ArrayList<>();
        this.postagens = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public void adicionarUsuario(Usuario usuario) {
        usuarios.add(usuario);
    }

    public void publicar(Postagem postagem) {
        postagens.add(postagem);
    }

    public Postagem publicar(Usuario autor, String texto) {
        Postagem postagem = new Postagem(postagens.size() + 1, autor, texto);
        postagens.add(postagem);
        return postagem;
    }

    public PostagemImagem publicar(Usuario autor, String texto, String urlImagem) {
        PostagemImagem postagem = new PostagemImagem(postagens.size() + 1, autor, texto, urlImagem);
        postagens.add(postagem);
        return postagem;
    }

    public List<Usuario> getUsuarios() {
        return Collections.unmodifiableList(usuarios);
    }

    public List<Postagem> getPostagens() {
        return Collections.unmodifiableList(postagens);
    }
}
