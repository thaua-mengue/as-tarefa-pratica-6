package org.example;

// Adicionando Factory para centralizar a criação de endereços
public class EnderecoFactory {

    public static Endereco criarEndereco(String rua, int numero, String cidade, String estado, String cep) {
        return new Endereco(rua, numero, cidade, estado, cep);
    }
}
