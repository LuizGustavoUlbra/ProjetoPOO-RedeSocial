package br.com.redesocial.interfaces;

import br.com.redesocial.model.Comentario;
import br.com.redesocial.model.Usuario;

public interface Interativo {
    void curtir(Usuario usuario);
    void comentar(Comentario comentario);
    int getTotalCurtidas();
}
