package br.senai.jandira.sp.heranca.model;

import java.util.Scanner;

public class Jogador extends Pessoas {

    String posicao;
    int numeroCamisa;
    Scanner scanner = new Scanner(System.in);
    public void cadastrarJogador(){
        System.out.println("/--------- Cadastro ---------/");
        System.out.println("Informe o nome:  ");
        super.nome = scanner.nextLine();
        System.out.println("Informe a Idade:  ");
        super.idade = scanner.nextInt();
        System.out.println("Informe o CPF:   ");
        super.cpf = scanner.nextLong();
        scanner.nextLine();
        System.out.println("Informe a posição:   ");
        posicao = scanner.nextLine();
        System.out.println("Informe o numero da camisa:   ");
        numeroCamisa = scanner.nextInt();
        scanner.nextLine();
    }

    public String getPosicao() {
        return posicao;
    }

    public void setPosicao(String posicao) {
        this.posicao = posicao;
    }

    public int getNumeroCamisa() {
        return numeroCamisa;
    }

    public void setNumeroCamisa(int numeroCamisa) {
        this.numeroCamisa = numeroCamisa;
    }

    public Scanner getScanner() {
        return scanner;
    }

    public void setScanner(Scanner scanner) {
        this.scanner = scanner;
    }
}
