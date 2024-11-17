package org.example;

// Classe Endereco, aqui está sendo aplicado o padrão especialista pois a classe encapsula os dados
// e comportamentos diretamente relacionados a ela
class Endereco {
    private String rua;
    private int numero;
    private String cidade;
    private String estado;
    private String cep;

    public Endereco(String rua, int numero, String cidade, String estado, String cep) {
        this.rua = rua;
        this.numero = numero;
        this.cidade = cidade;
        this.estado = estado;
        this.cep = cep;
    }

    public String getEnderecoCompleto() {
        return rua + ", " + numero + ", " + cidade + ", " + estado + " - " + cep;
    }
}