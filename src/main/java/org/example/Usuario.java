package org.example;

// Classe Usuario, aqui está sendo aplicado o padrão especialista pois a classe encapsula os dados
// e comportamentos diretamente relacionados a ela
class Usuario {
    private String nome;
    private String email;
    private String senha;

    public Usuario(String nome, String email, String senha) {
        this.nome = nome;
        this.email = email;
        this.senha = senha;
    }

    public boolean fazerLogin(String email, String senha) {
        return this.email.equals(email) && this.senha.equals(senha);
    }

    public String getNome() {
        return nome;
    }
}
