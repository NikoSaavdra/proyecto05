package es.santander.ascender;

public class Comunes {

    public String[] encontrarElemComunes(String[] arregloUno, String[] arregloDos) {

        int contador = 0;
        for (int i = 0; i < arregloUno.length; i++) {
            for (int j = 0; j < arregloDos.length; j++) {

                if (arregloUno[i].equals(arregloDos[j])) {
                    contador += 1;
                    break;
                }
            }
        }

        String[] comunes = new String[contador];
        int k = 0;
        for (int i = 0; i < arregloUno.length; i++) {
            for (int j = 0; j < arregloDos.length; j++) {

                if (arregloUno[i].equals(arregloDos[j])) {
                    if (k < contador) {
                        comunes[k] = arregloUno[i];
                        k += 1;
                        break;
                    }
                }
            }
        }
        return comunes;
    }
}
