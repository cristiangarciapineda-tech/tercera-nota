package unidad2.ejercicios_sem3;

//Mayor, menor y suma. Recorre un arreglo una sola vez para encontrar el mayor, el menor y la suma total.

public class Ejercicio11 {
    public static void main(String[] args) {
        int[] datos = {14, 3, 27, 9, 21};
        int mayor = datos[0], menor = datos[0], suma = 0;
        for (int d : datos) {
            if (d > mayor) mayor = d;
            if (d < menor) menor = d;
            suma += d;
        }
        System.out.println("Mayor: " + mayor + ", Menor: " + menor + ", Suma: " + suma);
    }
}
