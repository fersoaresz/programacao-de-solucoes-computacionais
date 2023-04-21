package atividade1;
import javax.swing.JOptionPane;

public class Q33 {
    public static void main(String[] args) {
        String cotacaoStr = JOptionPane.showInputDialog("digite o valor do dolar em real:");
        double cotacao = Double.parseDouble(cotacaoStr);

        String valorDolarStr = JOptionPane.showInputDialog("digite o valor em dolar:");
        double valorDolar = Double.parseDouble(valorDolarStr);

        double valorReal = cotacao * valorDolar;

        JOptionPane.showMessageDialog(null, "valor em reais: R$" + valorReal);
    }
}