package br.com.redesocial.model;

public class PostagemImagem extends Postagem {
    private String urlImagem;

    public PostagemImagem(int id, Usuario autor, String texto, String urlImagem) {
        super(id, autor, texto);
        this.urlImagem = urlImagem;
    }

    public String getUrlImagem() {
        return urlImagem;
    }

    public void setUrlImagem(String urlImagem) {
        this.urlImagem = urlImagem;
    }

    @Override
    public String exibir() {
        return "Postagem com imagem de " + getAutor().getPerfil().getNomeExibicao()
                + ": " + getTexto() + " [Imagem: " + urlImagem + "]";
    }
}
