public class Ejercicio1 {
    public static void main(String[] args) {
        String nombreProducto = "Cafe Latte";
        double precioUnitario = 3.50;
        int cantidadInventario = 25;
        boolean disponibleHoy = true;
        char codigoProducto = 'A';

        System.out.println(String.format("Nombre del producto: %s", nombreProducto));
        System.out.println(String.format("Precio unitario: %.2f", precioUnitario));
        System.out.println(String.format("Cantidad inventario: %d", cantidadInventario));
        System.out.println(String.format("Disponible hoy: %b", disponibleHoy));
        System.out.println(String.format("Codigo producto: %c", codigoProducto));
    }
}
