package unidad2.repaso_parcial.parcial;

import java.util.Scanner;

//En un curso hay `n` estudiantes. Las notas finales están entre `0` y `5`.
//Realizar un programa que almacene las notas en un arreglo e informe:
//- Cuántos estudiantes aprobaron con nota entre `3.0` y `4.0`.
//- Cuántos estudiantes aprobaron con nota mayor a `4.0`.
//- La suma total de todas las notas del curso.

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        int n;
        double contador1 = 0;
        double contador2 = 0;
        double totalNotas = 0;

        System.out.println("Ingrese la cantidad de estudiantes: ");
        n = leer.nextInt();

        double[] notas = new double[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Ingrese la nota del estudiante " + (i + 1));
            notas[i] = leer.nextDouble();
        }

        for (int i = 0; i < n; i++) {
            totalNotas += notas[i];
            if (notas[i] >= 3 && notas[i] <= 4) {
                contador1++;
            }else if (notas[i] > 4) {
                contador2++;
            }
        }
        System.out.println("Estudiantes que aprobaron con notas entre 3.0 y 4.0: " + contador1);
        System.out.println("Estudiantes que aprobaron con notas mayores a 4.0: " + contador2);
        System.out.println("Suma total de notas: " + totalNotas);
        leer.close();
    }
}
