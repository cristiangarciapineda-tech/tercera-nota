package unidad2.ejercicios_sem1;

//Suma de pares. Calcula la suma de los números pares del 1 al 20. En lugar de revisar cada número con un if, recorre solo los pares avanzando de 2 en 2.

public class Ejercicio02 {
    public static void main(String[] args) {
        int suma = 0;
        for (int i = 2; i <= 20; i += 2) {
            suma += i;
        }
        System.out.println("Suma de pares del 1 al 20: " + suma);
    }
}
