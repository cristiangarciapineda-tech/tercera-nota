package unidad2.repaso_parcial.u02;

import java.util.Scanner;

//Crear un vector de 5 elementos de cadenas de caracteres, inicializa el vector con datos leídos por el teclado. Copia los elementos del vector en otro vector pero en orden inverso, y muéstralo por la pantalla.

public class Ejercicio02 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        String[] vector_cadenas = new String[5];
        String[] vector_inverso = new String[5];

        // Inicializar el vector con datos leídos por el teclado
        for (int i = 0; i < 5; i++) {
            System.out.println("Ingrese la cadena " + (i + 1) + ":");
            vector_cadenas[i] = leer.nextLine();
        }

        // Copiar los elementos en orden inverso
        for (int i = 0; i < 5; i++) {
            vector_inverso[i] = vector_cadenas[4 - i];
        }

        // Mostrar el vector inverso
        System.out.println("Vector en orden inverso:");
        for (int i = 0; i < 5; i++) {
            System.out.println("Elemento " + (i + 1) + ": " + vector_inverso[i]);
        }

        leer.close();
    }
}


