public class Opciones {
    public static void main(String[] args) {
        int opcion = 2;

        switch (opcion) {
            case 1:
                System.out.println("Nuevo pedido");
                break;
            case 2:
                System.out.println("Aplicar descuento");
                break;
            case 3:
                System.out.println("Cerrar caja");
                break;
            default:
                System.out.println("Opcion invalida");
        }
    }
}