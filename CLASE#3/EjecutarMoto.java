public class EjecutarMoto {
    
    public static void main(String[] args) {
            
        Moto[] m = new Moto[9];
        
        m[0] = new Moto( 2026, "AKT", "Negra", 125, 1250.0);
        m[1] = new Moto(2025, "Kawasaki", "Verde", 400, 25000.0);
        m[2] = new Moto(2026, "Honda", "Roja", 350, 15.0);
        m[3] = new Moto(2027, "Honda", "DoradoNegro", 90.0, 1000.0);
        m[4] = new Moto(2026, "Yamaha", "Azul", 150, 5000.0);
        m[5] = new Moto(2025, "AKT", "Blanca", 125, 1250.0);
        m[6] = new Moto(2026, "Yamaha", "Negra", 120, 1000.0);
        m[7] = new Moto(2026, "Victory", "Amarillo", 400, 5000.0);
        m[8] = new Moto(2024, "Yamaha", "Negra", 800, 20000.0);
        

//operaciones en el arrego 
        double promedio = 0.0;
        int suma = 0;
        for (int i = 0; i < m.length; i++) {
            suma += m[i].getModelo();
        }
        System.out.println("El promedio de los modelos de las motos es: " + (suma / m.length));

        //Presupuesto de motos adsequibles  con un presupuesto de 2000.0 dolares
        String cad ="\n";
        for (int i = 0; i < m.length; i++) {
            if (m[i].getPrecio() <= 2000.0) {
                cad += m[i].getMarca() + m[i].getPrecio() + "\n";
            }
        }
        System.out.println("Las motos adsequibles con un presupuesto de 2000.0 dolares son: " + cad);
    }
}
