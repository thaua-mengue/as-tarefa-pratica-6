package org.example;

import java.util.List;

// Classe Principal
public class Main {
    public static void main(String[] args) {
        // Criar um usuário mockado
        Usuario usuario = new Usuario("João", "joao@email.com", "senha123");

        // Fluxo de login
        Login login = new Login();
        Sessao sessao = new Sessao();

        if (login.validarCredenciais(usuario, "joao@email.com", "senha123")) {
            sessao.iniciarSessao(usuario);
        } else {
            System.out.println("Credenciais inválidas!");
            return;
        }

        // Consultar rotas
        ControladorDeRotas controladorDeRotas = new ControladorDeRotas();
        Endereco origem = new Endereco("Rua A", 100, "Cidade1", "Estado1", "11111-111");
        Endereco destino = new Endereco("Rua B", 200, "Cidade2", "Estado1", "22222-222");
        List<Rota> rotas = controladorDeRotas.consultarRotas(origem, destino);

        System.out.println("Rotas disponíveis:");
        for (int i = 0; i < rotas.size(); i++) {
            System.out.println("Rota " + (i + 1) + ":\n" + rotas.get(i).getDetalhes() + "\n");
        }

        // Selecionar uma rota e iniciar deslocamento
        if (!rotas.isEmpty()) {
            ControladorDeDeslocamento controladorDeDeslocamento = new ControladorDeDeslocamento();
            controladorDeDeslocamento.iniciarDeslocamento(rotas.get(0));
        }

        // Encerrar sessão
        sessao.encerrarSessao();
    }
}