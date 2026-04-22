public class Ejercicio6 {
    public static void main(String[] args) {
    //Menu del día
        String[] productos = {"Café americano", "Capuchino", "Jugo de naranja", "Tostada",
                "Brownie"};
        double[] precios = {3500, 5000, 4000, 4500, 6000};
        double acum = 0;
        double promedio = 0;
        System.out.println("Menu de día:");
        for (int i = 0; i < productos.length; i++) {
            System.out.println((i + 1) + ":" + productos[i] + "------"+ precios[i]);
            acum = acum + precios[i];
            promedio = acum / precios.length;
        }
        System.out.println("======CALCULAR EL PROMEDIO DEL MENU======");
        System.out.println("El precio promedio del menú es: " + promedio);
    }
}
