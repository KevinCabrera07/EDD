public class Curso {

    private int id;
    private String nombreCurso;
    private String profesor;
    private int cantidadEstudiantes;

    // Variable estática para acumular el total
    private static int totalEstudiantes = 0;

    // Constructor
    public Curso(int id, String nombreCurso, String profesor, int cantidadEstudiantes) {
        this.id = id;
        this.nombreCurso = nombreCurso;
        this.profesor = profesor;
        this.cantidadEstudiantes = cantidadEstudiantes;

        totalEstudiantes += cantidadEstudiantes;
    }

    // Getters
    public int getId() {
        return id;
    }

    public String getNombreCurso() {
        return nombreCurso;
    }

    public String getProfesor() {
        return profesor;
    }

    public int getCantidadEstudiantes() {
        return cantidadEstudiantes;
    }

    // Método estático para obtener el total general
    public static int getTotalEstudiantes() {
        return totalEstudiantes;
    }

    @Override
    public String toString() {
        return "Curso [id=" + id +
               ", nombre=" + nombreCurso +
               ", profesor=" + profesor +
               ", estudiantes=" + cantidadEstudiantes + "]";
    }
}
