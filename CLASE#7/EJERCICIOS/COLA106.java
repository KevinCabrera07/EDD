import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;

public class COLA106 {

    public static void main(String[] args) {

        Queue<Integer> colaClientes = new LinkedList<>();

        Random rand = new Random();

        int tiempoTotal = 60 * 7; 
        int clientesAtendidos = 0;
        int maxCola = 0;
        int sumaCola = 0;

        int caja1 = 0, caja2 = 0, caja3 = 0, caja4 = 0;

        for (int tiempo = 0; tiempo < tiempoTotal; tiempo++) {

            
            if (rand.nextInt(2) == 0) {
                colaClientes.add(tiempo); 
            }

        
            boolean usarCaja4 = colaClientes.size() > 20;

        
            if (caja1 == 0 && !colaClientes.isEmpty()) {
                colaClientes.poll();
                caja1 = rand.nextInt(2) + 1; 
                clientesAtendidos++;
            }

            if (caja2 == 0 && !colaClientes.isEmpty()) {
                colaClientes.poll();
                caja2 = rand.nextInt(4) + 2;
                clientesAtendidos++;
            }

            if (caja3 == 0 && !colaClientes.isEmpty()) {
                colaClientes.poll();
                caja3 = rand.nextInt(3) + 2; 
                clientesAtendidos++;
            }

            if (usarCaja4 && caja4 == 0 && !colaClientes.isEmpty()) {
                colaClientes.poll();
                caja4 = rand.nextInt(3) + 2; 
                clientesAtendidos++;
            }

            
            if (caja1 > 0) caja1--;
            if (caja2 > 0) caja2--;
            if (caja3 > 0) caja3--;
            if (usarCaja4 && caja4 > 0) caja4--;

            
            sumaCola += colaClientes.size();

            if (colaClientes.size() > maxCola) {
                maxCola = colaClientes.size();
            }
        }

        double promedioCola = (double) sumaCola / tiempoTotal;

        System.out.println("Clientes atendidos: " + clientesAtendidos);
        System.out.println("Tamaño promedio de cola: " + promedioCola);
        System.out.println("Tamaño máximo de cola: " + maxCola);
    }
}