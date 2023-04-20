package atividade1;
import javax.swing.JOptionPane;

public class Q22 {
	  public static void main(String[] args) {
		    String anoNascimentoStr = JOptionPane.showInputDialog("digite o ano de nascimento:");
		    int anoNascimento = Integer.parseInt(anoNascimentoStr);

		    String anoAtualStr = JOptionPane.showInputDialog("digite o ano atual:");
		    int anoAtual = Integer.parseInt(anoAtualStr);

		    int idadeAtual = anoAtual - anoNascimento;
		    JOptionPane.showMessageDialog(null, "sua idade atual: " + idadeAtual);

		    int idade2050 = 2050 - anoNascimento;
		    JOptionPane.showMessageDialog(null, "sua idade em 2050: " + idade2050);
		  }
		}