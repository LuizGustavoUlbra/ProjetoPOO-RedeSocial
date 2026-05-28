package br.com.redesocial.model;

public class Perfil {
    private String nomeExibicao;
    private String biografia;
    private String fotoUrl;

    public Perfil(String nomeExibicao, String biografia, String fotoUrl) {
        this.nomeExibicao = nomeExibicao;
        this.biografia = biografia;
        this.fotoUrl = fotoUrl;
    }

    public String getNomeExibicao() {
        return nomeExibicao;
    }

    public void setNomeExibicao(String nomeExibicao) {
        this.nomeExibicao = nomeExibicao;
    }

    public String getBiografia() {
        return biografia;
    }

    public void setBiografia(String biografia) {
        this.biografia = biografia;
    }

    public String getFotoUrl() {
        return fotoUrl;
    }

    public void setFotoUrl(String fotoUrl) {
        this.fotoUrl = fotoUrl;
    }
}
