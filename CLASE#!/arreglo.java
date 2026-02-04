import java.util.*;

public class arreglo {
    public static void main(String[] args) throws Exception {
       
        int[] a = {2, 6, 8, 1, 20, 40, 7, 3, 5};
        
        System.out.println("a[4]=" + a[4]); //20
        System.out.println("a[7]=" + a[7]); //3
        System.out.println("a[2]=" + a[2]); //8
        System.out.println("a[0]=" + a[0]); //2
        System.out.println("a[1]=" + a[1]); //6

        System.out.println("tamaño del arreglo a: "+ a.length);

        for(int i= 0; i < a.length; i++){
            System.out.println("a["+ i + "]=" +a[i]);
        }
        //añado la variable suma
        int suma=0;

         for(int i= 0; i < a.length; i++){
            //se suman los elementos del arreglo
            suma += a[i];
         }
         //da el resultado de la suma
         System.out.println("suma total:"+ suma);

    }
}
