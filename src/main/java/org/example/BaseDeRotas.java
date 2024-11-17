package org.example;

import java.util.ArrayList;
import java.util.List;

// Classe BaseDeRotas
class BaseDeRotas {
    private static List<Rota> rotas = new ArrayList<>();

    static {
        // Rotas mockadas
        Endereco origem1 = new Endereco("Rua A", 100, "Cidade1", "Estado1", "11111-111");
        Endereco destino1 = new Endereco("Rua B", 200, "Cidade2", "Estado1", "22222-222");
        rotas.add(new Rota(origem1, destino1, 10.0, 20.0));

        Endereco origem2 = new Endereco("Rua C", 300, "Cidade3", "Estado2", "33333-333");
        Endereco destino2 = new Endereco("Rua D", 400, "Cidade4", "Estado2", "44444-444");
        rotas.add(new Rota(origem2, destino2, 15.0, 30.0));
    }

    public static List<Rota> consultarRotas(Endereco enderecoPartida, Endereco enderecoDestino) {
        // Aqui poderíamos implementar filtros reais, mas retornaremos todas para simplificação
        return rotas;
    }
}