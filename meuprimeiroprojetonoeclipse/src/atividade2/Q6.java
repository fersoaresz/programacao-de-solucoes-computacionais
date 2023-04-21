package atividade2;
import java.util.Scanner;

public class Q6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b, c;

        System.out.print("Informe o primeiro lado em cm: ");
        a = sc.nextInt();
        System.out.print("Informe o segundo lado em cm: ");
        b = sc.nextInt();
        System.out.print("Informe o terceiro lado em cm: ");
        c = sc.nextInt();

        if (a < b + c && b < a + c && c < a + b && Math.abs(b - c) < a && Math.abs(a - c) < b && Math.abs(a - b) < c) {
            System.out.println("Os valores  podem ser os comprimentos dos lados de um triangulo.");
        } else {
            System.out.println("Os valores não podem ser os comprimentos dos lados de um triangulo.");
        }
    }
}
