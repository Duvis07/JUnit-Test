package org.example;

public class Aritmetica {


    public int sumar(int a, int b) {
        return a + b;
    }

    public int restar(int a, int b) {
        return a - b;
    }

    public int multiplicar(int a, int b) {
        return a * b;
    }

    public int dividir(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("No se puede dividir por cero");
        }
        return a / b;
    }

    public int modulo(int a, int b) {
        return a % b;
    }

    public int potencia(int a, int b) {
        return (int) Math.pow(a, b);
    }

}
