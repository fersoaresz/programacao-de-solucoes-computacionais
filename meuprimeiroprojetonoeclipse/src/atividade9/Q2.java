package atividade9;

import java.util.Scanner;

public class Q2 {
    
    public static int pesquisaBinaria(int[] vetor, int numero) {
        int esquerda = 0;
        int direita = vetor.length - 1;
        int comparacoes = 0;

        while (esquerda <= direita) {
            int meio = (esquerda + direita) / 2;

            if (vetor[meio] == numero) {
                comparacoes++;
                return comparacoes;
            } else if (vetor[meio] < numero) {
                comparacoes++;
                esquerda = meio + 1;
            } else {
                comparacoes++;
                direita = meio - 1;
            }
        }

        return -1;
    }
}
