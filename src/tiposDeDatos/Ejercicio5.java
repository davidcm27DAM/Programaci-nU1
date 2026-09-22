package tiposDeDatos;

public class Ejercicio5 {
    public static void main(String[] args) {

        byte edadJuan = 20;
        byte edadPedro = (byte) (edadJuan+1);
        short sueldoJuan = 1980;
        short sueldoPedro = 800;

        System.out.println("Edad Juan: " + edadJuan + "\nEdad Pedro: " + edadPedro);
        System.out.println("Entre los dos ganan al mes: " + (sueldoJuan + sueldoPedro) + "€. ");
    }
}

/*
La edad de Juan son 20 años. La de Pedro una más que la
de Juan, visualiza ambas edades por pantalla. Si Juan gana
1980 euros al mes y Pedro 800. Calcula cuánto ganan entre
los dos y visualízalo por pantalla.
Debemos utilizar los tipos de datos que mejor se ajusten a
los valores que representan las constantes y variables.
 */