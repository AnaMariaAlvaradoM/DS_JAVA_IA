public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        final double IVA = 0.19;
        final int DIAS_SEMANA = 7;

        System.out.println("El valor del IVA es: " + IVA);
        System.out.println("El número de días en una semana es: " + DIAS_SEMANA);

        //final double IVA = 0.20; 
        // Esto generará un error de compilación porque IVA es una constante

        //! Suma
        int a = 5;
        int b = 10;
        int suma = a + b;
        System.out.println("La suma de " + a + " y " + b + " es: " + suma);

        //! Resta
        int resta = b - a;
        System.out.println("La resta de " + b + " y " + a + " es: " + resta);

        //! Multiplicación
        int multiplicacion = a * b;
        System.out.println("La multiplicación de " + a + " y " + b + " es: " + multiplicacion);

        //! División
        int division = b / a;
        System.out.println("La división de " + b + " entre " + a + " es: " + division);

        //! Módulo
        int modulo = b % a;
        System.out.println("El módulo de " + b + " entre " + a + " es: " + modulo);

        System.out.println(10 % 3);
        System.out.println(10 + 3);
    }
}
