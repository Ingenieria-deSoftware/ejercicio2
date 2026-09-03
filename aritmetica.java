public class aritmetica {

    // ==========================================
    // SECCIÓN DE OPERACIONES ARITMÉTICAS
    // ==========================================

        /*
    * Función: multiplicacion
    * Autor: Juan Carlos Anagua
    */
    public static double multiplicacion(double a, double b) {
        return a * b;
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
        System.out.println("Multiplicación: " + multiplicacion(5, 3));
        System.out.println("Porcentaje: " + porcentaje(90, 12));
    }
}

/*
    * Función: raíz
    * Autor: Dadier Cadima
    */
    public static double raiz(double numero) {
        if (numero < 0) {
            System.out.println("Error: No existe raíz cuadrada de números negativos.");
            return 0;
        }
        return Math.sqrt(numero);
    }

    public static void main(String[] args) {
        System.out.println("--- Pruebas de Operaciones ---");
        System.out.println("Multiplicación: " + multiplicacion(5, 3));
        System.out.println("Porcentaje: " + porcentaje(90, 12));
        System.out.println("Raíz cuadrada: " + raiz(25));
    }
}
