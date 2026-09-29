package ejerciciosExtra;

import java.util.Random;
import java.util.Scanner;

public class AdivinarNumero {
    static Scanner introducirNumero = new Scanner(System.in);

    public static void main(String[] args) {
        Random randomNumGen = new Random();
        final int randomNum = randomNumGen.nextInt(101);
        int playerNum;
        boolean acierto = false;
        boolean desiste = false;

        System.out.println("Bienvenido a adivina el número!");

        do {
            playerNum = pedirNumero();
            if (playerNum == randomNum) {
                acierto = true;
            } else if (playerNum < 0) {
                desiste = true;
            } else {
                System.out.println("No es correcto! Vuelve a intentarlo!");
            }
        } while (acierto || desiste);

        if (acierto) {
            System.out.println("Enhorabuena! Has acertado el número " + randomNum);
        } else if (desiste) {
            System.out.println("Lo sentimos, más suerte la próxima vez. ");
        } else {
            System.out.println();
        }


    }

    private static int pedirNumero() {

        String numTeclado = "-1";
        boolean numeroEsCorrecto = false;
        do {
            System.out.println("\n *Introduce un número del 0 al 100* :");
            numTeclado = introducirNumero.nextLine();
            numeroEsCorrecto = comprobarInputEsCorrecto(numTeclado);

        } while (!numeroEsCorrecto);

        return Integer.parseInt(numTeclado);
    }

    private static boolean comprobarInputEsCorrecto(String numBoletoTeclado) {
        char[] tecladoArray = numBoletoTeclado.toCharArray();
        for (char caracter : tecladoArray) {
            if (!(Character.isDigit(caracter))) {
                System.out.println("Has introducido un carácter inválido ");
                return false;
            }
        }
        if (numBoletoTeclado.length() > 5) {
            System.out.println("El número que has introducido es demasiado largo! Vuelve a introducirlo. ");
            return false;
        }
        return true;
    }
}



/*
2.-Diseñe un programa para jugar a adivinar un número entre 0 y 100. El programa
irá dando pistas al jugador indicándole si el número introducido por el jugador
es menor o mayor que el número que tiene que adivinar. El juego termina
cuando el jugador adivina el número o decide terminar de jugar (por ejemplo,
escribiendo un número negativo).

 */