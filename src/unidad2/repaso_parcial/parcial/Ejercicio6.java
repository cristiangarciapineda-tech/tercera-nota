package unidad2.repaso_parcial.parcial;

import java.util.Scanner;

//Una empresa de envíos procesa `n` paquetes. Cada paquete pesa entre `1 kg` y `50 kg`.
//Realizar un programa que almacene los pesos en un arreglo e informe:
//- Cuántos paquetes pesan entre `1 kg` y `20 kg`.
//- Cuántos paquetes pesan más de `20 kg`.
//- El peso total transportado.

public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        int n;
        double contador1 = 0;
        double contador2 = 0;
        double totalPeso = 0;

        System.out.println("Ingrese la cantidad de paquetes: ");
        n = leer.nextInt();

        double[] pesos = new double[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Ingrese el peso del paquete " + (i + 1));
            pesos[i] = leer.nextDouble();
        }
        for (int i = 0; i < n; i++) {
            totalPeso += pesos[i];
            if (pesos[i] >= 1 && pesos[i] <= 20) {
                contador1++;
            }else if (pesos[i] > 20 && pesos[i] <= 50) {
                contador2++;
            }else {
                System.out.println("Error el peso no es correcto");
                totalPeso = 0;
            }
        }
        System.out.println("Cantidad de paquetes que pesan entre 1kg y 20kg: " + contador1);
        System.out.println("Cantidad de paquetes que pesan mas de 20kg: " + contador2);
        System.out.println("Peso total transportado: " + totalPeso + " kg");
        leer.close();
    }
}
