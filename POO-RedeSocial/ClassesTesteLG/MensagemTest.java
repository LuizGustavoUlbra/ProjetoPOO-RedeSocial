class MensagemTest {
    @Test
    void deveCriarMensagemComRemetenteDestinatarioEConteudo() {
        Usuario remetente = new Usuario(1, "ana@email.com", "123", "Ana");
        Usuario destinatario = new Usuario(2, "gustavo@email.com", "123", "Gustavo");

        Mensagem mensagem = new Mensagem(remetente, destinatario, "Olá, tudo bem?");

        assertEquals(remetente, mensagem.getRemetente());
        assertEquals(destinatario, mensagem.getDestinatario());
        assertEquals("Olá, tudo bem?", mensagem.getConteudo());
        assertNotNull(mensagem.getDataEnvio());
    }

    @Test
    void deveExibirMensagemComNomesDosUsuarios() {
        Usuario remetente = new Usuario(1, "ana@email.com", "123", "Ana");
        Usuario destinatario = new Usuario(2, "gustavo@email.com", "123", "Gustavo");
        Mensagem mensagem = new Mensagem(remetente, destinatario, "Mensagem teste");

        String resultado = mensagem.exibir();

        assertTrue(resultado.contains("Ana"));
        assertTrue(resultado.contains("Gustavo"));
        assertTrue(resultado.contains("Mensagem teste"));
    }
}
