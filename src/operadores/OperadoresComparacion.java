package operadores;

public class OperadoresComparacion {
    public static void main(String[] args) {

        int edadJuan = 6;
        int edadPedro = 6;
        int edadJulio = 21;
        int contador = 14;

        float hipotenusa = 206.73f;
        float cateto1 = 13.2f;
        float cateto2 = 5.7f;

        System.out.println("a): " + (edadJuan < 18));
        System.out.println("b): " + (edadJuan == edadPedro));
        System.out.println("c): " + (edadJulio > edadPedro));
        System.out.println("d): " + ((hipotenusa*hipotenusa) == ((cateto1+cateto2)*(cateto1+cateto2))));
        System.out.println("e): " + (cateto1>cateto2));
        System.out.println("f): " + (contador == 8));
        System.out.println("g): " + (contador != 8));


    }
}

/*
3. Hacer un programa llamado OperadoresComparación, que nos permita
definir 4 identificadores de tipo entero: edadJuan , con valor 6, edadPedro con
valor 6, edadJulio con valor 21 y contador con valor 14; y además las variables
de tipo decimal siguientes: hipotenusa con valor 206,73, cateto1 con valor 13,2
y cateto2 con valor 5.7. El programa debe visualizar lo siguiente:
NOTA: Para resolver el ejercicio debemos funcionar con los identificadores
declarados y operadores. No se puede poner directamente la palabra true o
false en el System.out.print().
a) Es true que Juan es menor de edad.
b) Es true que Juan tiene la misma edad que Pedro.
c) Es true que Julio tiene más edad que Pedro.
d) Es false que la hipotenusa al cuadrado es igual a la suma de sus
catetos al cuadrado.
e) Es true que el cateto1 es mayor que el cateto2.
f) Es false que contador es igual a 8.
g) Es true que contador es distinto a 8.
 */
