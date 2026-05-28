package br.com.redesocial.service;

import br.com.redesocial.model.Postagem;
import br.com.redesocial.model.PostagemImagem;
import br.com.redesocial.model.RedeSocial;
import br.com.redesocial.model.Usuario;

public class RedeSocialService {
    private RedeSocial redeSocial;
    private int proximoIdUsuario = 1;

    public RedeSocialService(RedeSocial redeSocial) {
        this.redeSocial = redeSocial;
    }

    public Usuario cadastrarUsuario(String email, String senha, String nomeExibicao) {
        Usuario usuario = new Usuario(proximoIdUsuario, email, senha, nomeExibicao);
        proximoIdUsuario++;
        redeSocial.adicionarUsuario(usuario);
        return usuario;
    }

    public Postagem criarPostagemTexto(Usuario autor, String texto) {
        return redeSocial.publicar(autor, texto);
    }

    public PostagemImagem criarPostagemImagem(Usuario autor, String texto, String urlImagem) {
        return redeSocial.publicar(autor, texto, urlImagem);
    }
}
