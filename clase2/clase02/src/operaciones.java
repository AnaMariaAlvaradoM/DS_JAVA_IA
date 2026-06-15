import java.util.Scanner;
public class operaciones {
    public static void main(String[] args) {
        int a;
        int b;

        Scanner input = new Scanner(System.in);

        System.out.println("Ingrese a");
        a = input.nextInt();
        System.out.println("Ingrese b");
        b = input.nextInt();

        input.close();
        int suma = a + b;
        int resta = a - b;
        int multiplicacion = a * b;
        double division = (double)a / b;
        System.out.println("La suma de " + a + " y " + b + " es: " + suma);
        System.out.println("La resta de " + a + " y " + b + " es: " + resta);
        System.out.println("El producto de " + a + " y " + b + " es: " + multiplicacion);
        System.out.println("El cuociente de " + a + " entre " + b + " es: " + division);
    }
}