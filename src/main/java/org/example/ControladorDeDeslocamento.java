package org.example;

// Classe ControladorDeDeslocamento
class ControladorDeDeslocamento {

    // TODO adicionar observers para enviar notificações para o usuario como chegada ao destino, alterações de rota etc


    public void iniciarDeslocamento(Rota rota) {
        System.out.println("Deslocamento iniciado!");
        System.out.println(rota.getDetalhes());
    }
}