import java.util.Random;

public class PrincipalS {

    public static void main(String[] args) {

        int[] energiaContenedores = new int[12];
        Random r = new Random();

        for (int i = 0; i < energiaContenedores.length; i++) {
            energiaContenedores[i] = r.nextInt(101) + 50;
        }

        int[] multiplos = new int[12];
        int contador = 0;

        for (int i = 0; i < energiaContenedores.length; i++) {

            if (energiaContenedores[i] % 10 == 0) {
                multiplos[contador] = energiaContenedores[i];
                contador++;
            }

        }
       int[][] mapaCarga = new int[3][3];

        int k = 0;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {

                if (k < contador) {
                    mapaCarga[i][j] = multiplos[k];
                    k++;
                } else {
                    mapaCarga[i][j] = -1;
                }
                

            }
        }

     System.out.println("Mapa de carga:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(mapaCarga[i][j] + " ");
            }
            System.out.println();
        }

Suministro[] manifiesto = new Suministro[9];

 int pos=0;
 for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {

                if (mapaCarga[i][j] != -1) {

                    int energia = mapaCarga[i][j];

                    String prioridad;

                    if (energia > 100) {
                        prioridad = "ALTA";
                    } else {
                        prioridad = "ESTÁNDAR";
                    }

                    String id = "C-" + i + "-" + j;

                    manifiesto[pos] = new Suministro(id, energia, prioridad);

                } else {

                    manifiesto[pos] = null;

                }

                pos++;

            }
        }

        
    }
}
