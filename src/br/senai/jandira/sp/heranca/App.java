package br.senai.jandira.sp.heranca;

import br.senai.jandira.sp.heranca.model.Jogador;

public class App {
    public static void main(String[] args) {

        Jogador jogador = new Jogador();
        jogador.cadastrarJogador();

        System.out.println(jogador.getNome());
        System.out.println(jogador.getIdade());
        System.out.println(jogador.getPosicao());
        System.out.println(jogador.getNumeroCamisa());

    }
}
