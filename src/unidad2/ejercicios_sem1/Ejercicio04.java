package unidad2.ejercicios_sem1;

//Tabla de multiplicar con while. Muestra la tabla de multiplicar de un número del 1 al 10 usando un ciclo while

public class Ejercicio04 {
    public static void main(String[] args) {
        int numero = 7;
        int i = 1;
        while (i <= 10) {
            System.out.println(numero + " x " + i + " = " + (numero * i));
            i++;
        }
    }
}
