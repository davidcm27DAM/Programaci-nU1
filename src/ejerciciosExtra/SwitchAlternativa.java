package ejerciciosExtra;

import java.util.Scanner;

public class SwitchAlternativa {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int numTeclado;

        System.out.println("Introduce un número: ");
        numTeclado = teclado.nextInt();


        switch (numTeclado) {
            case 1:
                System.out.println("Enero ");
                break;
            case 2:
                System.out.println("Febrero ");
                break;
            case 3:
                System.out.println("Marzo ");
                break;
            case 4:
                System.out.println("Abril ");
                break;
            case 5:
                System.out.println("Mayo ");
                break;
            default:
                break;

        }


    }
}
