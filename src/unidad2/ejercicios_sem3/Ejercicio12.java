package unidad2.ejercicios_sem3;

//Método esPar. Escribe un método que reciba un entero y retorne true si es par

public class Ejercicio12 {
    public static boolean esPar(int numero) {
        return numero % 2 == 0;
    }

    public static void main(String[] args) {
        System.out.println("10 es par: " + esPar(10)); 
        System.out.println("7 es par: " + esPar(7)); 
    }
}
