package unidad2.ejercicios_sem3;

//Área del círculo. Escribe un método que reciba el radio y retorne el área como double

public class Ejercicio13 {
    public static double areaCirculo(double radio) {
        return Math.PI * radio * radio;
    }

    public static void main(String[] args) {
        double area = areaCirculo(3.0);
        System.out.println("Área: " + area);
    }
}
