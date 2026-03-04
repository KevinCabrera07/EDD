import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Puerto puerto = new Puerto();
        int opcion = 0;

        do {
            System.out.println("\n===== MENU PRINCIPAL =====");
            System.out.println("1. Registrar Buque");
            System.out.println("2. Registrar Contenedor");
            System.out.println("3. Mostrar Peso Total");
            System.out.println("4. Listar Agrupado");
            System.out.println("5. Listar Contenedores Detallado");
            System.out.println("6. Salir");
            System.out.print("Seleccione una opcion: ");

            opcion = sc.nextInt();

            switch (opcion) {

                case 1:
                    System.out.print("ID del buque: ");
                    int id = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Nombre del buque: ");
                    String nombre = sc.nextLine();

                    System.out.print("Pais del buque: ");
                    String pais = sc.nextLine();

                    Buque b = new Buque(id, nombre, pais);
                    puerto.registrarBuque(b);
                    break;

                case 2:
                    sc.nextLine();

                    System.out.print("ID del contenedor: ");
                    String idC = sc.nextLine();

                    System.out.print("Peso del contenedor (en toneladas): ");
                    double peso = sc.nextDouble();
                    sc.nextLine();

                    if (peso <= 0) {
                        System.out.println("El peso debe ser mayor a 0.");
                        break;
                    }

                    System.out.print("Origen del contenedor: ");
                    String origen = sc.nextLine();

                    System.out.print("Fila (0-9): ");
                    int fila = sc.nextInt();

                    System.out.print("Columna (0-9): ");
                    int columna = sc.nextInt();

                    Contenedor c = new Contenedor(idC, peso, origen);
                    puerto.registrarContenedor(c, fila, columna);
                    break;

                case 3:
                    System.out.println("Peso total del puerto: "
                            + puerto.pesoTotal() + " toneladas");
                    break;

                case 4:
                    puerto.listarAgrupado();
                    break;

                case 5:
                    puerto.listarContenedoresDetallado();
                    break;

                case 6:
                    System.out.println("Cerrando aplicación...");
                    break;

                default:
                    System.out.println("Opción inválida.");
            }

        } while (opcion != 6);

        sc.close();
    }
}