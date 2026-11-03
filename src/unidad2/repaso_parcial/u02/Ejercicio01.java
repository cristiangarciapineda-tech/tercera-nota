package unidad2.repaso_parcial.u02;

import java.util.Scanner;

//Realizar un programa que defina un vector llamado “vector_numeros” de 10 enteros, a continuación lo inicialice con valores aleatorios (del 1 al 10) y posteriormente muestre en pantalla cada elemento del vector junto con su cuadrado y su cubo.

public class Ejercicio01 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int[] vector_numeros = new int[10];

        // Inicializar el vector con valores aleatorios
        for (int i = 0; i < 10; i++) {
            vector_numeros[i] = (int) (Math.random() * 10) + 1;
        }

        // Mostrar cada elemento del vector junto con su cuadrado y su cubo
        for (int i = 0; i < 10; i++) {
            System.out.println("Elemento " + (i + 1) + ": " + vector_numeros[i] + " - Cuadrado: " + (vector_numeros[i] * vector_numeros[i]) + " - Cubo: " + (vector_numeros[i] * vector_numeros[i] * vector_numeros[i]));
        }

        leer.close();
    }
}
