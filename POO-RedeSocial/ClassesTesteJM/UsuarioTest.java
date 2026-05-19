class UsuarioTest {
    @Test
    void deveCriarUsuarioComPerfil() {
        Usuario usuario = new Usuario(1, "teste@email.com", "123", "Teste");

        assertEquals(1, usuario.getId());
        assertEquals("teste@email.com", usuario.getEmail());
        assertNotNull(usuario.getPerfil());
        assertEquals("Teste", usuario.getPerfil().getNomeExibicao());
    }

    @Test
    void deveAtualizarPerfilDoUsuario() {
        Usuario usuario = new Usuario(1, "teste@email.com", "123", "Teste");

        usuario.atualizarPerfil("Novo Nome", "Bio atualizada", "foto.png");

        assertEquals("Novo Nome", usuario.getPerfil().getNomeExibicao());
        assertEquals("Bio atualizada", usuario.getPerfil().getBiografia());
        assertEquals("foto.png", usuario.getPerfil().getFotoUrl());
    }
}
