import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);


        System.out.print("Nombre del cliente: ");
        String nombre = sc.nextLine();

        System.out.print("Cuantas personas en la mesa? ");
        int personas = sc.nextInt();

        sc.nextLine();

        System.out.println("Mesa de " + nombre + ", " + personas + " personas.");

        //! 
        double subtotal = 20000;
        boolean tieneCupon = true;

        boolean aplicaDescuento = subtotal > 100000 || tieneCupon;
        System.out.println("Aplica descuento? " + aplicaDescuento);


        int unidades = 5;
        double comoDecimal = unidades;
        System.out.println("Implicita: " + comoDecimal);   

        double precio = 19990.75;
        int precioRecortado = (int) precio;
        System.out.println("Casting: " + precioRecortado); 
    }
}
