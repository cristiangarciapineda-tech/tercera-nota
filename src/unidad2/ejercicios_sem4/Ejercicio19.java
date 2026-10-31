package unidad2.ejercicios_sem4;

//Crea un programa que tenga un array con cinco números enteros. Luego crea un método llamado aumentarValores(int[] numeros) que aumente en 5 cada elemento del array. Muestra el contenido del array antes y después de llamar al método.

public class Ejercicio19 {
    public static void aumentarValores(int[] numeros) {
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = numeros[i] + 5;
        }
    }

    public static void main(String[] args) {
        int[] numeros = {10, 20, 30, 40, 50};

        for (int i = 0; i < numeros.length; i++) {
            System.out.println(numeros[i]);
        }

        aumentarValores(numeros);

        for (int i = 0; i < numeros.length; i++) {
            System.out.println(numeros[i]);
        }
    }
}
