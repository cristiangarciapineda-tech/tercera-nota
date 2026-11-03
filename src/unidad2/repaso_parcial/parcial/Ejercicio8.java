package unidad2.repaso_parcial.parcial;

import java.util.Scanner;

//Un restaurante atiende a `n` clientes durante una jornada. Cada cliente gasta entre `$20.000` y `$200.000`.
//Realizar un programa que almacene los gastos en un arreglo e informe:
//- Cuántos clientes gastaron entre `$20.000` y `$100.000`.
//- Cuántos clientes gastaron más de `$100.000`.
//- El total de dinero recibido por el restaurante.

public class Ejercicio8 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        int n;
        double contador1 = 0;
        double contador2 = 0;
        double totalDinero = 0;

        System.out.println("Ingrese la cantiad de clientes: ");
        n = leer.nextInt();

        double[] gastos = new double[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Ingrese la cantidad de gastos del cliente " + (i + 1));
            gastos[i] = leer.nextDouble();
        }

        for (int i = 0; i < n; i++) {
            totalDinero += gastos[i];
            if (gastos[i] >= 20000 && gastos[i] <= 100000) {
                contador1++;
            }else if (gastos[i] > 100000 && gastos[i] <= 200000) {
                contador2++;
            }else {
                System.out.println("Error, maximo de gasto por cliente 200k");
                totalDinero = 0;
            }
        }
        System.out.println("Cantidad de clientes que gastaron entre 20k y 100k: " + contador1);
        System.out.println("Cantidad de clientes que gastaron mas de 100k: " + contador2);
        System.out.println("Total de dinero recibido: " + totalDinero + "k");
        leer.close();
    }
}
