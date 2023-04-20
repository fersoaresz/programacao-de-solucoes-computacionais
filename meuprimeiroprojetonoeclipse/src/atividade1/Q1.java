package atividade1;
import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("digite sua primeira nota:");
        double nota1 = input.nextDouble();

        System.out.println("digite sua segunda nota:");
        double nota2 = input.nextDouble();

        System.out.println("digite sua terceira nota:");
        double nota3 = input.nextDouble();

        double media = (nota1 + nota2 + nota3) / 3;

        System.out.println("a media das notas é: " + media);
    }
}