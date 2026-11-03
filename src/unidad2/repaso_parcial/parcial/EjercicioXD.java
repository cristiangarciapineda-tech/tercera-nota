package unidad2.repaso_parcial.parcial;

import java.util.Scanner;

//La universidad quiere analizar el consumo de comidas de los estudiantes durante una jornada.
//Construya un programa que permita:
//Solicitar cuántos tipos de comida se ofrecerán.
//Crear arreglos para almacenar:
//nombre de la comida
//tipo
//cantidad disponible inicial
//cantidad consumida
//Registrar la información de las comidas.
//Solicitar la cantidad de estudiantes que asistirán al comedor.
//Por cada estudiante: solicitar nombre solicitar la comida deseada
//Verificar si la comida existe.
//Verificar si aún hay unidades disponibles.
//Si hay disponibilidad: descontar una unidad disponible aumentar el contador de consumo
//Si no hay disponibilidad: informar que la comida está agotada

public class EjercicioXD {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        int n;

        System.out.println("Ingrese la cantidad de comida: ");
        n = leer.nextInt();

        
        String[] nombresComidas = new String[n];
        String[] tipos = new String[n];
        int[] disponibles = new int[n];
        int[] consumidas = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Ingrese el nombre de la comida: ");
            nombresComidas[i] = leer.nextLine();
            leer.nextLine();
            System.out.println("Ingrese el tipo de comida: ");
            tipos[i] = leer.nextLine();
            System.out.println("Ingrese la cantidad disponible incial: ");
            leer.nextLine();
            consumidas[i] = 0;
        }
        leer.close();

    }
}
