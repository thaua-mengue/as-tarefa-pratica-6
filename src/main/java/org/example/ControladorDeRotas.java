package org.example;

import java.util.List;

// Classe ControladorDeRotas
class ControladorDeRotas {

    private final BaseDeRotas baseDeRotas;

    public ControladorDeRotas() {
        this.baseDeRotas = BaseDeRotas.getInstancia();
    }

    public List<Rota> consultarRotas(Endereco origem, Endereco destino) {
        return baseDeRotas.consultarRotas(origem, destino);
    }
}