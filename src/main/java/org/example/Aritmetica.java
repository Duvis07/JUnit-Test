package org.example;

public class Aritmetica {

    private CalculadoraAppService calculadoraAppService;


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



    public int potencia(String usuario,String password, int base, int exponente) throws Exception {
        boolean login = calculadoraAppService.login(usuario, password);
        if (!login) {
            throw new Exception("Usuario o contraseña incorrectos");
        }
        return calculadoraAppService.potencia(base, exponente);
    }
}
