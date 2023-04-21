package atividade1;
import javax.swing.JOptionPane;
public class Q44 {
	  public static void main(String[] args) {
		    String salarioString = JOptionPane.showInputDialog("digite o salario atual do funcionario:");
		    double salario = Double.parseDouble(salarioString);
		    double novoSalario = salario * 1.25;
		    JOptionPane.showMessageDialog(null, "O novo salario do funcionario é: R$ " + novoSalario);
		  }
		}