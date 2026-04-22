public class Ejercicio4 {
    
    public class While {
        public static void main(String[] args) {
            int inventario = 50;
            int consumoPorPedido = 2; // valor fijo, puedes poner 1, 2 o 3

            while (inventario >= 10) {
                inventario -= consumoPorPedido;
                System.out.println("Inventario restante: " + inventario);
            }

            System.out.println("Inventario bajo, quedan menos de 10 unidades.");
        }
    }

}
