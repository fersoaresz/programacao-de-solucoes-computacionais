package atividade5;
import java.util.Scanner;

public class Q7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int num, maior, menor;
        
        System.out.println("Digite o 1º número:");
        num = input.nextInt();
        maior = num;
        menor = num;
        
        for(int i = 2; i <= 10; i++) {
            System.out.println("Digite o " + i + "º número:");
            num = input.nextInt();
            
            if(num > maior) {
                maior = num;
            }
            
            if(num < menor) {
                menor = num;
            }
        }
        
        System.out.println("Maior número informado: " + maior);
        System.out.println("Menor número informado: " + menor);
        
        input.close();
    }
}