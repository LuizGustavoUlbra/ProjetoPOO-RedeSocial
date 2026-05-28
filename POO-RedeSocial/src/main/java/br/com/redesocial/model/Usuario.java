package br.com.redesocial.model;

public class Usuario {
    private int id;
    private String email;
    private String senha;
    private Perfil perfil;

    public Usuario(int id, String email, String senha, String nomeExibicao) {
        this.id = id;
        this.email = email;
        this.senha = senha;
        this.perfil = new Perfil(nomeExibicao, "", "");
    }

    public int getId() {
        return id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public Perfil getPerfil() {
        return perfil;
    }

    public void atualizarPerfil(String nomeExibicao, String biografia, String fotoUrl) {
        this.perfil.setNomeExibicao(nomeExibicao);
        this.perfil.setBiografia(biografia);
        this.perfil.setFotoUrl(fotoUrl);
    }
}
