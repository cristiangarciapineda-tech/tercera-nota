package unidad1;
import java.util.Scanner;

public class Ejercicio_4 {
   public static void main(String[] args) {
      
      Scanner scanner = new Scanner (System.in);


      

      System.out.println("Ingresa primer numero: " );
      int numero1 = scanner.nextInt();
      System.out.println("Ingrese segundo numero: ");
      int numero2 = scanner.nextInt();
      System.out.println("Ingrese tercer numero: ");
      int numero3 = scanner.nextInt();

      boolean Resultado = (numero1 > numero2) && (numero1 < numero3);

      System.out.println("El primer numero es mayor que el segundo y menor que el tercero?: " + Resultado);



      scanner.close();

   }

}