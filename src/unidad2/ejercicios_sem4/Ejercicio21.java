package unidad2.ejercicios_sem4;

//Crea una clase Producto que tenga los atributos nombre y precio. Crea un método llamado aumentarPrecio(Producto p) que aumente el precio del producto en 1000. En main, crea un producto, muestra sus datos antes y después de llamar al método.

class Producto {

    String nombre;
    int precio;

}

public class Ejercicio21 {
    public static void aumentarPrecio(Producto p) {
        p.precio = p.precio + 1000;
    }

    public static void main(String[] args) {

        Producto producto = new Producto();

        producto.nombre = "Cuaderno";
        producto.precio = 5000;

        System.out.println("Nombre: " + producto.nombre);
        System.out.println("Precio: " + producto.precio);

        aumentarPrecio(producto);

        System.out.println("Nombre: " + producto.nombre);
        System.out.println("Precio: " + producto.precio);
    }
}
