package EJERCICIOS;

import java.util.Scanner;
import java.util.Stack;

public class PILA94 {
    
 public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = 5;
        Stack<Integer>[] pilas = new Stack[n];

       
        for (int i = 0; i < n; i++) {
            pilas[i] = new Stack<>();
        }

        int i, j;

        System.out.println("Ingrese pares (i, j). i=0 para terminar:");

        while (true) {
            System.out.print("i: ");
            i = sc.nextInt();

            if (i == 0) break;

            System.out.print("j: ");
            j = sc.nextInt();

            if (i > 0) {
                if (i <= n) {
                    pilas[i - 1].push(j);
                    System.out.println("Insertado " + j + " en pila " + i);
                }
            } else {
                int index = Math.abs(i) - 1;

                if (index < n && !pilas[index].isEmpty()) {
                    int eliminado = pilas[index].pop();
                    System.out.println("Eliminado " + eliminado + " de pila " + Math.abs(i));
                } else {
                    System.out.println("No se puede eliminar (pila vacía o inválida)");
                }
            }
        }

       
        System.out.println("\nContenido de las pilas:");
        for (int k = 0; k < n; k++) {
            System.out.println("Pila " + (k + 1) + ": " + pilas[k]);
        }

        sc.close();
    }
}
