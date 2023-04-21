package atividade2;
import java.util.Scanner;
public class Q9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Tabela de planetas e gravidades
        String[] planetas = {"mercurio", "venus", "terra", "marte", "jupter", "saturno", "urano", "netuno", "plutao"};
        double[] gravidades = {3.7, 8.8, 9.8, 3.8, 26.4, 11.5, 9.3, 12.2, 0.6};
        
        // Recebe o planeta, velocidade inicial e tempo do usuário
        System.out.print("Digite o planeta (mercurio, venus, terra, marte, jupter, saturno, urano, netuno, plutao): ");
        String planeta = scanner.nextLine();
        
        System.out.print("Digite a velocidade inicial da bola (em m/s): ");
        double v0 = scanner.nextDouble();
        
        System.out.print("Digite o tempo (em s): ");
        double t = scanner.nextDouble();
        
        // Encontra a gravidade correspondente ao planeta escolhido
        double gravidade = 0;
        for (int i = 0; i < planetas.length; i++) {
            if (planetas[i].equals(planeta)) {
                gravidade = gravidades[i];
                break;
            }
        }
        
        // Calcula a velocidade e altura da bola no tempo t
        double vt = v0 - gravidade * t;
        double ht = v0 * t - 0.5 * gravidade * Math.pow(t, 2);
        
        // Imprime os resultados
        System.out.println("Velocidade da bola no instante t: " + vt + " m/s");
        System.out.println("Altura da bola no instante t: " + ht + " m");
    }
}
