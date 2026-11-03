package unidad2.repaso_parcial.parcial;

import java.util.Scanner;

//En una empresa trabajan n empleados cuyos sueldos oscilan entre $100 y $500,
//realizar un programa que lea los sueldos que cobra cada empleado e informe
//cuántos empleados cobran entre $100 y $300 y cuántos cobran más de $300.
//Además el programa deberá informar el importe que gasta la empresa en sueldos
//al personal.

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        int n; 
        int contador1 = 0;
        int contador2 = 0;
        double acomulador = 0;

        System.out.println("Ingrese la cantidad de empleados: ");
        n = leer.nextInt();

        double sueldos[] = new double[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Ingrese el sueldo del empleado " + (i + 1));
            sueldos[i] = leer.nextDouble();
        }

        for (int i = 0; i < n; i++) {
            acomulador += sueldos[i];
            if (sueldos[i] >= 100 && sueldos[i] <= 300) {
                contador1++;
            } else if (sueldos[i] > 300) {
                contador2++;
            }
        }

        System.out.println("Cantidad de empleados que cobran entre 100 y 300: " + contador1);
        System.out.println("Cantidad de empleados que cobran mas de 300: " + contador2);
        System.out.println("Gasto total de sueldos de la empresa: " + acomulador);
        leer.close();
    }
}
