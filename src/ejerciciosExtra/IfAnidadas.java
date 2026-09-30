package ejerciciosExtra;

import java.util.Scanner;

public class IfAnidadas {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numTeclado;

        System.out.println("Introduce un número: ");
        numTeclado = teclado.nextInt();

        if (numTeclado > 5 || numTeclado < 1){

        } else {
            if (numTeclado == 1){
                System.out.println("Enero ");
            } else if (numTeclado == 2){
                System.out.println("Febrero ");
            } else if (numTeclado == 3){
                System.out.println("Marzo ");
            } else if (numTeclado == 4){
                System.out.println("Abril ");
            } else {
                System.out.println("Mayo ");
            }

            /*
            switch (numTeclado){

                case 1:
                    System.out.println("Enero ");
                case 2:
                    System.out.println("Febrero ");
                case 3:
                    System.out.println("Marzo ");
                case 4:
                    System.out.println("Abril ");
                case 5:
                    System.out.println("Mayo ");
            }
             */
        }
    }
}

/*
 * Hacer un programa que nos permite introducir un número que represente el número del mes
 * Si el número es 1 vamos a visualizar por pantalla "enero", si es 2, "febrero"
 * y así sucesivamente hasta mayo (5)
 *
 */