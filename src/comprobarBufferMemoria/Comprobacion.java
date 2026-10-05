package comprobarBufferMemoria;

import java.util.Scanner;

public class Comprobacion {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numero = 0;
        System.out.println("Introducir un número: ");
        if (teclado.hasNextInt()) {
            numero = teclado.nextInt();
            if (numero % 2 == 0) {
                System.out.println("Número es par ");
            } else {
                System.out.println("Númerp impar");
            }
        } else {
            System.out.println("Error, no has introducido un entero. ");
        }
    }
}
