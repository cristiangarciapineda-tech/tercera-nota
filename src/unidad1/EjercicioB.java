package unidad1;
import java.util.Scanner;

public class EjercicioB {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        //Definimos constantes
        final int CANTIDAD_ESTUDIANTES = 5;
        final int CANTIDAD_ASIGNATURAS = 3;
        final double NOTA_MINIMA = 3.0;

        //Arreglo que almacena nombres e identificaciones
        String[] nombres = new String[CANTIDAD_ESTUDIANTES];
        String[] identificaciones = new String[CANTIDAD_ESTUDIANTES];

        //Arreglo para almacenar las notas
        double[][] notas = new double[CANTIDAD_ESTUDIANTES][CANTIDAD_ASIGNATURAS];

        //Arreglo para almacenar promedios
        double[] promedios = new double[CANTIDAD_ESTUDIANTES];

        //Registra la informacion del estudiante
        for (int i = 0; i < CANTIDAD_ESTUDIANTES; i++) {

            System.out.println("Ingrese el nombre del estudiante " + (i + 1) + ": ");
            nombres[i] = entrada.nextLine();

            System.out.println("Ingrese la identificación del estudiante " + (i + 1) + ": ");
            identificaciones[i] = entrada.nextLine();

            //Registra las 3 notas
            for (int j = 0; j < CANTIDAD_ASIGNATURAS; j++) {

                System.out.println("Ingrese la nota de la asignatura " + (j + 1) + ": ");

                notas[i][j] = entrada.nextDouble();
            }

            entrada.nextLine();
            
            //Calcular promedios
            promedios[i] = (notas[i][0] + notas[i][1] + notas[i][2]) / 3;

            System.out.println();
        }

        //Reporte final
        System.out.println("Reporte Final");

        for (int i = 0; i < CANTIDAD_ESTUDIANTES; i++) {

            if (promedios[i] >= NOTA_MINIMA) {
                System.out.println(nombres[i] + " (ID: " + identificaciones[i] + ") - Promedio: " + promedios[i] + " - Aprobado");
            } else {
                System.out.println(nombres[i] + " (ID: " + identificaciones[i] + ") - Promedio: " + promedios[i] + " - Reprobado");
            }
        }

        entrada.close();
    }
}
