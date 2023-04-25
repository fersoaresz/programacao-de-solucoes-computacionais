package atividade5;
import java.util.Scanner;
public class Q2  {
	   public static void main(String[] args) {
		      
		      Scanner entrada = new Scanner(System.in);
		      
		      int num1, num2;
		      
		      do {
		         System.out.print("Informe o primeiro número inteiro positivo: ");
		         num1 = entrada.nextInt();
		      } while (num1 <= 0);
		      
		      do {
		         System.out.print("Informe o segundo número inteiro positivo: ");
		         num2 = entrada.nextInt();
		      } while (num2 <= 0);
		      
		      System.out.print("Os números inteiros entre " + num1 + " e " + num2 + " são: ");
		      
		      if (num1 < num2) {
		         for (int i = num1 + 1; i < num2; i++) {
		            System.out.print(i + " ");
		         }
		      } else {
		         for (int i = num2 + 1; i < num1; i++) {
		            System.out.print(i + " ");
		         }
		      }
		   }
		}