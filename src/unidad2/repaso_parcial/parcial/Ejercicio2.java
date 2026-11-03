package unidad2.repaso_parcial.parcial;

import java.util.Scanner;

//En un evento ingresan `n` personas. Se debe almacenar en un arreglo la edad de cada persona.
//Realizar un programa que informe:
//- Cuántas personas tienen entre `18` y `30` años.
//- Cuántas personas tienen más de `30` años.
//- La suma total de las edades ingresadas.

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        int n;
        int contador1 = 0;
        int contador2 = 0;
        double acomulador = 0;

        System.out.println("Ingrese la cantidad de personas: ");
        n = leer.nextInt();

        double edades[] = new double [n];

        for (int i = 0; i < n; i++) {
            System.out.println("Ingrese la edad de la persona " + (i + 1));
            edades[i] = leer.nextDouble();
        }
        for (int i = 0; i < n; i++) {
            acomulador += edades[i];
            if (edades[i] >= 18 && edades[i] <= 30) {
                contador1++;
            }else if (edades[i] > 30) {
                contador2++;
            }
        }

        System.out.println("Personas que tienen entre 18 y 30 anos: " + contador1);
        System.out.println("Personas que tiene mas de 30 anos: " + contador2);
        System.out.println("Suma total de las edades ingresadas: " + acomulador);
        leer.close();
    }
}
