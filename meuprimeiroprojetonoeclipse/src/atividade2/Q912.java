package atividade2;
import java.util.Scanner;

public class Q912  {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Digite a idade: ");
        int idade = input.nextInt();
        
        System.out.print("Digite o sexo (M/F): ");
        String sexo = input.next().toUpperCase();
        
        double mensalidade = 0.0;
        
        switch (sexo) {
            case "M":
                if (idade <= 15) {
                    mensalidade = 60.0;
                } else if (idade >= 16 && idade <= 18) {
                    mensalidade = 75.0;
                } else if (idade >= 19 && idade <= 30) {
                    mensalidade = 90.0;
                } else if (idade >= 31 && idade <= 40) {
                    mensalidade = 85.0;
                } else {
                    mensalidade = 80.0;
                }
                break;
                
            case "F":
                if (idade <= 18) {
                    mensalidade = 60.0;
                } else if (idade >= 19 && idade <= 25) {
                    mensalidade = 90.0;
                } else if (idade >= 26 && idade <= 40) {
                    mensalidade = 85.0;
                } else {
                    mensalidade = 80.0;
                }
                break;
                
            default:
                System.out.println("Sexo inválido!");
                System.exit(0);
        }
        
        System.out.printf("A mensalidade a ser paga é R$%.2f", mensalidade);
        
        input.close();
    }
}
