public class Contenedor {

    private String id;
    private double pesoToneladas;
    private String origen;

    public Contenedor(String id, double pesoToneladas, String origen) {
        this.id = id;
        this.pesoToneladas = pesoToneladas;
        this.origen = origen;
    }

    public String getId() { return id; }
    public double getPeso() { return pesoToneladas; }
    public String getOrigen() { return origen; }

    @Override
    public String toString() {
        return "Contenedor [id=" + id +
               ", peso=" + pesoToneladas + " ton" +
               ", origen=" + origen + "]";
    }
}