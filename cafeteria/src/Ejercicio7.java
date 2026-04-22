public class Ejercicio7 {
    public static void main(String[] args) {
        int cantidadVendida = 5;  // Error complilación: la variable esta declarada como int, espera un entero y se pasa una string
        double precioUnitario = 4500;
        double total = cantidadVendida * precioUnitario;  // Error complilación: falta el ;
        boolean aplicaDescuento = (total > 20000); // Error logico: la variable espera un tru o false y se pasa una condición
        if (aplicaDescuento = true) {   // Error logico
            total = total - (total * 0.10);
        }
        System.out.println("Total: " + total);

    }
}
