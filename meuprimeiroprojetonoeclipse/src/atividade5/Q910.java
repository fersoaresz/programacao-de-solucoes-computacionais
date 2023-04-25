package atividade5;
import java.util.Scanner;

public class Q910 {
	  public static void main(String[] args) {
		    Scanner input = new Scanner(System.in);

		    int idade, qtdeMulheres = 0;
		    char sexo;

		    for (int i = 1; i <= 10; i++) {
		      System.out.printf("Informe a idade da %dª pessoa: ", i);
		      idade = input.nextInt();
		      System.out.printf("Informe o sexo da %dª pessoa (M ou F): ", i);
		      sexo = input.next().charAt(0);

		      if (sexo == 'F' && idade >= 20 && idade <= 40) {
		        qtdeMulheres++;
		      }
		    }

		    System.out.printf("Existem %d mulheres com idade entre 20 e 40 anos.", qtdeMulheres);
		  }
		}