package EJERCICIOS;

public class Ejercicio15 {
    public static void main(String[] args) {

        String[] nombres = {"Ana", "Luis", "Carlos", "Maria"};
        double[] sueldos = {1000, 1200, 1000, 900};

        double suma = 0;

        for(int i = 0; i < sueldos.length; i++){
            suma += sueldos[i];
        }

        double promedio = suma / sueldos.length;

        System.out.println("Promedio: " + promedio);

        for(int i = 0; i < sueldos.length; i++){
            if(sueldos[i] == promedio){
                System.out.println("Tiene sueldo promedio: " + nombres[i]);
            }
        }
    }
}
