package EJERCICIOS;

public class Ejercicio5 {
    public static void main(String[] args) {

        double[] PU = {100, 50, 30};
        int[] CC = {2, 5, 3};
        String[] desc = {"Televisores", "Celulares", "Tablets"};

        double[] TG = new double[PU.length];
        double totalGeneral = 0;
        double mayor = 0;
        int posMayor = 0;

        for(int i = 0; i < PU.length; i++){
            TG[i] = PU[i] * CC[i];
            totalGeneral += TG[i];

            if(TG[i] > mayor){
                mayor = TG[i];
                posMayor = i;
            }
        }

        System.out.println("Total general: " + totalGeneral);
        System.out.println("Mayor gasto: " + desc[posMayor] + " con " + mayor);
    }
}
