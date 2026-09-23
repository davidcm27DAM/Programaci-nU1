package tiposDeDatos;

import java.math.RoundingMode;
import java.text.DecimalFormat;

public class Ejercicio2 {
    public static void main(String[] args) {
        final float PRECIO_BOLLO = 0.87f;
        final float PRECIO_QUESO_KG = 13.10f;
        final float GRAMOS_QUESO_BOCADILLO = 0.15f;

        float precioBocadilloQueso = PRECIO_BOLLO + PRECIO_QUESO_KG * GRAMOS_QUESO_BOCADILLO;

        /*
        DecimalFormat formatPrice = new DecimalFormat("##.##");
        formatPrice.setRoundingMode(RoundingMode.DOWN);
        System.out.println("El precio del bocadillo de queso es: " + formatPrice.format(precioBocadilloQueso) + "€.");
        */

        System.out.println("El precio del bocadillo de queso es: " + Math.floor(precioBocadilloQueso*100)/100 + "€.");
    }
}


/* 2. Suponiendo que un bollo de pan nos cuesta 0,87 céntimos
y un kilo de queso 13,10 euros. Visualizar por pantalla
cuanto debo pagar por un bocadillo que contiene 150 gramos
de queso.
 */