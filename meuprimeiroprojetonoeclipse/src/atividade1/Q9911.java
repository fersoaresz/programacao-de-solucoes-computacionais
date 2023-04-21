package atividade1;
import java.util.Scanner;

public class Q9911 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Informe um número: ");
        int num = input.nextInt();

        System.out.println("Tabuada de multiplicação do número " + num + ":");
        for (int i = 0; i <= 10; i++) {
            int resultado = num * i;
            System.out.println(num + " x " + i + " = " + resultado);
        }
    }

}
