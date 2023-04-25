package atividade5;
import java.util.Scanner;

public class Q911 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = 10; // número de pessoas
        int contMasc60a80 = 0; // contador de homens com peso entre 60 e 80 kg
        int contFem50a70 = 0; // contador de mulheres com peso entre 50 e 70 kg
        for (int i = 1; i <= n; i++) {
            System.out.printf("Dados da pessoa %d:\n", i);
            System.out.print("Sexo (M/F): ");
            char sexo = input.next().charAt(0);
            System.out.print("Peso (kg): ");
            double peso = input.nextDouble();
            if (sexo == 'M') {
                if (peso >= 60 && peso <= 80) {
                    contMasc60a80++;
                }
            } else if (sexo == 'F') {
                System.out.print("Idade: ");
                int idade = input.nextInt();
                if (idade >= 20 && idade <= 40 && peso >= 50 && peso <= 70) {
                    contFem50a70++;
                }
            }
        }
        System.out.printf("Numero de homens com peso entre 60 e 80 kg: %d\n", contMasc60a80);
        System.out.printf("Numero de mulheres com peso entre 50 e 70 kg: %d\n", contFem50a70);
    }
}
