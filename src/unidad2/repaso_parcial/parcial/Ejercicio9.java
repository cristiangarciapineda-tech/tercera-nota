package unidad2.repaso_parcial.parcial;

import java.util.Scanner;

//Una empresa de transporte registra los kilómetros recorridos por `n` vehículos en un día. Cada vehículo puede recorrer entre `10 km` y `500 km`.
//Realizar un programa que almacene los kilómetros recorridos en un arreglo e informe:
//- Cuántos vehículos recorrieron entre `10 km` y `300 km`.
//- Cuántos vehículos recorrieron más de `300 km`.
//- El total de kilómetros recorridos por toda la flota.

public class Ejercicio9 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        int n;
        double contador1 = 0;
        double contador2 = 0;
        double totalKilometros = 0;

        System.out.println("Ingrese la cantiad de vehiculos: ");
        n = leer.nextInt();

        double[] kilometros = new double[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Ingrese la cantidad de kilometros recorridos por el carro " + (i + 1));
            kilometros[i] = leer.nextDouble();
        }

        for (int i = 0; i < n; i++) {
            totalKilometros += kilometros[i];
            if (kilometros[i] >= 10 && kilometros[i] <= 300) {
                contador1++;
            }else if (kilometros[i] > 300 && kilometros[i] <= 500) {
                contador2++;
            }else {
                System.out.println("Error, maximo de kilometros por vehiculo es de 500km");
                totalKilometros = 0;
            }
        }
        System.out.println("Cantidad de vehiculos que recorrieron entre 10km y 300km: " + contador1);
        System.out.println("Cantidad de clientes que gastaron mas de 300km: " + contador2);
        System.out.println("Total de kilometros recorridos: " + totalKilometros + "km");
        leer.close();   
    }
}
