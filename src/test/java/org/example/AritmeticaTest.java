package org.example;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;


class AritmeticaTest {
    @InjectMocks
    private static Aritmetica aritmetica;
    @Mock
    private static CalculadoraAppService calculadoraAppService;

    @BeforeAll
    public static void initClass ( ) {
        aritmetica = new Aritmetica ( );
        System.out.println ( "Iniciando la clase de pruebas" );
    }

    @AfterAll
    public static void finishClass ( ) {
        aritmetica = null;
        System.out.println ( "Finalizando la clase de pruebas" );
    }

    @BeforeEach
    public void init ( ) {
        System.out.println ( "Iniciando test" );
    }

    @AfterEach
    public void end ( ) {
        System.out.println ( "Finalizando test" );
    }

    @Test
    void sumar ( ) {
        //Arrange
        int a = 5;
        int b = 3;
        int resultadoEsperado;

        //Act
        resultadoEsperado = aritmetica.sumar ( a , b );

        //Assert
        Assertions.assertEquals ( 8 , resultadoEsperado );

    }

    @Test
    void restar ( ) {
        assertEquals ( 5 , aritmetica.restar ( 8 , 3 ) );
    }

    @Test
    void multiplicar ( ) {
        assertEquals ( 6 , aritmetica.multiplicar ( 2 , 3 ) );
    }

    @Test
    void dividir ( ) {
        assertEquals ( 2 , aritmetica.dividir ( 6 , 3 ) );
    }

    @Test
    void dividirPorCero ( ) {
        ArithmeticException exception = Assertions.assertThrows ( ArithmeticException.class , ( ) -> aritmetica.dividir ( 6 , 0 ) );
        assertEquals ( "No se puede dividir por cero" , exception.getMessage ( ) );
    }

    @Test
    void modulo ( ) {
        assertEquals ( 1 , aritmetica.modulo ( 5 , 2 ) );
    }

    @Test
    public void potencia ( ) throws Exception {

        //Arrange
        String usuario = "admin";
        String password = "duvan";
        int base = 2;
        int exponente = 2;
        Mockito.when ( calculadoraAppService.login ( usuario , password ) ).thenReturn ( true );
        Mockito.when ( calculadoraAppService.potencia ( base , exponente ) ).thenReturn ( 4 );

        //Act
        int resultado = aritmetica.potencia ( usuario , password , base , exponente );

        //Assert
        Assertions.assertEquals ( 4 , resultado );
    }


}