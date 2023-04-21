package atividade1;
import java.util.Scanner;
public class Q9910 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite o valor do raio: ");
        double raio = input.nextDouble();

        double comprimento = 2 * Math.PI * raio;
        double area = Math.PI * Math.pow(raio, 2);
        double volume = (3.0 / 4.0) * Math.PI * Math.pow(raio, 3);

        System.out.println("Comprimento da esfera: " + comprimento);
        System.out.println("Área da esfera: " + area);
        System.out.println("Volume da esfera: " + volume);
    }
}