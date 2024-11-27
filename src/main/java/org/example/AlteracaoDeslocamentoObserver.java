package org.example;

public class AlteracaoDeslocamentoObserver implements DeslocamentoObserver {

    @Override
    public void notificar(String mensagem) {
        System.out.println(mensagem);
    }
}
