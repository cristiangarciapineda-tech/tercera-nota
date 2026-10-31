package unidad2.ejercicios_sem2;

//Contar vocales. Cuenta cuántas vocales tiene una frase usando un contador

public class Ejercicio08 {
    public static void main(String[] args) {
        String frase = "Hello World";
        int vocales = 0;
        for (int i = 0; i < frase.length(); i++) {
            char c = Character.toLowerCase(frase.charAt(i));
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                vocales++;
            }
        }
        System.out.println("Vocales: " + vocales);
    }
}
