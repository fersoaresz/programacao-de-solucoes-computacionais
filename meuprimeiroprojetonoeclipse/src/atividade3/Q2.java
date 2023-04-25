package atividade3;
import java.util.Scanner;
 class Q2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int matricula = 0;
        while (matricula >= 0) {
            System.out.print("Informe a matricula do aluno: ");
            matricula = input.nextInt();

            if (matricula >= 0) {
                System.out.print("informe a primeira nota do aluno: ");
                double nota1 = input.nextDouble();

                System.out.print("informe a segunda nota do aluno: ");
                double nota2 = input.nextDouble();

                System.out.print("informe a terceira nota do aluno: ");
                double nota3 = input.nextDouble();

                double media = (nota1 + nota2 + nota3) / 3.0;

                if (media >= 70.0) {
                    System.out.println("O aluno de matrícula " + matricula + " foi aprovado com media " + media + ".");
                } else if (media >= 60.0 && media < 70.0) {
                    System.out.println("O aluno de matrícula " + matricula + " está em recuperação com media " + media + ".");
                } else {
                    System.out.println("O aluno de matrícula " + matricula + " foi reprovado com media " + media + ".");
                }
            }
        }

        System.out.println("Programa encerrado.");
        input.close();
    }
}
