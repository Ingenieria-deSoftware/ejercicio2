public class aritmetica {

    // ==========================================
    // SECCIÓN DE OPERACIONES ARITMÉTICAS
    // ==========================================
    
    /*
    * Función: suma
    * Autor: Diego alejandro montaño quispe
    */
    public static double suma(double num1, double num2) {
        return (num1 + num2);
    }
    
    /*
    * Función: multiplicacion
    * Autor: Juan Carlos Anagua
    */
    public static double multiplicacion(double a, double b) {
        return a * b;
    }
    
    /*
    * Función: resta
    * Autor: Miguel Angel Vargas Mercado
    */
    public static double resta(double a, double b) {
        return (a - b);
    }

    /* 
    * Función: Division
    * Autor: Natalie Saravia Camacho
    */
    public static double division(double a, double b) { 
        return a / b ; 
    }
    
    /*
    * Función: porcentaje
    * Autor: Alex Saavedra
    */
    public static double porcentaje(double total, double porcentaje) {
        return (total * porcentaje) / 100.0;
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

    /*
    * Función: promedio
    * Autor: Nicole Flores 
    */
    public static double promedio(double a, double b) {
        return (a + b) / 2.0;
    }

    /*
    * Función: factorial
    * Autor: Tais Gemio Escobar
    */
    public static long factorial(long n) {
        if (n == 0) {
            return 1;
        }
        return n * factorial(n - 1);
    }

    /*
    * Función: Módulo
    * Autor: Anelis Cordova Nigoevic
    */
    public static double modulo(double a, double b) {
        return a % b;
    }

    /*
    * Función: Potencia
    * Autor: Jose Armando Quisbert Medrano
    */
    public static int potencia(int numero, int exponente){
        return (int)Math.pow(numero, exponente);
    }
    
    // ==========================================
    // MÉTODO DE PRUEBAS
    // ==========================================

    public static void main(String[] args) {
        System.out.println("--- Pruebas de Operaciones ---");
        System.out.println("Suma (5 + 3): " + suma(5, 3));
	    System.out.println("Resta (10 - 4): " + resta(10, 4));
        System.out.println("Multiplicación (5.0 * 3.0): " + multiplicacion(5.0, 3.0));
        System.out.println("División (20.0 / 4.0): " + division(20.0, 4.0));
        System.out.println("Porcentaje (12% de 90): " + porcentaje(90, 12));
        System.out.println("Raíz cuadrada de (25): " + raiz(25));
        System.out.println("Promedio de dos números (8 y 6): " + promedio(8, 6));
        System.out.println("Módulo: 10 % 3 = " + modulo(10, 3));
        System.out.println("Potencia (2 ^ 3): " + potencia(2, 3));
        System.out.println("Factorial (5!): " + factorial(5));
    }
}