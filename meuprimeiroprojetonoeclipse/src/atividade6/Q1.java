package atividade6;

import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int[] numerosInteiros = new int[10];
        double[] numerosReais = new double[10];

        System.out.println("Digite 10 números inteiros:");
        for (int i = 0; i < 10; i++) {
            numerosInteiros[i] = entrada.nextInt();
        }

        System.out.println("Vetor de números inteiros:");
        for (int i = 0; i < 10; i++) {
            System.out.print(numerosInteiros[i] + " ");
        }
        System.out.println();

        int somaPares = 0;
        for (int i = 0; i < 10; i++) {
            if (numerosInteiros[i] % 2 == 0) {
                somaPares += numerosInteiros[i];
            }
        }

        System.out.println("A soma dos números pares é: " + somaPares);
        System.out.println();

        System.out.println("Digite 10 números reais:");
        for (int i = 0; i < 10; i++) {
            numerosReais[i] = entrada.nextDouble();
        }

        System.out.println("Vetor de números reais:");
        for (int i = 0; i < 10; i++) {
            System.out.print(numerosReais[i] + " ");
        }
        System.out.println();

        System.out.println("Posições dos números negativos:");
        for (int i = 0; i < 10; i++) {
            if (numerosReais[i] < 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
        System.out.println();

        double menor = numerosReais[0];
        double maior = numerosReais[0];
        for (int i = 1; i < 10; i++) {
            if (numerosReais[i] < menor) {
                menor = numerosReais[i];
            }
            if (numerosReais[i] > maior) {
                maior = numerosReais[i];
            }
        }

        System.out.println("Menor número informado: " + menor);
        System.out.println("Maior número informado: " + maior);
        System.out.println();

        System.out.println("Elementos armazenados nas posições pares:");
        for (int i = 0; i < 10; i += 2) {
            System.out.print(numerosReais[i] + " ");
        }
        System.out.println();
    }
}