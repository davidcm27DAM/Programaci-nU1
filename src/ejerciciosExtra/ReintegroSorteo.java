package ejerciciosExtra;

import java.util.Random;

public class ReintegroSorteo {
    public static void main(String[] args) {
        Random randomNum= new Random();
        final int premiado = randomNum.nextInt(100000);
        String textoReintegro = String.valueOf(premiado);
        char numReintegro = textoReintegro.charAt(4);

        System.out.println("El número premiado es el " + premiado +". ");
        System.out.println("Así, el reintegro es el " + numReintegro);






    }
}

/*
Actividad 5_11
1.-Implemente una función que nos diga si un número ha conseguido o no el
reintegro en el sorteo de la ONCE. Un número de cinco cifras consigue el
reintegro si su primera o última cifra coincide con la primera o última cifra del
número agraciado en el sorteo.
 */