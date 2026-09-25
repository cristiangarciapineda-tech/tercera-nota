package unidad1;
import java.util.Scanner;

public class Ejercicio_3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Valor camiseta: 25$ ");
        System.out.println("Valor pantalon: 30$ ");
        int priceShrit = 25;
        int pricePants = 30;
        double totalShrit15, totalPants15, discount5, sumaPrendas ;


        System.out.println("Ingrese la cantidad de camisetas a comprar: ");
            int camiseta = scanner.nextInt();


        totalShrit15 = (priceShrit * camiseta) * 0.85;


        
        System.out.println("Ingrese la cantidad de pantalones a comprar: ");
            int pantalon = scanner.nextInt();

        totalPants15 = (pricePants * pantalon) * 0.85;



        sumaPrendas = totalShrit15 + totalPants15;



        System.out.println("Valor descuento 15% camiseta: " + totalShrit15);
        System.out.println("Valor desceunto 15% pantalon: " + totalPants15);
        System.out.println("Total de la camiseta y pantalon con 15% de descuento: " + sumaPrendas);


        if (camiseta >= 2) {
            discount5 = totalShrit15 * 0.95;
            sumaPrendas = discount5 + totalPants15;
            System.out.println("Valor con 5% de descuento adicional: " + discount5);
            System.out.println("Total de la camiseta y pantalon con 15% de descuento mas el descuento adicional a la camiseta: " + sumaPrendas);
        }   


        scanner.close();
    }
}
