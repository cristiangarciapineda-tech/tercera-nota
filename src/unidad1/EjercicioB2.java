package unidad1;
import java.util.Scanner;

public class EjercicioB2 {
    public static void main(String[] args){
        Scanner lector = new Scanner(System.in);
        
        //arrays 
        String[] nombres = new String[5];
        String[] identificaciones = new String[5];
        double[] promedios = new double[5];
        String[] estados = new String[5];

        //Matriz en base a los estudiantes y materia
        double[][] notas = new double[5][3];

        final double limiteAprobacion = 3.0;

        for (int f = 0; f < notas.length; f++ ){
            double sumaPromedio = 0;
            System.out.println("Ingresa nombre del estudiante " + (f +1));
            nombres[f] = lector.nextLine();
            System.out.println("Registra tu codigo estudiantil: ");
            identificaciones[f] = lector.nextLine();


            for (int c = 0; c < notas[f].length; c++){
                do{

                    System.out.println("Ingrese la nota de la materia #" + (c +1));
                    notas[f][c] = lector.nextDouble(); 
                    
                    if (notas[f][c]< 0 || notas[f][c]>5){
                        System.out.println("NOTA ERRONEA........(ingresa tu nota de 0 a 5)");
                        System.out.println(" ");

                    }


                } while(notas[f][c]< 0 || notas[f][c]>5);
                
                sumaPromedio = sumaPromedio + notas[f][c];

            }
            lector.nextLine();
                
            double promedio = sumaPromedio/notas[f].length;
            promedios[f] = promedio;
            String estadoComprobacion = "Reprobado";

            if (promedio >= limiteAprobacion) {
                System.out.println("---APROBADO---");
                System.out.println("----" + promedio + "----");
                estadoComprobacion = "Aprobado"; 
            }else {
                System.out.println("---REPROBADO---");
                System.out.println("----" + promedio + "----");
                    
            }
            
            estados[f] = estadoComprobacion;

        } 
        
        //Reporte general(listado)
        System.out.println("-------------------------------------------------------------");
        System.out.println("        REPORTE GENERAL DE LOS ESTUDIANTES");
        System.out.println("-------------------------------------------------------------");
        System.out.println("Codigo      | Nombre      | Promedio      | Estado");
        System.out.println("-------------------------------------------------------------");

        for (int i = 0; i < 5; i++){

            System.out.println(identificaciones[i] + "       | " + nombres[i] + "       | " + promedios[i] + "       | " + estados[i]);

            System.out.println("---------------------------------------------------------");
        }

        lector.close();
                
    }

}