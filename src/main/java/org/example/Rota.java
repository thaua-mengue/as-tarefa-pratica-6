package org.example;

// Classe Rota, aqui está sendo aplicado o padrão especialista pois a classe encapsula os dados
// e comportamentos diretamente relacionados a ela
class Rota {
    private Endereco origem;
    private Endereco destino;
    private double distancia;
    private double duracao;

    public Rota(Endereco origem, Endereco destino, double distancia, double duracao) {
        this.origem = origem;
        this.destino = destino;
        this.distancia = distancia;
        this.duracao = duracao;
    }

    public String getDetalhes() {
        return "Origem: " + origem.getEnderecoCompleto() + "\n" +
                "Destino: " + destino.getEnderecoCompleto() + "\n" +
                "Distância: " + distancia + " km\n" +
                "Duração: " + duracao + " min";
    }
}