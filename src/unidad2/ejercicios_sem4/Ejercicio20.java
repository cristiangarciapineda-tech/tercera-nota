package unidad2.ejercicios_sem4;

//Crea un programa que tenga un método llamado duplicarNumero que reciba un número entero e intente duplicar su valor. En main, crea una variable numero, muestra su valor antes y después de llamar al método.

public class Ejercicio20 {
    public static void duplicarNumero(int numero) {
        numero = numero * 2;

        System.out.println("Dentro del metodo: " + numero);
    }

    public static void main(String[] args) {

        int numero = 15;

        System.out.println(numero);

        duplicarNumero(numero);

        System.out.println(numero);
    }
}
