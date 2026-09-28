package ejerciciosExtra;

import java.util.Random;
import java.util.Scanner;

public class ReintegroSorteo {
    public static void main(String[] args) {
        Random randomNum = new Random();
        final int premiado = randomNum.nextInt(100000);

        System.out.println("El número premiado es el " + premiado);
        int numBoleto = pedirNumeroBoleto();
        System.out.println("Tu número de boleto es el " + numBoleto);

        if (comprobarReintegro(premiado, numBoleto)) {
            System.out.println("¡Tu número ha conseguido el reintegro! ");
        } else {
            System.out.println("Lo sentimos, tu número no ha conseguido el reintegro. ");
        }
    }

    private static int pedirNumeroBoleto(){
        Scanner introducirNumero = new Scanner(System.in);
        System.out.println("Introduce tu número de boleto: ");
        int numBoleto = introducirNumero.nextInt();
        return numBoleto;
    }

    private static boolean comprobarReintegro(int premiado, int boleto) {

        String textoPremiado = String.valueOf(premiado);
        char unidadesPremiado = textoPremiado.charAt(4);
        char decenasMillarPremiado = textoPremiado.charAt(0);

        String textoBoleto = String.valueOf(boleto);
        char unidadesBoleto = textoBoleto.charAt(4);
        char decenasMillarBoleto = textoBoleto.charAt(0);

        if (unidadesPremiado == unidadesBoleto || decenasMillarPremiado == decenasMillarBoleto) {
            return true;
        } else {
            return false;
        }
    }
}

/*
Actividad 5_11
1.-Implemente una función que nos diga si un número ha conseguido o no el
reintegro en el sorteo de la ONCE. Un número de cinco cifras consigue el
reintegro si su primera o última cifra coincide con la primera o última cifra del
número agraciado en el sorteo.
 */