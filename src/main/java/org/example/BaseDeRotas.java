package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

// Classe BaseDeRotas
class BaseDeRotas {

    /*
    Tornando a classe um Singleton para garantir que exista apenas uma instancia centralizada da mesma.

    Aqui foi aplicado o padrão de alta coesão, uma vez que a classe lida exclusivamente as rotas.
    */
    private static BaseDeRotas instancia;
    private List<Rota> rotas;

    private BaseDeRotas() {
        rotas = new ArrayList<>();
        // Rotas mockadas
        Endereco origem1 = EnderecoFactory.criarEndereco("Rua A", 100, "Cidade1", "Estado1", "11111-111");
        Endereco destino1 = EnderecoFactory.criarEndereco("Rua B", 200, "Cidade2", "Estado1", "22222-222");
        rotas.add(RotaFactory.criarRota(origem1, destino1, 10.0, 20.0));

        Endereco origem2 = EnderecoFactory.criarEndereco("Rua C", 300, "Cidade3", "Estado2", "33333-333");
        Endereco destino2 = EnderecoFactory.criarEndereco("Rua D", 400, "Cidade4", "Estado2", "44444-444");
        rotas.add(RotaFactory.criarRota(origem2, destino2, 15.0, 30.0));
    }

    public static BaseDeRotas getInstancia() {
        if (Objects.isNull(instancia)) {
            instancia = new BaseDeRotas();
        }
        return instancia;
    }

    public List<Rota> consultarRotas(Endereco enderecoPartida, Endereco enderecoDestino) {
        // Aqui poderíamos implementar filtros reais, mas retornaremos todas para simplificação
        return rotas;
    }
}