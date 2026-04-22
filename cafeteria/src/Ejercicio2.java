public class Ejercicio2 {
    public static void main(String[] args) {

        double subtotal = 42500;
        double descuento = 0;
        double totalPagar;
        boolean aplicarDescuento;

        aplicarDescuento = subtotal > 30000;

        if (aplicarDescuento) {
            descuento = subtotal * 0.15;
        }

        totalPagar = subtotal - descuento;

        System.out.printf("Descuento: %.2f\n", descuento);
        System.out.printf("Total a pagar: %.2f\n", totalPagar);
        System.out.printf("¿Aplica descuento?: %b\n", aplicarDescuento);

    }
}
