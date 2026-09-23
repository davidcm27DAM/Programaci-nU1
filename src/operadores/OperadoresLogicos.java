package operadores;

public class OperadoresLogicos {
    public static void main(String[] args) {

        boolean frio = false;

        boolean bueno = true;
        boolean bonito = true;
        boolean barato = true;
        boolean oportunidad = (bueno & bonito & barato);

        boolean llueve = true;
        boolean riego = false;
        boolean mojado = llueve || riego;


        System.out.println("a): " + !frio);
        System.out.println("b): " + oportunidad);
        System.out.println("c): " + mojado);

    }
}

/*
2. Crear un programa llamado OperadoresLogicos, que nos permita:
a) Definir la variable frio inicializada a false. El programa debe imprimir la
variable frio, y nos debe salir por pantalla true.
b) Imprimir la variable oportunidad, y que nos salga el valor true, sabiendo
que es la combinación de tres variables, bueno, bonito y barato, que
debes declarar e inicializar previamente (oportunidad debe tener la
sintaxis siguiente: oportunidad = bueno [operador] bonito [operador]
barato. Debes colocar los operadores binarios apropiados).
c) Imprimir la variable mojado y que nos salga true, sabiendo que es la
combinación de dos variables, llueve y riego, esta última inicializada a
false (mojado debe tener la sintaxis siguiente: mojado = llueve [operador]
riego . Debes colocar el operador binarios apropiado).
 */