package atividade1;
import java.util.Scanner;
public class Q4 {
	  public static void main(String[] args) {
		    Scanner input = new Scanner(System.in);
		    System.out.print("digite o salario atual do funcionario: ");
		    double salario = input.nextDouble();
		    double novoSalario = salario * 1.25;
		    System.out.println("O novo salario do funcionario é: R$ " + novoSalario);
		  }
		}