package unidad2.ejercicios_sem1;

//Primer múltiplo de 7 mayor a 50. Recorre los números a partir del 51 y detén el ciclo con break cuando encuentres el primer múltiplo de 7

public class Ejercicio05 {
    public static void main(String[] args) {
        for (int i = 51; i <= 100; i++) {
            if (i % 7 == 0) {
                System.out.println("Primer múltiplo de 7 mayor a 50: " + i);
                break;
            }
        }
    }
}
