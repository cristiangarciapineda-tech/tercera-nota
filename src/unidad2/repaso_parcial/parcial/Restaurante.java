package unidad2.repaso_parcial.parcial;
    
import java.util.Scanner;

public class Restaurante {
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        int n;

        // 1. Solicitar cantidad de comidas
        System.out.println("Ingrese la cantidad de comidas:");
        n = leer.nextInt();
        leer.nextLine();

        // 2. Crear arreglos paralelos
        String[] nombres = new String[n];
        String[] tipos = new String[n];

        int[] disponibles = new int[n];
        int[] consumidos = new int[n];

        // 3. Registrar informacion de las comidas
        for (int i = 0; i < n; i++) {

            System.out.println("\nIngrese el nombre de la comida:");
            nombres[i] = leer.nextLine();

            System.out.println("Ingrese el tipo de comida:");
            tipos[i] = leer.nextLine();

            System.out.println("Ingrese la cantidad disponible:");
            disponibles[i] = leer.nextInt();
            leer.nextLine();

            consumidos[i] = 0;
        }

        // 4. Solicitar cantidad de estudiantes
        int estudiantes;

        System.out.println("\nIngrese la cantidad de estudiantes:");
        estudiantes = leer.nextInt();
        leer.nextLine();

        // 5. Registrar solicitudes de estudiantes
        for (int i = 0; i < estudiantes; i++) {

            String nombreEstudiante;
            String comidaSolicitada;

            System.out.println("\nIngrese el nombre del estudiante:");
            nombreEstudiante = leer.nextLine();

            System.out.println("Ingrese la comida que desea:");
            comidaSolicitada = leer.nextLine();

            // 6. Buscar la comida
            int posicion = -1;

            for (int j = 0; j < n; j++) {

                if (nombres[j].equalsIgnoreCase(comidaSolicitada)) {
                    posicion = j;
                    break;
                }
            }

            // 7. Verificar si existe y hay disponibilidad
            if (posicion != -1) {

                if (disponibles[posicion] > 0) {

                    disponibles[posicion]--;
                    consumidos[posicion]++;

                    System.out.println("Comida servida correctamente a "
                            + nombreEstudiante);

                } else {

                    System.out.println("La comida esta agotada.");
                }

            } else {

                System.out.println("La comida solicitada no existe.");
            }
        }

        // 8. Calcular total de comidas servidas
        int total = 0;

        for (int i = 0; i < n; i++) {
            total += consumidos[i];
        }

        // 9. Encontrar mayor y menor consumo
        int mayor = consumidos[0];
        int menor = consumidos[0];

        int posMayor = 0;
        int posMenor = 0;

        for (int i = 1; i < n; i++) {

            if (consumidos[i] > mayor) {
                mayor = consumidos[i];
                posMayor = i;
            }

            if (consumidos[i] < menor) {
                menor = consumidos[i];
                posMenor = i;
            }
        }

        // 10. Mostrar resultados
        System.out.println("\n===== RESULTADOS DEL COMEDOR =====");

        for (int i = 0; i < n; i++) {

            System.out.println("\nComida: " + nombres[i]);
            System.out.println("Tipo: " + tipos[i]);
            System.out.println("Unidades restantes: " + disponibles[i]);
            System.out.println("Unidades consumidas: " + consumidos[i]);
        }

        System.out.println("\nTotal general de comidas servidas: " + total);

        System.out.println("Comida con mayor consumo: "
                + nombres[posMayor] + " (" + mayor + ")");

        System.out.println("Comida con menor consumo: "
                + nombres[posMenor] + " (" + menor + ")");

        leer.close();
    }
}

