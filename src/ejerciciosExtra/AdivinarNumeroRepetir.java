package ejerciciosExtra;

import java.util.Random;
import java.util.Scanner;

public class AdivinarNumeroRepetir {

    static Scanner tecladoInput = new Scanner(System.in);

    public static void main(String[] args) {

        Random randomNumGen = new Random();
        final int randomNum = randomNumGen.nextInt(101);
        String playerNum;
        int gameNum;
        boolean acierto = false;
        boolean desiste = false;
        String nombreJugador;
        int intentosPartida = 0;
        int partidasJugador;
        int intentosJugador;
        int numAbandonosJugador;
        int mejorPartidaJugador;
        int peorPartidaJugador;


        System.out.println("Bienvenido a adivina el número!");
        System.out.print("Introduce el nombre del jugador: ");
        nombreJugador = tecladoInput.nextLine();

        //check player directory
        //if directoy !exist, create it
        //if directory exist, then check file inside it
        //if file !exist, create it
        //if file exist, access it

        do {

            playerNum = pedirNumero();
            intentosPartida++;
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

        printPlayerStats(nombreJugador);

    }

    private static String pedirNumero() {

        String numTeclado = "-1";
        boolean numeroEsCorrecto = false;
        do {
            System.out.println("\n *Introduce un número del 0 al 100* :");
            numTeclado = tecladoInput.nextLine();
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
        if (Integer.parseInt(numTeclado) > 100) {
            System.out.println("El número que has introducido es mayor que 100! Vuelve a introducirlo, esta vez de 0 a 100. ");
            return false;
        }
        return true;
    }

    private static boolean checkNegative(String playerNum) {
        if (playerNum.charAt(0) == '-') {
            return true;
        } else {
            return false;
        }

    }

    private static void printPlayerStats(String nombreJugador) {
        System.out.println("Las estadísticas para " + nombreJugador + " son: ");
    }
}


/*
3. Amplíe el programa del ejercicio anterior permitiendo que el jugador juegue
tantas veces como desee. El programa deberá mantener las estadísticas del
jugador y mostrárselas al final de cada partida (número medio de intentos para
adivinar el número, número de veces que el jugador abandona, mejor partida y
peor partida).

 */
