package org.example;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertEquals;


class AritmeticaTest {

    private static Aritmetica aritmetica;

    @BeforeAll
    public static void initClass () {
        aritmetica = new Aritmetica ();
        System.out.println ("Iniciando la clase de pruebas");
    }

    @AfterAll
    public static void finishClass () {
        aritmetica = null;
        System.out.println ("Finalizando la clase de pruebas");
    }

    @BeforeEach
    public void init () {
        System.out.println ("Iniciando test");
    }

    @AfterEach
    public void end ( ) {
        System.out.println ( "Finalizando test" );
    }

    @Test
    void sumar () {
        //Arrange
        int a = 5;
        int b = 3;
        int resultadoEsperado;

        //Act
        resultadoEsperado = aritmetica.sumar (a , b);

        //Assert
        Assertions.assertEquals (8 , resultadoEsperado);

    }

    @Test
    void restar () {
        assertEquals (5 , aritmetica.restar (8 , 3));
    }

    @Test
    void multiplicar () {
        assertEquals (6 , aritmetica.multiplicar (2 , 3));
    }

    @Test
    void dividir () {
        assertEquals (2 , aritmetica.dividir (6 , 3));
    }

    @Test
    void dividirPorCero () {
        ArithmeticException exception = Assertions.assertThrows (ArithmeticException.class , () -> {
            aritmetica.dividir (6 , 0);
        });
        assertEquals ("No se puede dividir por cero" , exception.getMessage ());
    }

    @Test
    void modulo () {
        assertEquals (1 , aritmetica.modulo (5 , 2));
    }

    @Test
    void potencia () {
        assertEquals (8 , aritmetica.potencia (2 , 3));
    }

}