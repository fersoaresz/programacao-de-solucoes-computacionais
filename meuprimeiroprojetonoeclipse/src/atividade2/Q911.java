package atividade2;
import java.util.Scanner;

public class Q911 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o número de diárias: ");
        int numDiarias = sc.nextInt();

        double taxaServicos;
        if (numDiarias < 15) {
            taxaServicos = 15.0;
        } else if (numDiarias == 15) {
            taxaServicos = 10.0;
        } else {
            taxaServicos = 5.0;
        }

        double total = numDiarias * 500.0 + numDiarias * taxaServicos;
        System.out.printf("O total a ser pago é R$ %.2f", total);

        sc.close();
    }
}
