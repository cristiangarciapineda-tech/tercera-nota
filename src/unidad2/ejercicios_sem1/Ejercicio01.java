package unidad2.ejercicios_sem1;

public class Ejercicio01 {
    public static void main(String[] args) {
        int resultado = numeroMayor(2, 5, 8);
        System.out.println("El numero mayor es: " + resultado);
    }

    public static int numeroMayor(int a, int b, int c){

        int mayor = a;

        if(b > mayor){
            mayor = b;
        }

        if(c > mayor){
            mayor = c;
        }

        return mayor;
    }


    
}

//combat