package atividade1;
import javax.swing.JOptionPane;

public class Q66 {
	  public static void main(String[] args) {
		    String input = JOptionPane.showInputDialog("digite a temperatura em celsius:");
		    double celsius = Double.parseDouble(input);

		    double fahrenheit = (celsius * 1.8) + 32;

		    JOptionPane.showMessageDialog(null, "a temperatura em fahrenheit é: " + fahrenheit);
		  }
		}