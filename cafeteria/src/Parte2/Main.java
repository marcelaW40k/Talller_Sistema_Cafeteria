package Parte2;

public class Main {
    public static void main(String[] args) {
        String[] nombres = {"Café americano", "Capuchino", "Jugo naranja", "Tostada",
                "Brownie"};
        double[] precios = {3500, 5000, 4000, 4500, 6000};
        char[] categorias = {'B', 'B', 'F', 'C', 'P'}; // B=Bebida caliente, F=Fría, C=Comida,P=Postre
        int[] pedidoProducto = {0, 2, 1, 4, 0, 3}; // índice del producto en cada pedido
        int[] pedidoCantidad = {2, 1, 3, 1, 1, 2}; // unidades por pedido
        double subTotal = 0;
        for (int i = 0; i < pedidoProducto.length; i++) {
            switch (categorias[i]){
                case 'B':
                    System.out.println("Bebida Caliente");
                    break;
                case 'F':
                    System.out.println("Bebida Fria");
                    break;
                case 'C':
                    System.out.println("Comida");
                    break;
                case 'P':
                    System.out.println("Postre");
                    break;
                default:
                    System.out.println("No Existe en el menu, desconocida!");

            }
            subTotal = precios[i] *  pedidoCantidad[i];
            System.out.println((i+1) + ": Producto: " + nombres[i] + ", cantidad: " + pedidoCantidad[i] + ", Subtotal: "+ subTotal);

        }
    }
}
