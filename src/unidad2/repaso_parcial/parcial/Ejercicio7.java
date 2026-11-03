package unidad2.repaso_parcial.parcial;

import java.util.Scanner;

//Una fábrica registra la cantidad de productos elaborados por `n` operarios en un día. Cada operario puede producir entre `10` y `200` unidades.
//Realizar un programa que almacene la producción de cada operario en un arreglo e informe:
//- Cuántos operarios produjeron entre `10` y `100` unidades.
//- Cuántos operarios produjeron más de `100` unidades.
//- La producción total de la fábrica.

public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        int n;
        double contador1 = 0;
        double contador2 = 0;
        double totalProduccion = 0;

        System.out.println("Ingrese la cantidad de operarios: ");
        n = leer.nextInt();

        double[] producciones = new double[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Ingrese las unidades producidas por el operario " + (i + 1));
            producciones[i] = leer.nextDouble();
        }

        for (int i = 0; i < n; i++) {
            totalProduccion += producciones[i];
            if (producciones[i] >= 10 && producciones[i] <= 100) {
                contador1++;
            }else if (producciones[i] > 100 && producciones[i] <= 200) {
                contador2++;
            }else {
                System.out.println("Cantidad de unidades imposibles para un operario");
                totalProduccion = 0;
            }
        }
        System.out.println("Cantidad de operarios que produjeron entre 10 y 100 unidades: " + contador1);
        System.out.println("Cantidad de operarios que produjeron mas de 100 unidades: " + contador2);
        System.out.println("Produccion total de la fabrica: " + totalProduccion);
        leer.close();
    }
}
