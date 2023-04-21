package atividade1;
import javax.swing.JOptionPane;
public class Q77 {

    public static void main(String[] args) {
        double salarioMinimo, salarioFuncionario, quantidadeSalarios;

        salarioMinimo = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do salário mínimo: "));
        salarioFuncionario = Double.parseDouble(JOptionPane.showInputDialog("Digite o salário do funcionário: "));

        quantidadeSalarios = salarioFuncionario / salarioMinimo;

        JOptionPane.showMessageDialog(null, "O funcionário recebe " + quantidadeSalarios + " salários mínimos.");
    }
}
