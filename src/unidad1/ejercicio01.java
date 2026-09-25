package unidad1;

import java.util.Scanner;

public class Ejercicio01 {
    public static void main(String[] args) {
        System.out.println("Ejercicio 01 de la unidad 1");

        
        Scanner Input = new Scanner(System.in);

        System.out.println("Escribe tu nombre: ");
        String name = Input.nextLine();
        System.out.println("Hola, " + name);

        System.out.println("Ingrese el primer numero: " );
        Double numero1 = Input.nextDouble(); 
        System.out.println("Ingrese el segundo numero: ");
        Double numero2 = Input.nextDouble();

        Double Resultado = numero1 + numero2;
        System.out.println("Resultado: " + Resultado);

        System.out.println("Ingrese la edad: ");
        byte edad = Input.nextByte();
        
        if (edad > 18) {
            System.out.println("Eres Mayor de edad");
        }else {
            System.out.println("Eres Menor de edad");
        }


        System.out.println("Ingrese la nota");
        Float nota = Input.nextFloat();
        final Float NOTA_EXCELENTE = 4.5f;
        final Float NOTA_APROBADA = 3.0f;

        if (condition) {
            
        }

        byte opcion = 2;
        switch (opcion) {
            case 1:
                System.out.println("Crear Usuario");
                break;
            case 2:
                System.out.println("Editar Usuario");
            default:
                System.out.println("Opcion es incorrecta");
                break;
        }
        
        //byte contador = 1
        byte contador = 1;
        while (contador <= 5) {
            System.out.println("Contando " + contador);
            contador++;
        }

        for (int i = 1; i <= 5; i++) {
            System.out.println("Contando " + i);
        }

        for (int i = 5; i == 5; i--) {
            System.out.println("Contando " + i);
        }
        
        //Diferencia entre un while, do-while, for y para que sirve
        //Quiz en base a los ejercicios practicos 

        Input.close();



    }
}
