package es.santander.ascender;

//23. Escriba un programa Java para probar la igualdad de dos matrices.

public class Igualdad {

    public boolean verificarIgualdad(double[] primera, double[] segunda) {

        boolean coincide = false;
        boolean coincideTamaño = false;
        int contador = 0;
    

        if (primera == null && segunda.length == 0 ||
                primera.length == 0 && segunda == null ||
                primera == null && segunda == null) {
            coincide = false;
        } else {
            coincide = true;
        }

        if (primera.length != segunda.length) {
            coincideTamaño = false;
        } else {
            coincideTamaño = true;
        }

        
        if (coincide && coincideTamaño) {
            for (int i = 0; i < primera.length; i++) {
                for (int j = 0; j < segunda.length; j++) {

                    if (primera[i] == segunda[j]) {
                        contador += 1;
                        break;
                    }
                }
            }
            if (contador == primera.length) {
                return  true;
            } else {
                return false;
            }
            
        }else {
            return false;
        }
        

    }
}
