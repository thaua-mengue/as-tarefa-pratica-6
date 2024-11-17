package org.example;

import java.util.List;

/*
    Classe ControladorDeRotas, essa classe atua como um Facade para interagir com a BaseDeRotas
    abstraindo os detalhes da implementação para o restante do sistema. Se a base mudar um dia, o restante
    do código não precisa ser alterado

   Aqui também foi aplicado o padrão Controlador para centralizar a lógica da aplicação
   Separando as responsabilidades e mantendo a interface do sistema mais simples

   Outro padrão aplicado foi o de baixo acomplamento, pois o controlador interage com a base de rotas
   sem precisar saber como a lista é gerenciada
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