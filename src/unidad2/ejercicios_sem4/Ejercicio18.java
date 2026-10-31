package unidad2.ejercicios_sem4;

//Crea una clase Estudiante que tenga los atributos nombre y edad. Luego crea un método llamado modificarEstudiante(Estudiante e) que cambie la edad del estudiante. En main, crea un estudiante, muestra sus datos antes y después de utilizar el método.

class Estudiante {

    String nombre;
    int edad;

}

public class Ejercicio18 {
    public static void modificarEstudiantes(Estudiante e) {
        e.edad = 20;
    }

    public static void main(String[] args) {
        Estudiante estudiante = new Estudiante();

        estudiante.nombre = "Carlos";
        estudiante.edad = 18;

        System.out.println("Nombre: " + estudiante.nombre);
        System.out.println("Edad: " + estudiante.edad);

        modificarEstudiantes(estudiante);

        System.out.println("Nombre: " + estudiante.nombre);
        System.out.println("Edad: " + estudiante.edad);
    }
}
