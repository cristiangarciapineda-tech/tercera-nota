package unidad2.repaso_parcial.u01;

import java.util.Scanner;

//Realizar un programa que solicite la carga por teclado de dos números,
//si el primero es mayor al segundo informar su suma y diferencia,
//en caso contrario informar el producto y la división
//del primero respecto al segundo.

public class Ejercicio01 {
public static void main(String[] args) {
    Scanner leer = new Scanner(System.in);

    int numero_uno;
    int numero_dos;
    int resultado_uno;
    int resultado_dos;

    System.out.println("Ingrese dos números enteros: ");
    numero_uno = leer.nextInt();
    numero_dos = leer.nextInt();

    if (numero_uno > numero_dos) {

        resultado_uno = numero_uno + numero_uno;
        resultado_dos = numero_uno - numero_dos;

        System.out.println("La suma es de " + resultado_uno);
        System.out.println("La diferencia es de " + resultado_dos);

    } else if (numero_dos > numero_uno) {

        resultado_uno = numero_uno * numero_dos;
        resultado_dos = numero_uno / numero_dos;

        System.out.println("El producto es de " + resultado_uno);
        System.out.println("La division es de " + resultado_dos);
    }
    leer.close();
}
}
