package atividade9;

import java.util.Scanner;

public class Q1  {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int[] vetor = new int[10];

        System.out.println("Digite 10 números inteiros:");

        for (int i = 0; i < 10; i++) {
            vetor[i] = entrada.nextInt();
        }

        while (true) {
            System.out.println("\nDigite o número a ser pesquisado (ou -1 para sair):");
            int numero = entrada.nextInt();

            if (numero == -1) {
                System.out.println("Encerrando o programa...");
                break;
            }

            System.out.println("\nEscolha o algoritmo de busca:");
            System.out.println("1. Pesquisa Sequencial");
            System.out.println("2. Pesquisa Sequencial com Sentinela");
            System.out.print("Opção: ");
            int opcao = entrada.nextInt();

            int comparacoes = 0;
            boolean encontrado = false;

            switch (opcao) {
                case 1:
                    comparacoes = pesquisaSequencial(vetor, numero);
                    encontrado = comparacoes != -1;
                    break;
                case 2:
                    comparacoes = pesquisaSequencialSentinela(vetor, numero);
                    encontrado = comparacoes != -1;
                    break;
                default:
                    System.out.println("Opção inválida!");
                    break;
            }

            if (encontrado) {
                System.out.println("\nNúmero encontrado!");
                System.out.println("Realizadas " + comparacoes + " comparações.");
            } else {
                System.out.println("\nNúmero não encontrado!");
                System.out.println("Realizadas " + comparacoes + " comparações.");
            }
        }
    }

    public static int pesquisaSequencial(int[] vetor, int numero) {
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] == numero) {
                return i + 1;
            }
        }
        return -1;
    }

    public static int pesquisaSequencialSentinela(int[] vetor, int numero) {
        int i = 0;
        vetor[vetor.length - 1] = numero; 
        while (vetor[i] != numero) {
            i++;
        }
        if (i < vetor.length - 1) {
            return i + 1;
        } else {
            return -1;
        }
    }
}