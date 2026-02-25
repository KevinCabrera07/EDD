public class EjecutarInventario {

    public static void main(String[] args) {

        Inventario inventario = new Inventario(10);

        inventario.agregarProducto(new Producto(1, "GTA5", 95000, 3));
        inventario.agregarProducto(new Producto(2, "Uncharted 3", 50000, 10));
        inventario.agregarProducto(new Producto(3, "Watch Dogs 2", 60000, 2));
        inventario.agregarProducto(new Producto(4, "Red Dead Redemption 2", 12000, 7));

        System.out.println("=== INVENTARIO ORIGINAL ===");
        inventario.mostrarInventario();

        System.out.println("\n=== VALOR TOTAL DEL INVENTARIO ===");
        System.out.println("$" + inventario.generarInformeValorTotal());

        System.out.println("\n=== PRODUCTOS AGOTADOS (<5) ===");
        Producto[] agotados = inventario.obtenerProductosAgotados();
        for (Producto p : agotados) {
            System.out.println(p);
        }

        System.out.println("\n=== ORDENADO POR PRECIO DESCENDENTE ===");
        inventario.ordenarPorPrecioDescendente();
        inventario.mostrarInventario();
    }
}