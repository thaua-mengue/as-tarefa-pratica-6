package org.example;

// Classe Sessao
class Sessao {
    private Usuario usuario;

    public void iniciarSessao(Usuario usuario) {
        this.usuario = usuario;
        System.out.println("Sessão iniciada para o usuário: " + usuario.getNome());
    }

    public void encerrarSessao() {
        this.usuario = null;
        System.out.println("Sessão encerrada.");
    }

    public Usuario getUsuario() {
        return usuario;
    }
}