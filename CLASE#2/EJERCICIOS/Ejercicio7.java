package EJERCICIOS;

public class Ejercicio7 {
    public static void main(String[] args) {

        int[] a = {7, 2, 6, 1, 0, 3, 8, 9, 4, 5};

        int[] pares = new int[a.length];
        int[] impares = new int[a.length];

        int p = 0;
        int im = 0;

        for(int i = 0; i < a.length; i++){
            if(a[i] % 2 == 0){
                pares[p++] = a[i];
            } else {
                impares[im++] = a[i];
            }
        }

        System.out.println("Pares:");
        for(int i = 0; i < p; i++){
            System.out.println(pares[i]);
        }

        System.out.println("Impares:");
        for(int i = 0; i < im; i++){
            System.out.println(impares[i]);
        }
    }
}
