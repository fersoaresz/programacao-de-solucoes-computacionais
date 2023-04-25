package atividade5;
import java.util.Scanner;

public class Q8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a base: ");
        int base = sc.nextInt();

        System.out.print("Digite o expoente: ");
        int expoente = sc.nextInt();

        int resultado = 1;
        for (int i = 1; i <= expoente; i++) {
            resultado *= base;
        }

        System.out.printf("%d elevado a %d = %d", base, expoente, resultado);
        sc.close();
    }
}