package atividade3;
import java.util.Scanner;
public class Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numFilhos = 0, numPessoas = 0;
        double salario = 0, somaSalario = 0, somaFilhos = 0;

        while (true) {
            System.out.print("Digite o salário (ou valor negativo para encerrar): ");
            salario = sc.nextDouble();
            if (salario < 0) {
                break;
            }
            System.out.print("Digite o número de filhos: ");
            numFilhos = sc.nextInt();

            somaSalario += salario;
            somaFilhos += numFilhos;
            numPessoas++;
        }

        if (numPessoas == 0) {
            System.out.println("Não foram inseridos dados válidos.");
        } else {
            double mediaSalario = somaSalario / numPessoas;
            double mediaFilhos = somaFilhos / numPessoas;

            System.out.printf("Média salarial da população: R$ %.2f\n", mediaSalario);
            System.out.printf("Média do número de filhos: %.2f\n", mediaFilhos);
        }

        sc.close();
    }
}
