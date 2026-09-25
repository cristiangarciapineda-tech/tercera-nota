package unidad1;

public class Ejercicio02 {
    public static void main(String[] args) {

        //Un arreglo es una estructura de datos que nos permite guardar elementos del mismo tipo, el tamaño se define cuando se crea
        //Necesito guardar las notas de 5 estudiantes
        float notaestudiante1 = 4.2f;
        float notaestudiante2 = 3.5f;
        float notaestudiante3 = 2.9f;
        float notaestudiante4 = 3.7f;
        float notaestudiante5 = 3.0f;

        float[] notas = new float[5];

        notas[0] = 4.2f;
        notas[1] = 3.5f;
        notas[2] = 2.9f;
        notas[3] = 3.7f;
        notas[4] = 3.0f;

        //for, el unico que nos va a permitir acceder a un indice
        for (int i = 0; i < notas.length; i++) {
            System.out.println(notas[0]);
        }
        

        //for each, cuando se va a operar con todos los datos de array
        for (float nota : notas) {
            System.out.println(nota);
        }

        int numeros[] = new int[4];
        //Ultimo indice es igual al tamaño -1
        System.out.println(numeros[3]);


        int numeros[] = [18, 24, 32, 4, 2];
        int longitud = numeros.length;
        int ultimoIndice = longitud -1;
        System.out.println("longitud: " + longitud);
        System.out.println("Ultimo indice: " + ultimoIndice);
        //numero.legth dice cuantos valores tiene el arreglo
        
    }
}
