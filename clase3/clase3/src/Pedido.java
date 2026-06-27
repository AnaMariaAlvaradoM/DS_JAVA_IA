public class Pedido {

    double calcularTotal(double subtotal, double porcentaje) {
        double propina = subtotal * porcentaje;
        return subtotal + propina;
    }
}


