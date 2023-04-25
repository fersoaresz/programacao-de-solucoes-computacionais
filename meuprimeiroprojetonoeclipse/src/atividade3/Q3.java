package atividade3;
import java.util.Scanner;
public class Q3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int canal, pessoasAssistindo, totalPessoas = 0;
        int[] audiencia = new int[5];
        do {
            System.out.print("Informe o número do canal (2, 4, 5, 7, 12) ou 0 para sair: ");
            canal = input.nextInt();
            if (canal == 0) {
                break;
            }
            System.out.print("Informe o número de pessoas assistindo ao canal: ");
            pessoasAssistindo = input.nextInt();
            
           
            totalPessoas += pessoasAssistindo;
            
           
            switch(canal) {
                case 2:
                    audiencia[0] += pessoasAssistindo;
                    break;
                case 4:
                    audiencia[1] += pessoasAssistindo;
                    break;
                case 5:
                    audiencia[2] += pessoasAssistindo;
                    break;
                case 7:
                    audiencia[3] += pessoasAssistindo;
                    break;
                case 12:
                    audiencia[4] += pessoasAssistindo;
                    break;
                default:
                    System.out.println("Canal inválido!");
                    break;
            }
            
        } while (canal != 0);
        
        System.out.println("Percentual de audiência de cada canal:");
        System.out.println("Canal 2: " + ((double)audiencia[0]/totalPessoas)*100 + "%");
        System.out.println("Canal 4: " + ((double)audiencia[1]/totalPessoas)*100 + "%");
        System.out.println("Canal 5: " + ((double)audiencia[2]/totalPessoas)*100 + "%");
        System.out.println("Canal 7: " + ((double)audiencia[3]/totalPessoas)*100 + "%");
        System.out.println("Canal 12: " + ((double)audiencia[4]/totalPessoas)*100 + "%");
    }
}