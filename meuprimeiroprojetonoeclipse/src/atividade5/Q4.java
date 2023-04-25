package atividade5;
import java.util.Scanner;

public class Q4 {
	  public static void main(String[] args) {
		    Scanner input = new Scanner(System.in);

		    int idade, somaIdades = 0, contador = 0;
		    double mediaIdades;

		    System.out.println("Digite as idades (digite um número negativo para sair):");

		    while (true) {
		      idade = input.nextInt();

		      if (idade < 0) {
		        break;
		      }

		      somaIdades += idade;
		      contador++;
		    }

		    if (contador == 0) {
		      System.out.println("Nenhuma idade foi informada.");
		    } else {
		      mediaIdades = (double) somaIdades / contador;
		      System.out.printf("A média das idades informadas é %.2f", mediaIdades);
		    }
		  }
		}