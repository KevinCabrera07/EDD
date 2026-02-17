package EJERCICIOS;

public class Ejercicio2 {

    public static void main(String[] args) {

        
        double[] sueldo = {1000, 1200, 900, 1500};
        double[] asignaciones = {200, 150, 100, 300};
        double[] deducciones = {100, 80, 50, 120};

        // Guarda el valor neto
        double[] neto = new double[sueldo.length];

        // Calcula el neto
        for(int i = 0; i < sueldo.length; i++){
            neto[i] = sueldo[i] + asignaciones[i] - deducciones[i];
        }

        // Mostrar resultados
        for(int i = 0; i < neto.length; i++){
            System.out.println("Empleado " + i);
            System.out.println("Sueldo: " + sueldo[i]);
            System.out.println("Asignaciones: " + asignaciones[i]);
            System.out.println("Deducciones: " + deducciones[i]);
            System.out.println("Neto a pagar: " + neto[i]);
            System.out.println("-------------------");
        }

    }
}

