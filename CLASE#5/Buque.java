public class Buque {

    private int id;
    private String nombre;
    private String pais;

    public Buque(int id, String nombre, String pais) {
        this.id = id;
        this.nombre = nombre;
        this.pais = pais;
    }

    public int getId() { return id; }
    public String getNombre() { return nombre; }
    public String getPais() { return pais; }

    @Override
    public String toString() {
        return "Buque [ID=" + id +
               ", Nombre=" + nombre +
               ", País=" + pais + "]";
    }
}