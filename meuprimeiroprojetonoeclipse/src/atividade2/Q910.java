package atividade2;
import java.util.Scanner;

public class Q910 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        double num1 = sc.nextDouble();

        System.out.print("Digite o segundo número: ");
        double num2 = sc.nextDouble();

        System.out.println("Escolha uma operação: ");
        System.out.println("1 - Somar os dois números.");
        System.out.println("2 - Multiplicar os dois números.");
        System.out.println("3 - Subtrair o número maior pelo número menor.");
        System.out.println("4 - Dividir o primeiro número pelo segundo.");

        int opcao = sc.nextInt();
        double resultado = 0;

        switch (opcao) {
            case 1:
                resultado = num1 + num2;
                break;
            case 2:
                resultado = num1 * num2;
                break;
            case 3:
                resultado = Math.abs(num1 - num2);
                break;
            case 4:
                if (num2 == 0) {
                    System.out.println("Não é possível dividir por zero!");
                    return;
                }
                resultado = num1 / num2;
                break;
            default:
                System.out.println("Opção inválida!");
                return;
        }

        System.out.println("Resultado: " + resultado);
    }
}
