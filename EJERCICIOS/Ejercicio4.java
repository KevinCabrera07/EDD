package EJERCICIOS;

public class Ejercicio4 {
    public static void main(String[] args) {

        int[] a = {18, 25, 30, 22};
        int[] b = {19, 28, 35, 27};

        int mayor = a[0];

        for(int i = 0; i < a.length; i++){
            if(a[i] > mayor){
                mayor = a[i];
            }
        }

        for(int i = 0; i < b.length; i++){
            if(b[i] > mayor){
                mayor = b[i];
            }
        }

        System.out.println("Mayor edad: " + mayor);
    }
}

