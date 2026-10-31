package unidad2.ejercicios_sem3;

//Factorial. Escribe un método que reciba un int y retorne su factorial como long

public class Ejercicio14 {
    public static long factorial(int n) {
        long resultado = 1;
        for (int i = 2; i <= n; i++) {
            resultado *= i;
        }
        return resultado;
    }

    public static void main(String[] args) {
        System.out.println("5! = " + factorial(5)); 
        System.out.println("10! = " + factorial(10)); 
    }
}
