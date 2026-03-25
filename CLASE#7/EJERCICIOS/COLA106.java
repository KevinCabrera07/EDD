import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;

public class COLA106 {

    public static void main(String[] args) {

        Queue<Integer> colaClientes = new LinkedList<>();

        Random rand = new Random();

        int tiempoTotal = 60 * 7; // 7 horas en minutos
        int clientesAtendidos = 0;
        int maxCola = 0;
        int sumaCola = 0;

        int caja1 = 0, caja2 = 0, caja3 = 0, caja4 = 0;

        for (int tiempo = 0; tiempo < tiempoTotal; tiempo++) {

            // Llegan clientes (probabilidad)
            if (rand.nextInt(2) == 0) {
                colaClientes.add(tiempo); // guardamos tiempo de llegada
            }

            // Activar caja 4 si hay muchos clientes
            boolean usarCaja4 = colaClientes.size() > 20;

            // Atender clientes si la caja está libre
            if (caja1 == 0 && !colaClientes.isEmpty()) {
                colaClientes.poll();
                caja1 = rand.nextInt(2) + 1; // 1-2 min
                clientesAtendidos++;
            }

            if (caja2 == 0 && !colaClientes.isEmpty()) {
                colaClientes.poll();
                caja2 = rand.nextInt(4) + 2; // 2-5 min
                clientesAtendidos++;
            }

            if (caja3 == 0 && !colaClientes.isEmpty()) {
                colaClientes.poll();
                caja3 = rand.nextInt(3) + 2; // 2-4 min
                clientesAtendidos++;
            }

            if (usarCaja4 && caja4 == 0 && !colaClientes.isEmpty()) {
                colaClientes.poll();
                caja4 = rand.nextInt(3) + 2; // 2-4 min
                clientesAtendidos++;
            }

            // Reducir tiempos de atención
            if (caja1 > 0) caja1--;
            if (caja2 > 0) caja2--;
            if (caja3 > 0) caja3--;
            if (usarCaja4 && caja4 > 0) caja4--;

            // Estadísticas
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