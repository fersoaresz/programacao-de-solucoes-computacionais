package atividade1;
import java.util.Scanner;
public class Q3  {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("digite o valor do dolar em real: ");
        double cotacao = input.nextDouble();

        System.out.print("digite o valor em dolares: ");
        double valorDolar = input.nextDouble();

        double valorReal = cotacao * valorDolar;

        System.out.println("valor em reais: R$" + valorReal);
    }
}