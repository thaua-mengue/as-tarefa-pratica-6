package org.example;

public class AlteracaoRotaObserver implements DeslocamentoObserver {
    @Override
    public void notificar(String mensagem) {
        System.out.println("Emitiu" + mensagem);
    }
}
