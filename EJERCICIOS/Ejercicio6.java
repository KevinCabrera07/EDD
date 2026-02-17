package EJERCICIOS;

public class Ejercicio6 {
    public static void main(String[] args) {

        double[] alquiler = {800, 1000, 1200};
        double[] porcentaje = {10, 15, 12};

        double[] ganancia = new double[alquiler.length];

        for(int i = 0; i < alquiler.length; i++){
            ganancia[i] = alquiler[i] * porcentaje[i] / 100;
            System.out.println("Ganancia vivienda " + i + ": " + ganancia[i]);
        }
    }
}
