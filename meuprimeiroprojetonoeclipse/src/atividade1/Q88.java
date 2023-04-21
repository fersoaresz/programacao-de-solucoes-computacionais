package atividade1;
import javax.swing.JOptionPane;
public class Q88 {
    public static void main(String[] args) {
        String input = JOptionPane.showInputDialog("Digite o peso da pessoa:");

        double peso = Double.parseDouble(input);

        double novoPesoEngordar = peso * 1.15;
        double novoPesoEmagrecer = peso * 0.8;

        JOptionPane.showMessageDialog(null, "Se a pessoa engordar 15%, o novo peso será: " + novoPesoEngordar);
        JOptionPane.showMessageDialog(null, "Se a pessoa emagrecer 20%, o novo peso será: " + novoPesoEmagrecer);
    }
}