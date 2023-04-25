package atividade5;
import java.util.Scanner;

public class Q6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int soma = 0;
        int idade;

        for (int i = 1; i <= 10; i++) {
            System.out.print("Informe a idade da " + i + "ª pessoa: ");
            idade = input.nextInt();
            soma += idade;
        }

        double media = soma / 10.0;
        System.out.println("A média das idades é: " + media);

        input.close();
    }
}






