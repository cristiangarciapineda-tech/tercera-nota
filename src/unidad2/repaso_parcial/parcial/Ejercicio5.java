package unidad2.repaso_parcial.parcial;

import java.util.Scanner;

//En una unidad residencial se registra el consumo mensual de agua de `n` apartamentos. El consumo está entre `1` y `100` metros cúbicos.
//Realizar un programa que almacene los consumos en un arreglo e informe:
//- Cuántos apartamentos consumieron entre `1` y `50` metros cúbicos.
//- Cuántos apartamentos consumieron más de `50` metros cúbicos.
//- El consumo total de agua de la unidad residencial.

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        int n;
        double contador1 = 0;
        double contador2 = 0;
        double totalConsumo = 0;

        System.out.println("Ingrese la cantidad de apartamentos: ");
        n = leer.nextInt();

        double[] consumos = new double[n];
        
        for (int i = 0; i < n; i++) {
            System.out.println("Ingrese la cantidad de agua consumida por el apartamento " + (i + 1));
            consumos[i] = leer.nextDouble();
        }

        for (int i = 0; i < n; i++) {
            totalConsumo += consumos[i];
            if (consumos[i] >= 1 && consumos[i] <= 50) {
                contador1++;
            }else if (consumos[i] > 50) {
                contador2++;
            }
        }
        System.out.println("Apartamentos que consumieron entre 1 y 50 metros cubicos: " + contador1);
        System.out.println("Apartamentos que consumieron mas de 50 metros cubicos: " + contador2);
        System.out.println("Consumo total de agua: " + totalConsumo + " mestros cubicos");
        leer.close();
    }
}
