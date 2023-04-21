package atividade2;
import java.util.Scanner;

public class Q913  {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o tipo de apartamento (Simples ou Duplo): ");
        String tipoApto = entrada.nextLine();

        System.out.print("Digite a quantidade de dias de hospedagem: ");
        int diasHospedagem = entrada.nextInt();

        double valorDiaria;
        if (tipoApto.equalsIgnoreCase("Simples")) {
            if (diasHospedagem < 10) {
                valorDiaria = 100.0;
            } else if (diasHospedagem >= 10 && diasHospedagem <= 15) {
                valorDiaria = 90.0;
            } else {
                valorDiaria = 80.0;
            }
        } else {
            if (diasHospedagem < 10) {
                valorDiaria = 140.0;
            } else if (diasHospedagem >= 10 && diasHospedagem <= 15) {
                valorDiaria = 120.0;
            } else {
                valorDiaria = 100.0;
            }
        }

        double total = diasHospedagem * valorDiaria;

        System.out.printf("O total a ser pago é de R$ %.2f", total);

        entrada.close();
    }
}
