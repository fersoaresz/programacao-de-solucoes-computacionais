package atividade910;

import java.util.Arrays;
import java.util.Scanner;

public class Q1 {
    public static void ordenarBolha(int[] vetor) {
        int n = vetor.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (vetor[j] > vetor[j + 1]) {
                    int temp = vetor[j];
                    vetor[j] = vetor[j + 1];
                    vetor[j + 1] = temp;
                }
            }
        }
    }

    public static void ordenarSelecao(int[] vetor) {
        int n = vetor.length;
        for (int i = 0; i < n - 1; i++) {
            int indiceMinimo = i;
            for (int j = i + 1; j < n; j++) {
                if (vetor[j] < vetor[indiceMinimo]) {
                    indiceMinimo = j;
                }
            }
            int temp = vetor[indiceMinimo];
            vetor[indiceMinimo] = vetor[i];
            vetor[i] = temp;
        }
    }

    public static void ordenarInsercao(int[] vetor) {
        int n = vetor.length;
        for (int i = 1; i < n; i++) {
            int chave = vetor[i];
            int j = i - 1;
            while (j >= 0 && vetor[j] > chave) {
                vetor[j + 1] = vetor[j];
                j--;
            }
            vetor[j + 1] = chave;
        }
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        while (true) {
            System.out.println("Escolha o método de ordenação:");
            System.out.println("1. Ordenação Bolha");
            System.out.println("2. Ordenação por Seleção");
            System.out.println("3. Ordenação por Inserção");
            System.out.println("4. Sair");
            System.out.print("Opção: ");
            int opcao = entrada.nextInt();

            if (opcao == 4) {
                System.out.println("Encerrando o programa...");
                break;
            }

            System.out.println("Digite 10 números inteiros:");
            int[] vetor = new int[10];
            for (int i = 0; i < 10; i++) {
                vetor[i] = entrada.nextInt();
            }

            switch (opcao) {
                case 1:
                    ordenarBolha(vetor);
                    break;
                case 2:
                    ordenarSelecao(vetor);
                    break;
                case 3:
                    ordenarInsercao(vetor);
                    break;
                default:
                    System.out.println("Opção inválida!");
                    continue;
            }

            System.out.println("Vetor ordenado: " + Arrays.toString(vetor));
        }
    }
}