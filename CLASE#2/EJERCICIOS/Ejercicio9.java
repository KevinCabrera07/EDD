package EJERCICIOS;

public class Ejercicio9 {
    public static void main(String[] args) {

        int[] a = {4, 6, 8, 2, 6, 9, 6, 1};
        int x = 6;
        int contador = 0;

        for(int i = 0; i < a.length; i++){
            if(a[i] == x){
                contador++;
            }
        }

        System.out.println("Se repite: " + contador + " veces");
    }
}
