public class Inventario {

    private Producto[] productos;
    private int contador;

    public Inventario(int capacidad) {
        productos = new Producto[capacidad];
        contador = 0;
    }


    public void agregarProducto(Producto p) {

        if (contador < productos.length) {
            productos[contador] = p;
            contador++;
            System.out.println("Producto agregado correctamente.");
        } else {
            System.out.println("Inventario lleno. No se puede agregar más productos.");
        }
    }


    public Producto buscarPorId(int id) {

        for (int i = 0; i < contador; i++) {
            if (productos[i].getId() == id) {
                return productos[i];
            }
        }

        return null;
    }


    public void actualizarStock(int id, int nuevaCantidad) {

        Producto p = buscarPorId(id);

        if (p != null) {
            p.setCantidadStock(nuevaCantidad);
            System.out.println("Stock actualizado correctamente.");
        } else {
            System.out.println("Producto no encontrado.");
        }
    }


    public double generarInformeValorTotal() {

        double total = 0;

        for (int i = 0; i < contador; i++) {
            total += productos[i].getPrecio() * productos[i].getCantidadStock();
        }

        return total;
    }


    public Producto[] obtenerProductosAgotados() {

        int cantidad = 0;

        for (int i = 0; i < contador; i++) {
            if (productos[i].getCantidadStock() < 5) {
                cantidad++;
            }
        }

        Producto[] agotados = new Producto[cantidad];
        int j = 0;

        for (int i = 0; i < contador; i++) {
            if (productos[i].getCantidadStock() < 5) {
                agotados[j] = productos[i];
                j++;
            }
        }

        return agotados;
    }


    public void ordenarPorPrecioDescendente() {

        for (int i = 0; i < contador - 1; i++) {

            for (int j = 0; j < contador - 1 - i; j++) {

                if (productos[j].getPrecio() < productos[j + 1].getPrecio()) {

                    Producto temp = productos[j];
                    productos[j] = productos[j + 1];
                    productos[j + 1] = temp;
                }
            }
        }
    }

  
    public void mostrarInventario() {

        for (int i = 0; i < contador; i++) {
            System.out.println(productos[i]);
        }
    }
}