package org.example;

import java.util.ArrayList;
import java.util.List;

// Classe ControladorDeDeslocamento, aqui foi aplicado o padrão Controlador para centralizar a lógica da aplicação
// Separando as responsabilidades e mantendo a interface do sistema mais simples
class ControladorDeDeslocamento {
    private List<DeslocamentoObserver> observers = new ArrayList<>();

    public void registrarObserver(DeslocamentoObserver observer) {
        observers.add(observer);
    }

    public void removerObserver(AlteracaoDeslocamentoObserver observer) {
        observers.remove(observer);
    }

    private void notificarObservers(String mensagem) {
        for (DeslocamentoObserver observer : observers) {
            observer.notificar(mensagem);
        }
    }

    public void iniciarDeslocamento(Rota rota) {
        System.out.println("Deslocamento iniciado!");
        System.out.println(rota.getDetalhes());
        notificarObservers("Deslocamento iniciado para a rota: " + rota.getDetalhes());
    }

    public void chegadaAoDestino() {
        notificarObservers("Chegada ao destino.");
    }

    public void alteracaoDeRota() {
        notificarObservers("Rota alterada.");
    }
}