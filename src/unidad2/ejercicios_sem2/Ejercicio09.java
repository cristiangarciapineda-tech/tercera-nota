package unidad2.ejercicios_sem2;

//Promedio de notas. Usa un acumulador para sumar las notas de un arreglo y calcula el promedio

public class Ejercicio09 {
    public static void main(String[] args) {
        double[] notas = {4.5, 3.8, 5.0, 2.9, 4.1};
        double suma = 0;
        for (double nota : notas) {
            suma += nota;
        }
        System.out.println("Promedio: " + (suma / notas.length));
    }
}
