package atividade5;
import java.util.Scanner;

public class Q9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um numero: ");
        int num = sc.nextInt();
        System.out.print("Numeros impares de 1 ate " + num + ": ");
        for (int i = 1; i <= num; i++) {
            if (i % 2 != 0) {
                System.out.print(i + " ");
            }
        }
        sc.close();
    }
}
