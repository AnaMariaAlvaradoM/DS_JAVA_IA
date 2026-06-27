public class Metodos {
    public static void main(String[] args) {
        double propina = calcularPropina(80000, 0.10);
        System.out.println("Propina: " + propina);
    }

    public static double calcularPropina(double subtotal, double porcentaje) {
        return subtotal * porcentaje;
    }

    public static double calcularTotal(double subtotal, double porcentaje) {
    double propina = calcularPropina(subtotal, porcentaje);
    return subtotal + propina;
    }

    
}