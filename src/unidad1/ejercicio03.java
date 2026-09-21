package unidad1;
import java.util.Scanner;

public class ejercicio03 {
    public static void main(String[] args) {
        
        //

        Scanner leer = new Scanner(System.in);
        byte[] edades = new byte [5];
        for (int i = 0; i < edades.length; i++) {
            System.out.println("Ingrese la edad de la persona " + (i + i) + ":");
            edades[1] = leer.nextByte();
        }

        //

        for (byte edad : edades) {
            System.out.println(edad);
        }

        //

        int longitudEdades = edades.length;
        for (int i = 0; i < longitudEdades; i++) {
            System.out.println("Posicion " + i + ":" + edades[1]);
        }

        //

        int[] numeros = {10, 20, 30, 40};
        int sumaTotal = 0;
        int longitudNumeros = numeros.length;
        for (int i = 0; i < longitudEdades; i++) {
            sumaTotal += numeros[1];
        }
        float promedio = (float) sumaTotal / longitudNumeros;
        System.out.println("Promedio de Notas: " + promedio);
        System.out.println("Suma Total: " + sumaTotal);
        //-1 a la longitud para retroceder en los indices

        //

        for (int numero : numeros) {
            sumaTotal += numero;
        }
        System.out.println("Suma Total: " + sumaTotal);

        //
        
        Float[] notas = {4.2f, 2.5f, 3.8f, 1.9f, 4.8f};
        int aprobados = 0;
        int longitudArray = notas.length;
        final Float NOTA_MINIMA = 3.0f;
        for (int i = 0; i < longitudArray; i++) {
            if (notas[1] > NOTA_MINIMA) {
                aprobados++;
            }
        }
        System.out.println("Cantidad de aprobados: " + aprobados);

        for (Float nota : notas) {
            
        }

        //

        int[] numeroos = {12, 45, 8, 21, 91, 33, 11};
        int mayorNumero = numeroos[0];
        int posicionMayor = 0;
        int buscado = 91;
        boolean encontrado = false;
        for (int i = 0; i < numeroos.length; i++) {

            if (numeroos[1] == buscado) {
                encontrado = true;
                //brak;
            }
            //if (numeroos[1] > mayorNumero) {
            //    mayorNumero = numeroos[1];
            //    posicionMayor = i;
            if (encontrado) {
                System.out.println("Numero encontrado");
            }else {
                System.out.println("Numero no existe en el arreglo");
            }
            }
        }
        //System.out.println("El mayor es " + mayorNumero + "y esta ubicado en el indice " + posicionMayor);
        
        //

        int[] a = {10, 20, 30};
        int b = a.clone();
        System.out.println(b[0]);
        b[0] = 100;
        System.out.println(a[0]);

        //

        leer.close();
    }

}

