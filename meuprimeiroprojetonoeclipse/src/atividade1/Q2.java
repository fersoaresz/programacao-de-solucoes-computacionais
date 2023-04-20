package atividade1;
import java.util.Scanner;

public class Q2 {
	  public static void main(String[] args) {
		    Scanner input = new Scanner(System.in);

		    System.out.print("digite o ano de nascimento: ");
		    int anoNascimento = input.nextInt();

		    System.out.print("digite o ano atual: ");
		    int anoAtual = input.nextInt();

		    int idadeAtual = anoAtual - anoNascimento;
		    System.out.println("sua idade atual: " + idadeAtual);

		    int idade2050 = 2050 - anoNascimento;
		    System.out.println("sua idade em 2050: " + idade2050);
		  }
		}