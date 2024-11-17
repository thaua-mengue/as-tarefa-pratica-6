package org.example;

import java.util.List;

// Classe ControladorDeRotas
class ControladorDeRotas {
    public List<Rota> consultarRotas(Endereco origem, Endereco destino) {
        return BaseDeRotas.consultarRotas(origem, destino);
    }
}