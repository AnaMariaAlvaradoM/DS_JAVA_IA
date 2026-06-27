import java.util.Scanner;

public class Validador {

    public static int leerEntero(Scanner sc, String mensaje) {
        while (true) {
            System.out.print(mensaje);
            if (sc.hasNextInt()) {
                int valor = sc.nextInt();
                sc.nextLine();
                return valor;
            } else {
                System.out.println("Eso no es un numero entero. Intenta de nuevo.");
                sc.nextLine();
            }
        }
    }

    public static double leerDecimal(Scanner sc, String mensaje) {
        while (true) {
            System.out.print(mensaje);
            if (sc.hasNextDouble()) {
                double valor = sc.nextDouble();
                sc.nextLine();
                return valor;
            } else {
                System.out.println("Eso no es un numero valido. Intenta de nuevo.");
                sc.nextLine();
            }
        }
    }

    public static String leerTexto(Scanner sc, String mensaje) {
        System.out.print(mensaje);
        return sc.nextLine();
    }
}


