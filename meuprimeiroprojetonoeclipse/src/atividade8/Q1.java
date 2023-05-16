package atividade8;

import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o dividendo (número a ser dividido):");
        int dividendo = entrada.nextInt();

        System.out.println("Digite o divisor (número pelo qual será dividido):");
        int divisor = entrada.nextInt();

        try {
            Q1.divide(dividendo, divisor);
        } catch (ArithmeticException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }

	private static void divide(int dividendo, int divisor) {
		
		
	}
}