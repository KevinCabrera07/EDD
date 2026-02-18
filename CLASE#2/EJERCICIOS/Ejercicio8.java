package EJERCICIOS;

public class Ejercicio8 {
    public static void main(String[] args) {

        int[] a = {5, 8, 2, 9, 2, 9, 1, 1};

        int mayor = a[0];
        int menor = a[0];
        int contMayor = 0;
        int contMenor = 0;

        for(int i = 0; i < a.length; i++){
            if(a[i] > mayor){
                mayor = a[i];
                contMayor = 1;
            } else if(a[i] == mayor){
                contMayor++;
            }

            if(a[i] < menor){
                menor = a[i];
                contMenor = 1;
            } else if(a[i] == menor){
                contMenor++;
            }
        }

        System.out.println("Mayor: " + mayor + " veces: " + contMayor);
        System.out.println("Menor: " + menor + " veces: " + contMenor);
    }
}
