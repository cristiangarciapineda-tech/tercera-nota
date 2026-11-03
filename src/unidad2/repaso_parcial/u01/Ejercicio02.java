package unidad2.repaso_parcial.u01;

import java.util.Scanner;

//Se ingresan tres notas de un alumno, si el promedio es mayor o igual a siete
//mostrar un mensaje "Promocionado".

public class Ejercicio02 {
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);

        double nota1, nota2, nota3, promedio;

        System.out.println("Ingrese la nota 1:");
        nota1 = leer.nextDouble();
        System.out.println("Ingrese la nota 2:");
        nota2 = leer.nextDouble();
        System.out.println("Ingrese la nota 3:");
        nota3 = leer.nextDouble();

        promedio = (nota1 + nota2 + nota3) / 3;

        if (promedio >= 7) {
            System.out.println("Promocionado");
        } else if (promedio < 7) {
            System.out.println("No Promocionado");
        }
        leer.close();
    }
}
