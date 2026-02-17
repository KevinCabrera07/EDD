package EJERCICIOS;

public class Ejercicio13 {
    public static void main(String[] args) {

        int[] A = {4, 6, 8, 2, 6};
        double suma = 0;

        for(int i = 0; i < A.length; i++){
            suma += A[i];
        }

        double media = suma / A.length;

        System.out.println("Media: " + media);

        for(int i = 0; i < A.length; i++){
            if(A[i] > media)
                System.out.println("Mayor a media: " + A[i]);
            else if(A[i] < media)
                System.out.println("Menor a media: " + A[i]);
        }
    }
}
