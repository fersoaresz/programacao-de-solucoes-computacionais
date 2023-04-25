package atividade5;
import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um numero natural: ");
        int n = scanner.nextInt();

        if (n < 0) {
            System.out.println("Numero invalido.");
        } else {
            int fatorial = 1;
            for (int i = 2; i <= n; i++) {
                fatorial *= i;
            }
            System.out.println(n + "! = " + fatorial);
        }
    }
}





