package atividade2;
import java.util.Scanner;

public class Q7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Digite o valor de a: ");
        double a = sc.nextDouble();
        
        System.out.print("Digite o valor de b: ");
        double b = sc.nextDouble();
        
        System.out.print("Digite o valor de c: ");
        double c = sc.nextDouble();
        
        if (a == 0 && b == 0 && c == 0) {
            System.out.println("Igualdade confirmada: 0 = 0");
        } else if (a == 0 && b == 0 && c != 0) {
            System.out.println("Coeficientes informados incorretamente");
        } else if (a == 0 && b != 0) {
            double x = -c / b;
            System.out.printf("Esta é uma equação de primeiro grau: x = %.2f\n", x);
        } else {
            double delta = Math.pow(b, 2) - 4 * a * c;
            
            if (delta < 0) {
                System.out.printf("Esta é uma equação de segundo grau. Esta equação não possui raízes reais (delta < 0): delta = %.2f\n", delta);
            } else if (delta == 0) {
                double x = -b / (2 * a);
                System.out.printf("Esta é uma equação de segundo grau. Esta equação possui duas raízes reais iguais: x' = x'' = %.2f\n", x);
            } else {
                double x1 = (-b + Math.sqrt(delta)) / (2 * a);
                double x2 = (-b - Math.sqrt(delta)) / (2 * a);
                System.out.printf("Esta é uma equação de segundo grau. Esta equação possui duas raízes reais diferentes: delta = %.2f, x' = %.2f, x'' = %.2f\n", delta, x1, x2);
            }
        }
        
        sc.close();
    }
}