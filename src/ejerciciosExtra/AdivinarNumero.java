package ejerciciosExtra;

import java.util.Random;
import java.util.Scanner;

public class AdivinarNumero {
    static Scanner introducirNumero = new Scanner(System.in);

    public static void main(String[] args) {
        Random randomNumGen = new Random();
        final int randomNum = randomNumGen.nextInt(101);
        String playerNum;
        int gameNum;
        boolean acierto = false;
        boolean desiste = false;

        System.out.println("Bienvenido a adivina el número!");

        do {
            playerNum = pedirNumero();
            gameNum = Integer.parseInt(playerNum);
            if (checkNegative(playerNum)) {
                desiste = true;
            } else if (gameNum == randomNum) {
                acierto = true;
            } else {
                System.out.println("No es correcto! ");
                if (gameNum > randomNum) {
                    System.out.println("El número que has introducido es demasiado grande! ");
                } else {
                    System.out.println("El número que has introducido es demasiado pequeño! ");
                }
                System.out.println("Vuelve a intentarlo! ");
            }
        } while (!(acierto || desiste));

        if (acierto) {
            System.out.println("Enhorabuena! Has acertado el número " + randomNum);
        } else if (desiste) {
            System.out.println("Sentimos que abandones, más suerte la próxima vez. ");
        } else {
            System.out.println("Has conseguido salir del sistema mediante una acción no prevista. ");
        }

    }

    private static String pedirNumero() {

        String numTeclado = "-1";
        boolean numeroEsCorrecto = false;
        do {
            System.out.println("\n *Introduce un número del 0 al 100* :");
            numTeclado = introducirNumero.nextLine();
            numeroEsCorrecto = comprobarInputEsCorrecto(numTeclado);

        } while (!numeroEsCorrecto);

        return numTeclado;
    }

    private static boolean comprobarInputEsCorrecto(String numTeclado) {
        char[] tecladoArray = numTeclado.toCharArray();
        for (char caracter : tecladoArray) {
            if (!((Character.isDigit(caracter)) || numTeclado.charAt(0) == '-')) {
                System.out.println("Has introducido un carácter inválido ");
                return false;
            }
        }
        if (numTeclado.length() > 3) {
            System.out.println("El número que has introducido es demasiado largo! Vuelve a introducirlo. ");
            return false;
        }
        return true;
    }

    private static boolean checkNegative(String playerNum){
        if (playerNum.charAt(0) == '-') {
            return true;
        } else {
            return false;
        }

    }

}



/*
2.-Diseñe un programa para jugar a adivinar un número entre 0 y 100. El programa
irá dando pistas al jugador indicándole si el número introducido por el jugador
es menor o mayor que el número que tiene que adivinar. El juego termina
cuando el jugador adivina el número o decide terminar de jugar (por ejemplo,
escribiendo un número negativo).

 */