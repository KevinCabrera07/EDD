public class Puerto {

    private Buque[] buques;
    private Contenedor[][] matriz;
    private int contadorBuques;
    private int totalContenedores;

    public Puerto() {
        buques = new Buque[10];
        matriz = new Contenedor[10][10];
        contadorBuques = 0;
        totalContenedores = 0;
    }

    public void registrarBuque(Buque b) {

        if (contadorBuques < buques.length) {
            buques[contadorBuques] = b;
            contadorBuques++;
            System.out.println("Buque registrado correctamente.");
        } else {
            System.out.println("No hay espacio para más buques.");
        }
    }

    public void registrarContenedor(Contenedor c, int fila, int columna) {

        if (fila < 0 || fila >= 10 || columna < 0 || columna >= 10) {
            System.out.println("Posición inválida. Debe estar entre 0 y 9.");
            return;
        }

        if (matriz[fila][columna] != null) {
            System.out.println("Ya hay un contenedor en esa posición.");
            return;
        }

        if (fila < 9 && matriz[fila + 1][columna] == null) {
            System.out.println("Error: No se puede colocar un contenedor en el aire.");
            System.out.println("Debe existir un contenedor debajo.");
            return;
        }

        matriz[fila][columna] = c;
        totalContenedores++;

        System.out.println("Contenedor agregado en fila "
                + fila + ", columna " + columna + ".");
    }

    public double pesoTotal() {

        double total = 0;

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {

                if (matriz[i][j] != null) {
                    total += matriz[i][j].getPeso();
                }
            }
        }

        return total;
    }

    public void listarAgrupado() {

        System.out.println("\n          0     1     2     3     4     5     6     7     8     9");

        for (int fila = 0; fila < 10; fila++) {

            System.out.printf("Fila %-2d | ", fila);

            for (int col = 0; col < 10; col++) {

                if (matriz[fila][col] == null) {
                    System.out.print(" ---- ");
                } else {
                    System.out.printf("%-5s", matriz[fila][col].getId());
                }
            }

            System.out.println();
        }
    }

    public void listarContenedoresDetallado() {

        System.out.println("\n===== CONTENEDORES REGISTRADOS =====");

        boolean hay = false;

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {

                if (matriz[i][j] != null) {

                    System.out.println(matriz[i][j]);
                    System.out.println("Ubicación -> Fila: " + i +
                                       ", Columna: " + j);
                    System.out.println("----------------------------------");

                    hay = true;
                }
            }
        }

        if (!hay) {
            System.out.println("No hay contenedores registrados.");
        }
    }
}