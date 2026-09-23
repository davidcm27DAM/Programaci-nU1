package tiposDeDatos;

public class Ejercicio5 {
    public static void main(String[] args) {

        final byte EDAD_JUAN = 20;
        byte edadPedro = (byte) (EDAD_JUAN+1);
        final short SUELDO_JUAN = 1980;
        final short SUELDO_PEDRO = 800;

        System.out.println("Edad Juan: " + EDAD_JUAN + "\nEdad Pedro: " + edadPedro);
        System.out.println("Entre los dos ganan al mes: " + (SUELDO_JUAN + SUELDO_PEDRO) + "€. ");
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