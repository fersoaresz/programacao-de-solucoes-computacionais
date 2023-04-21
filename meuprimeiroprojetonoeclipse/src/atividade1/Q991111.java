package atividade1;
import javax.swing.JOptionPane;
public class Q991111 {

    public static void main(String[] args) {
        String input = JOptionPane.showInputDialog("Informe um número:");
        int num = Integer.parseInt(input);

        String mensagem = "Tabuada de multiplicação do número " + num + ":\n";
        for (int i = 0; i <= 10; i++) {
            int resultado = num * i;
            mensagem += num + " x " + i + " = " + resultado + "\n";
        }

        JOptionPane.showMessageDialog(null, mensagem);
    }

}