package org.example;

// Classe ControladorDeDeslocamento, aqui foi aplicado o padrão Controlador para centralizar a lógica da aplicação
// Separando as responsabilidades e mantendo a interface do sistema mais simples
class ControladorDeDeslocamento {

    // TODO adicionar observers para enviar notificações para o usuario como chegada ao destino, alterações de rota etc


    public void iniciarDeslocamento(Rota rota) {
        System.out.println("Deslocamento iniciado!");
        System.out.println(rota.getDetalhes());
    }
}