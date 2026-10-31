package unidad2.ejercicios_sem1;

//Primos optimizados. Imprime los números primos hasta 30. Para optimizar, solo pruebas divisores hasta la raíz cuadrada del número (j * j <= i)

public class Ejercicio03 {
    public static void main(String[] args) {
        for (int i = 2; i <= 30; i++) {
            boolean primo = true;
            for (int j = 2; j * j <= i; j++) {
                if (i % j == 0) {
                    primo = false;
                    break;
                }
            }
            if (primo) System.out.print(i + " ");
        }
    }
}
