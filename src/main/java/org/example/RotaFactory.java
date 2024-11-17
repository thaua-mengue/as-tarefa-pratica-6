package org.example;

// Adicionando Factory para centralizar a criação de rotas
public class RotaFactory {

    public static Rota criarRota(Endereco origem, Endereco destino, double distancia, double duracao) {
        return new Rota(origem, destino, distancia, duracao);
    }
}
