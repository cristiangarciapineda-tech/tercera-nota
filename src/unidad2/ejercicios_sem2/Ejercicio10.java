package unidad2.ejercicios_sem2;

//Positivos, negativos y ceros. Usa tres contadores para clasificar los números de un arreglo.

public class Ejercicio10 {
    public static void main(String[] args) {
        int[] numeros = {5, -3, 0, 8, -1, 0, 7, -9};
        int positivos = 0, negativos = 0, ceros = 0;
        for (int n : numeros) {
            if (n > 0) positivos++;
            else if (n < 0) negativos++;
            else ceros++;
        }
        System.out.println("Positivos: " + positivos + ", Negativos: " + negativos + ", Ceros: " + ceros);
    }
}
