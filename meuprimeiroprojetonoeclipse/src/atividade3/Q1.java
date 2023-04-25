package atividade3;
import java.util.Scanner;
public class Q1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int numAlunos = 0;
        int nota90 = 0;
        int reprovados = 0;
        double maiorNota = 0.0;
        double menorNota = 100.0;
        double somaNotas = 0.0;
        
        while (true) {
            System.out.print("Digite a nota final do aluno (-1 para sair): ");
            double nota = input.nextDouble();
            
            if (nota < 0) {
                break;
            }
            
            System.out.print("Digite o total de faltas do aluno: ");
            int faltas = input.nextInt();
            
            if (nota >= 90.0) {
                nota90++;
            }
            
            if (nota < 70.0 || faltas >= 20) {
                reprovados++;
            }
            
            if (nota > maiorNota) {
                maiorNota = nota;
            }
            
            if (nota < menorNota) {
                menorNota = nota;
            }
            
            somaNotas += nota;
            numAlunos++;
        }
        
        System.out.println("Quantidade de alunos com nota maior ou igual a 90: " + nota90);
        System.out.println("Quantidade de alunos reprovados por nota ou por falta: " + reprovados);
        System.out.println("Maior nota: " + maiorNota);
        System.out.println("Menor nota: " + menorNota);
        System.out.println("Média de notas da turma: " + (somaNotas / numAlunos));
        
        input.close();
    }

}