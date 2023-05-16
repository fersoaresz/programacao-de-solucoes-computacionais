package atividade8;

public class Q2 {
    public static void divide(int dividendo, int divisor) throws ArithmeticException {
        if (divisor == 0) {
            throw new ArithmeticException("Divisão por zero!");
        }

        if (dividendo < 0) {
            throw new ArithmeticException("Dividendo menor que zero!");
        }

        int resultado = dividendo / divisor;
        System.out.println("Resultado da divisão: " + resultado);
    }
}
