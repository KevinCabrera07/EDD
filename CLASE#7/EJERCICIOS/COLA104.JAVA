import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class COLA104 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese primer numero grande: ");
        String num1 = sc.nextLine();

        System.out.print("Ingrese segundo numero grande: ");
        String num2 = sc.nextLine();

        Queue<Integer> cola1 = new LinkedList<>();
        Queue<Integer> cola2 = new LinkedList<>();
        Queue<Integer> resultado = new LinkedList<>();

        // Guardar dígitos en colas
        for (char c : num1.toCharArray()) {
            cola1.add(Character.getNumericValue(c));
        }

        for (char c : num2.toCharArray()) {
            cola2.add(Character.getNumericValue(c));
        }

        // Convertir a listas para recorrer al revés
        LinkedList<Integer> l1 = new LinkedList<>(cola1);
        LinkedList<Integer> l2 = new LinkedList<>(cola2);

        int i = l1.size() - 1;
        int j = l2.size() - 1;
        int acarreo = 0;

        while (i >= 0 || j >= 0 || acarreo > 0) {

            int d1 = (i >= 0) ? l1.get(i) : 0;
            int d2 = (j >= 0) ? l2.get(j) : 0;

            int suma = d1 + d2 + acarreo;
            resultado.add(suma % 10);
            acarreo = suma / 10;

            i--;
            j--;
        }

        // Mostrar resultado correcto
        System.out.print("Resultado: ");
        LinkedList<Integer> res = new LinkedList<>(resultado);

        for (int k = res.size() - 1; k >= 0; k--) {
            System.out.print(res.get(k));
        }

        sc.close();
    }
}