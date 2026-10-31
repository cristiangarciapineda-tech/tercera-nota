package unidad2.ejercicios_sem2;

//Contraseña con 3 intentos. Simula un login con un arreglo de intentos. Si la contraseña es correcta o se agotan los 3 intentos, el ciclo termina con break

public class Ejercicio07 {
    public static void main(String[] args) {
        String[] intentos = {"password123", "admin123", "user123"};
        String contraseñaCorrecta = "password123";
        boolean loginExitoso = false;

        for (int i = 0; i < intentos.length; i++) {
            if (intentos[i].equals(contraseñaCorrecta)) {
                System.out.println("Login exitoso.");
                loginExitoso = true;
                break;
            } else {
                System.out.println("Intento fallido. Intente nuevamente.");
            }
        }

        if (!loginExitoso) {
            System.out.println("Se agotaron los 3 intentos. Acceso denegado.");
        }
    }

        String correcta = "clave123";
        String[] intentos = {"abc", "1234", "clave123", "admin"};
        int usados = 0;
        boolean acceso = false;

        for (String intento : intentos) {
            usados++;
            if (intento.equals(correcta)) {
                acceso = true;
                break;
            }
            if (usados == 3) {
                break;
            }
        }
        System.out.println(acceso  "Acceso concedido en el intento " + usados : "Cuenta bloqueada");
}
