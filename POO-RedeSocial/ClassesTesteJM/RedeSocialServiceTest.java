class RedeSocialServiceTest {
    @Test
    void deveCadastrarUsuarioNaRedeSocial() {
        RedeSocial redeSocial = new RedeSocial("MiniSocial");
        RedeSocialService service = new RedeSocialService(redeSocial);

        Usuario usuario = service.cadastrarUsuario("teste@email.com", "123", "Teste");

        assertEquals(1, usuario.getId());
        assertEquals("Teste", usuario.getPerfil().getNomeExibicao());
        assertEquals(1, redeSocial.getUsuarios().size());
    }

    @Test
    void deveGerarIdsDiferentesParaUsuariosCadastrados() {
        RedeSocial redeSocial = new RedeSocial("MiniSocial");
        RedeSocialService service = new RedeSocialService(redeSocial);

        Usuario usuario1 = service.cadastrarUsuario("u1@email.com", "123", "Usuário 1");
        Usuario usuario2 = service.cadastrarUsuario("u2@email.com", "123", "Usuário 2");

        assertEquals(1, usuario1.getId());
        assertEquals(2, usuario2.getId());
    }

    @Test
    void deveCriarPostagemDeTextoPeloService() {
        RedeSocial redeSocial = new RedeSocial("MiniSocial");
        RedeSocialService service = new RedeSocialService(redeSocial);
        Usuario usuario = service.cadastrarUsuario("autor@email.com", "123", "Autor");

        Postagem postagem = service.criarPostagemTexto(usuario, "Primeira postagem");

        assertEquals("Primeira postagem", postagem.getTexto());
        assertEquals(1, redeSocial.getPostagens().size());
    }

    @Test
    void deveCriarPostagemComImagemPeloService() {
        RedeSocial redeSocial = new RedeSocial("MiniSocial");
        RedeSocialService service = new RedeSocialService(redeSocial);
        Usuario usuario = service.cadastrarUsuario("autor@email.com", "123", "Autor");

        PostagemImagem postagem = service.criarPostagemImagem(usuario, "Postagem com foto", "foto.png");

        assertEquals("Postagem com foto", postagem.getTexto());
        assertEquals("foto.png", postagem.getUrlImagem());
        assertEquals(1, redeSocial.getPostagens().size());
    }
}
