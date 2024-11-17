package org.example;

import java.util.List;

/*
    Classe ControladorDeRotas, essa classe atua como um Facade para interagir com a BaseDeRotas
    abstraindo os detalhes da implementação para o restante do sistema. Se a base mudar um dia, o restante
    do código não precisa ser alterado
*/
class ControladorDeRotas {

    private final BaseDeRotas baseDeRotas;

    public ControladorDeRotas() {
        this.baseDeRotas = BaseDeRotas.getInstancia();
    }

    public List<Rota> consultarRotas(Endereco origem, Endereco destino) {
        return baseDeRotas.consultarRotas(origem, destino);
    }
}