package org.example;

// Classe Login
class Login {
    public boolean validarCredenciais(Usuario usuario, String email, String senha) {
        return usuario.fazerLogin(email, senha);
    }
}