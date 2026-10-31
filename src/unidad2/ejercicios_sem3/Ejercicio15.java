package unidad2.ejercicios_sem3;

//Precio con descuento. Escribe un método que reciba un precio y un porcentaje de descuento (dos argumentos) y retorne el precio final

public class Ejercicio15 {
    public static double aplicarDescuento(double precio, double porcentaje) {
        return precio - (precio * porcentaje / 100);
    }

    public static void main(String[] args) {
        double precioFinal = aplicarDescuento(80000, 15);
        System.out.println("Precio final: " + precioFinal);
    }
}
