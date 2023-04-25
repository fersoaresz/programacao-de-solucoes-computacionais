package atividade5;
import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero, menor = Integer.MAX_VALUE, maior = Integer.MIN_VALUE;
        
        while (true) {
            System.out.print("Informe um numero inteiro (ou 0 para sair): ");
            numero = scanner.nextInt();
            
            if (numero == 0) {
                break;
            }
            
            if (numero < menor) {
                menor = numero;
            }
            
            if (numero > maior) {
                maior = numero;
            }
        }
        
        if (menor == Integer.MAX_VALUE || maior == Integer.MIN_VALUE) {
            System.out.println("Nenhum numero foi informado!");
        } else {
            System.out.println("Menor numero informado: " + menor);
            System.out.println("Maior numero informado: " + maior);
        }
        
        scanner.close();
    }
}
