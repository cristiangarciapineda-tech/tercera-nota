package unidad2.ejercicios_sem2;

//Omitir múltiplos de 3. Imprime los números del 1 al 20, pero salta los múltiplos de 3 usando continue

public class Ejercicio06 {
    public static void main(String[] args) {
        for (int i = 1; i <= 20; i++) {
            if (i % 3 == 0) {
                continue;
            }
            System.out.print(i + " ");
        }
    }
}
