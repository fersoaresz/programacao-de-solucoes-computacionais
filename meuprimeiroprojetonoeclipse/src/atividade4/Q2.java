package atividade4;
import java.util.Scanner;
public class Q2  {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double nota = -1;
        double salario = -1;
        char sexo = ' ';
        int idade = -1;

        while (nota < 0 || nota > 10) {
            System.out.print("Informe a nota (0 a 10): ");
            nota = input.nextDouble();
        }

        while (salario < 0) {
            System.out.print("Informe o salário: ");
            salario = input.nextDouble();
        }

        while (sexo != 'm' && sexo != 'f') {
            System.out.print("Informe o sexo (m ou f): ");
            sexo = input.next().charAt(0);
        }

        while (idade < 0 || idade > 150) {
            System.out.print("Informe a idade (0 a 150): ");
            idade = input.nextInt();
        }

        System.out.println("Dados informados com sucesso!");
    }
}
