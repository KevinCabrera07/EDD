package EJERCICIOS;

public class Ejercicio10 {
    public static void main(String[] args) {

        int[] A = {8,5,3,10,2,8,1};
        int[] B = new int[(A.length+1)/2];

        for(int i = 0; i < B.length; i++){
            B[i] = A[i] + A[A.length-1-i];
        }

        for(int i = 0; i < B.length; i++){
            System.out.println("B[" + i + "]=" + B[i]);
        }
    }
}
