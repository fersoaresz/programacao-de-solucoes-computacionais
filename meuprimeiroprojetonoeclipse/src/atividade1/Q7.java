package atividade1;
import java.util.Scanner;
public class Q7 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double salarioMinimo, salarioFuncionario, quantidadeSalarios;

        System.out.print("Digite o valor do salário mínimo: ");
        salarioMinimo = input.nextDouble();

        System.out.print("Digite o salário do funcionário: ");
        salarioFuncionario = input.nextDouble();

        quantidadeSalarios = salarioFuncionario / salarioMinimo;

        System.out.println("O funcionário recebe " + quantidadeSalarios + " salários mínimos.");
    }

}
