package atividade2;
import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Digite o primeiro lado do triângulo: ");
        double lado1 = input.nextDouble();
        
        System.out.print("Digite o segundo lado do triângulo: ");
        double lado2 = input.nextDouble();
        
        System.out.print("Digite o terceiro lado do triângulo: ");
        double lado3 = input.nextDouble();
        
        if (lado1 == lado2 && lado1 == lado3) {
            System.out.println("Triângulo equilátero.");
        } else if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3) {
            System.out.println("Triângulo isósceles.");
        } else {
            System.out.println("Triângulo escaleno.");
        }
    }
}
