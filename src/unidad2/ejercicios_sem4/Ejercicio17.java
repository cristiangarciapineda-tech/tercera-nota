package unidad2.ejercicios_sem4;

//Crea un programa que tenga un método llamado cambiarValores que intente cambiar los valores de dos variables enteras. Desde el método main, crea las variables x e y, muestra sus valores iniciales, llama al método y vuelve a mostrarlos para comprobar si realmente cambiaron.

public class Ejercicio17 {
    public static void cambiarValores(int x, int y) {
        int temporal = x;
        x = y;
        y = temporal;

        System.out.println("x = " + x);
        System.out.println("y = " + y);
        
    }

    public static void main(String[] args) {
        int x = 10;
        int y = 20;

        System.out.println("x = " + x);
        System.out.println("y = " + y);

        cambiarValores(x, y);

        System.out.println("x = " + x);
        System.out.println("y = " + y);

    }
    
}
