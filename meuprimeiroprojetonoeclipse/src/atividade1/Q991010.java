package atividade1;
import javax.swing.JOptionPane;
public class Q991010 {
    public static void main(String[] args) {
        String input = JOptionPane.showInputDialog("Digite o valor do raio:");
        double raio = Double.parseDouble(input);

        double comprimento = 2 * Math.PI * raio;
        double area = Math.PI * Math.pow(raio, 2);
        double volume = (3.0 / 4.0) * Math.PI * Math.pow(raio, 3);

        JOptionPane.showMessageDialog(null, "Comprimento da esfera: " + comprimento);
        JOptionPane.showMessageDialog(null, "Área da esfera: " + area);
        JOptionPane.showMessageDialog(null, "Volume da esfera: " + volume);
    }
}