package EJERCICIOS;

public class Ejercicio3 {
    public static void main(String[] args) {

        int[] a = {2, 6, 8, 1, 20, 40, 7, 3, 5};

        int sumaPares = 0;
        int sumaImpares = 0;

        for(int i = 0; i < a.length; i++){
            if(a[i] % 2 == 0){
                sumaPares += a[i];
            } else {
                sumaImpares += a[i];
            }
        }

        System.out.println("Suma pares: " + sumaPares);
        System.out.println("Suma impares: " + sumaImpares);
    }
}
