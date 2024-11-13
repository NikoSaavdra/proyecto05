package es.santander.ascender;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class IgualdadTest {

    @Test
    public void testVerificarIgualdad(){

        Igualdad igual= new Igualdad();

        //double[] primera = {8.25, 9.78, 5.63, 7.69};
        //double[] segunda = {8.25, 9.78, 5.63, 7.69};

        double[] primera = new double[0];
        double[] segunda = new double[0];


        boolean  resultado = igual.verificarIgualdad(primera, segunda);

        assertTrue( resultado, "Los arreglos no son iguales");


    }   

}
