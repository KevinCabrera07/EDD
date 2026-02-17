package EJERCICIOS;

public class Ejercicio11 {
    public static void main(String[] args) {

        int[] A = {-3, 0, 5, -1, 8};

        for(int i = 0; i < A.length; i++){
            if(A[i] < 0)
                System.out.println("Negativo: " + A[i]);
            else if(A[i] == 0)
                System.out.println("Cero");
            else
                System.out.println("Positivo: " + A[i]);
        }
    }
}
