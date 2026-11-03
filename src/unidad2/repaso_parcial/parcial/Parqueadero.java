package unidad2.repaso_parcial.parcial;

import java.util.Scanner;

public class Parqueadero {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        int n;

        // 1. Solicitar la cantidad de espacios
        System.out.println("Ingrese la cantidad de espacios del parqueadero:");
        n = leer.nextInt();
        leer.nextLine();

        // 2. Crear los arreglos
        int[] numeroEspacio = new int[n];
        String[] tipoPermitido = new String[n];
        String[] estado = new String[n];

        // 3. Registrar la informacion inicial de los espacios
        for (int i = 0; i < n; i++) {
            System.out.println("\nEspacio " + (i + 1));

            System.out.println("Ingrese el numero del espacio:");
            numeroEspacio[i] = leer.nextInt();
            leer.nextLine();

            System.out.println("Ingrese el tipo permitido (carro o moto):");
            tipoPermitido[i] = leer.nextLine();

            System.out.println("Ingrese el estado (disponible u ocupado):");
            estado[i] = leer.nextLine();
        }

        // 4. Solicitar la cantidad de vehiculos
        int cantidadVehiculos;

        System.out.println("\nIngrese la cantidad de vehiculos que desean ingresar:");
        cantidadVehiculos = leer.nextInt();
        leer.nextLine();

        // Contadores
        int carrosAsignados = 0;
        int motosAsignadas = 0;
        int vehiculosRechazados = 0;

        // 5. Registrar y asignar los vehiculos
        for (int i = 0; i < cantidadVehiculos; i++) {
            String placa;
            String tipoVehiculo;
            String propietario;

            System.out.println("\nVehiculo " + (i + 1));

            System.out.println("Ingrese la placa:");
            placa = leer.nextLine();

            System.out.println("Ingrese el tipo de vehiculo (carro o moto):");
            tipoVehiculo = leer.nextLine();

            System.out.println("Ingrese el nombre del propietario:");
            propietario = leer.nextLine();

            // 6. Buscar un espacio compatible y disponible
            int posicion = -1;

            for (int j = 0; j < n; j++) {
                if (estado[j].equalsIgnoreCase("disponible")
                        && tipoPermitido[j].equalsIgnoreCase(tipoVehiculo)) {
                    posicion = j;
                    break;
                }
            }

            // 7. Asignar el espacio si se encontro
            if (posicion != -1) {
                estado[posicion] = "ocupado";

                System.out.println("Vehiculo asignado correctamente.");
                System.out.println("Placa: " + placa);
                System.out.println("Propietario: " + propietario);
                System.out.println("Numero del espacio: " + numeroEspacio[posicion]);

                if (tipoVehiculo.equalsIgnoreCase("carro")) {
                    carrosAsignados++;
                } else if (tipoVehiculo.equalsIgnoreCase("moto")) {
                    motosAsignadas++;
                }

            } else {
                System.out.println("No hay espacios disponibles compatibles.");
                vehiculosRechazados++;
            }
        }

        // 8. Mostrar el estado final de los espacios
        System.out.println("\n===== ESTADO FINAL DEL PARQUEADERO =====");

        int espaciosDisponibles = 0;

        for (int i = 0; i < n; i++) {
            System.out.println("Espacio " + numeroEspacio[i]
                    + " | Tipo: " + tipoPermitido[i]
                    + " | Estado: " + estado[i]);

            if (estado[i].equalsIgnoreCase("disponible")) {
                espaciosDisponibles++;
            }
        }

        // 9. Mostrar los resultados
        System.out.println("\n===== RESUMEN =====");
        System.out.println("Espacios disponibles: " + espaciosDisponibles);
        System.out.println("Carros asignados: " + carrosAsignados);
        System.out.println("Motos asignadas: " + motosAsignadas);
        System.out.println("Vehiculos que no pudieron ingresar: " + vehiculosRechazados);

        leer.close();
    }
}

