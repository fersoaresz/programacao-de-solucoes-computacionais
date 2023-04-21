package atividade2;
import java.util.Scanner;

public class Q4  {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("digite o peso: ");
        double peso = scanner.nextDouble();
        
        System.out.print("digite a altura: ");
        double altura = scanner.nextDouble();
        
        double imc = peso / (altura * altura);
        
        
        if (imc < 20) {
            System.out.println("Abaixo do Peso");
        } else if (imc < 25) {
            System.out.println("Normal");
        } else if (imc < 30) {
            System.out.println("Sobrepeso");
        } else if (imc < 40){
            System.out.println("Obesidade");
        }
        else {
        	System.out.println("obesidade morbida");
        }
        scanner.close();
    }
}