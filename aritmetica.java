public class aritmetica {

    // ==========================================
    // SECCIÓN DE OPERACIONES ARITMÉTICAS
    // ==========================================
      /*
    * Función: SUMA
    * Autor: Diego alejandro montaño quispe
    */
      public static double suma(int num1,int num2 ) {
        return (num1 + num2);
      }
    /*
    * Función: porcentaje
    * Autor: Alex Saavedra
    */
    public static double porcentaje(double total, double porcentaje) {
        return (total * porcentaje) / 100.0;
    }
    public static void main(String[] args) {
        System.out.println("--- Pruebas de Operaciones ---");
         System.out.println("Suma: " + suma(10, 10));
        System.out.println("Porcentaje: " + porcentaje(90, 12));
    }
}
