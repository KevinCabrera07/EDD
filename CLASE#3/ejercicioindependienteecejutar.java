public class ejercicioindependienteecejutar {

    public static void main(String[] args) {

        Curso[] cursos = new Curso[4];

        cursos[0] = new Curso(1, "Cálculo Diferencial", "Juan Pérez", 30);
        cursos[1] = new Curso(2, "Estructura de Datos", "Ana Gómez", 25);
        cursos[2] = new Curso(3, "Física: Electricidad y Magnetismo", "Carlos Ruiz", 20);
        cursos[3] = new Curso(4, "Probabilidad y Estadística", "Laura Torres", 15);

        // Mostrar cursos
        System.out.println("Listado de cursos:");
        for (int i = 0; i < cursos.length; i++) {
            System.out.println(cursos[i]);
        }

        // Total de estudiantes
        System.out.println("\nTotal de estudiantes en todos los cursos: "
                + Curso.getTotalEstudiantes());
    }
}
