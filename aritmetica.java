public class aritmetica {

    // ==========================================
    // SECCIÓN DE OPERACIONES ARITMÉTICAS
    // ==========================================
    
    /*
    * Función: porcentaje
    * Autor: Alex Saavedra
    */
    public static double porcentaje(double total, double porcentaje) {
        return (total * porcentaje) / 100.0;
    }
    public static void main(String[] args) {
        System.out.println("--- Pruebas de Operaciones ---");
        System.out.println("Porcentaje: " + porcentaje(90, 12));
    }
}
