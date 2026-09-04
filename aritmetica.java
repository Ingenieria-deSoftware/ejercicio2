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
    * Función: Potencia
    * Autor: Jose Armando Quisbert Medrano
     */
    public static int potencia(int numero, int exponente){
        return (int)Math.pow(numero, exponente);
    }
       

    public static void main(String[] args) {
        System.out.println("--- Pruebas de Operaciones ---");
        System.out.println("Suma: " + suma(5, 3));
        System.out.println("Multiplicación: " + multiplicacion(5.0, 3.0));
        System.out.println("Porcentaje: " + porcentaje(90, 12));
        System.out.println("Raíz cuadrada: " + raiz(25));
        System.out.println("Potencia: " + potencia(2, 3));
        System.out.println("Factorial: " + factorial(5));
    }
}