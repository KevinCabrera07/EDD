package EJERCICIOS;

public class Ejercicio1 {
    public static void main(String[] args) {

        int[] a = {7, 2, 6, 1, 0, 3};

        int total = 0;

        for(int i = 0; i < a.length; i++){
            total += a[i];
        }

        System.out.println("La suma es: " + total);
    }
}
