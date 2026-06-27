import java.util.Scanner;

public class Menu {

    public static void mostrar() {
        System.out.println();
        System.out.println("=== GESTOR DE INVENTARIO ===");
        System.out.println("1. Registrar producto");
        System.out.println("2. Ver producto");
        System.out.println("3. Actualizar cantidad");
        System.out.println("4. Ver valor total");
        System.out.println("5. Salir");
    }

    public static int leerOpcion(Scanner sc) {
        return Validador.leerEntero(sc, "Elige una opcion: ");
    }
}