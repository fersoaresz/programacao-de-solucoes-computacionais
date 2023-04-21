package atividade2;
import java.util.Scanner;
public class Q5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Digite um valor para x: ");
        double x = input.nextDouble();

        double result;
        if (x < -2) {
            result = 2 * x + 2;
        } else if (x < 3) {
            result = 3;
        } else {
            result = -x;
        }

        System.out.println("O valor de f(x) para x = " + x + " é " + result);
    }
}
