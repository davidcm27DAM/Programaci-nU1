package operadores;

public class OperadoresAritmeticos {
    public static void main(String[] args) {

        final float IMPUESTO = (float) ((2.2 * 1)+5);
        byte impuesto2 = (byte) ((12/2) + (-8));
        float cociente = (float) 16/3;
        byte resto = (byte) 16%3;
        int nueve = 9;
        int postIncremento = nueve++;
        int preIncremento = ++nueve;
        int postDecremento = nueve--;
        int preDecremento = --nueve;


        System.out.println("Resultado a): "+IMPUESTO);
        System.out.println("Resultado b): "+impuesto2);
        System.out.printf("Resultado c) cociente: %.2f \n", cociente);
        System.out.println("Resultado c) resto: "+resto);
        System.out.println("Resultado d) nueve: "+nueve);
        System.out.println("Resultado d) postIncremento: "+postIncremento);
        System.out.println("Resultado e) preIncremento: "+preIncremento);
        System.out.println("Resultado e) nueve: "+nueve);
        System.out.println("Resultado f) postDecremento: "+postDecremento);
        System.out.println("Resultado f) nueve: "+nueve);
        System.out.println("Resultado g) postDecremento: "+preDecremento);
        System.out.println("Resultado g) nueve: "+nueve);

    }
}

/*
Hacer un programa al que llamaremos OperadoresAritmeticos que nos
permita:
a) Multiplicar 2,2 * 1,0, y al resultado sumarle 5,0. Guardar el resultado en
un identificador llamado impuesto. Visualizar el resultado.
b) Definir una variable, impuesto2 que recoja el resultado de la expresión
aritmética siguiente: a la división entera de 12 entre 2, sumarle -8.
Visualizar el resultado.
c) Definir una variable cociente y otra resto, que recoja el cociente entero
y el resto, de dividir 16 entre 3. Visualiza el resultado. Después define una
variable que llamaremos cociente_decimal, que recoja el cociente con
decimales.
d) Asigna a una variable nueve, el valor 9. Haz un programa que defina
una variable postIncremento, que tome el valor que tiene nueve y que
incremente en uno la variable nueve.
e) Define una variable preIncremento, que tome incrementado en 1, el
valor de nueve, y esta variable acabe también incrementando en 1 su
valor. Visualiza resultados.
f) Define una variable postDecremento que tome el valor de nueve y
decremente nueve en 1. Visualiza resultados.
g) Define una variable preDecremento, que tome decrementando en 1 el
valor de nueve y esta variable acabe también decrementada en 1.
 */