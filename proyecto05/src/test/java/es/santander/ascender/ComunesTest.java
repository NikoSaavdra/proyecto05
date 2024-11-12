package es.santander.ascender;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class ComunesTest {

    @Test
    public void testencontrarElemComunes() {

        String[] arregloUno = { "Manzana", "Banana", "Pera", "Manzana" };
        String[] arregloDos = { "Uva", "Piña", "Pera", "Manzana" };

        Comunes cm = new Comunes();
        String[] lista = cm.encontrarElemComunes(arregloUno, arregloDos);

        assertEquals(new String[] { "Manzana", "Pera" }, lista);

        // Al no verificar devuelve { "Manzana", "Pera", "Manzana"};
    }

}
