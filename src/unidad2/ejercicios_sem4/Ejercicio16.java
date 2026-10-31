package unidad2.ejercicios_sem4;

import java.util.Arrays;

//Crea una clase Contador con un atributo valor. Un método recibe el objeto y lo incrementa; comprueba que el cambio se ve en main

public class Ejercicio16 {
    public static void invertir(int[] arr) {
        for (int i = 0; i < arr.length / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = temp;
        }
    }

    public static void main(String[] args) {
        int[] numeros = {1, 2, 3, 4, 5};
        System.out.println("Antes: " + Arrays.toString(numeros));
        invertir(numeros);
        System.out.println("Después: " + Arrays.toString(numeros));
    }
}
