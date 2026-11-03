package unidad2.repaso_parcial.parcial;

import java.util.Scanner;

//Una tienda registra las ventas realizadas por `n` vendedores durante el día. 
//Cada venta está entre `$50` y `$1000`.
//Realizar un programa que almacene las ventas en un arreglo e informe:
//- Cuántas ventas fueron entre `$50` y `$500`.
//- Cuántas ventas fueron mayores a `$500`.
//- El total vendido por la tienda.

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        int n;
        double contador1 = 0;
        double contador2 = 0;
        double totalVenta = 0;

        System.out.println("Ingrese el numero de vendedores: ");
        n = leer.nextInt();

        double[] ventas = new double[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Ingrese el precio de venta del vendedor " + (i + 1));
            ventas[i] = leer.nextDouble();
        }

        for (int i = 0; i < n; i++) {
            totalVenta += ventas[i];
            if (ventas[i] >= 50 && ventas[i] <= 500) {
                contador1++;
            }else if (ventas[i] > 500) {
                contador2++;
            }
        }
        System.out.println("Cantidad de ventas entre 50 y 500: " + contador1);
        System.out.println("Cantidad de ventas mayores a 500: " + contador2);
        System.out.println("Total vendido por la tienda: " + totalVenta);
        leer.close();
    }
}
