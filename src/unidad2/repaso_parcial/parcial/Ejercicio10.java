package unidad2.repaso_parcial.parcial;

import java.util.Scanner;

//Un parqueadero registra el pago realizado por `n` vehículos. Cada pago puede estar entre `$2.000` y `$50.000`.
//Realizar un programa que almacene los pagos en un arreglo e informe:
//- Cuántos vehículos pagaron entre `$2.000` y `$20.000`.
//- Cuántos vehículos pagaron más de `$20.000`.
//- El total recaudado por el parqueadero.

public class Ejercicio10 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        int n;
        double contador1 = 0;
        double contador2 = 0;
        double totalRecaudado = 0;

        System.out.println("Ingrese la cantidad de vehiculos: ");
        n = leer.nextInt();

        double[] pagos = new double[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Ingrese el pago del vehiculo " + (i + 1));
            pagos[i] = leer.nextDouble();
        }

        for (int i = 0; i < n; i++) {
            totalRecaudado += pagos[i];
            if (pagos[i] >= 2000 && pagos[i] <= 20000) {
                contador1++;
            }else if (pagos[i] > 20000 && pagos[i] <= 50000) {
                contador2++;
            }else {
                System.out.println("Error, el maximo de pago es de 50k");
                totalRecaudado = 0;
            }
        }
        System.out.println("Cantidad de vehiculos que pagaron entre 2k y 20k: " + contador1);
        System.out.println("Cantidad de vehiculos que pagaronn mas de 20k: " + contador2);
        System.out.println("Total recaudado por el parqueadero: " + totalRecaudado + "k");
        leer.close();
    }
}
