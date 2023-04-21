package atividade1;
import java.util.Scanner;

public class Q5 {
	  public static void main(String[] args) {
		    Scanner input = new Scanner(System.in);

		    System.out.print("Digite a diagonal maior do losango: ");
		    double diagonalMaior = input.nextDouble();

		    System.out.print("Digite a diagonal menor do losango: ");
		    double diagonalMenor = input.nextDouble();

		    double area = (diagonalMaior * diagonalMenor) / 2;

		    System.out.println("a area do losango é: " + area);
		  }
		}