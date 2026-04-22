import java.util.Scanner;

public class Ejercicio3 {

    public static void main(String[] args) {

        Scanner src = new Scanner(System.in);

        System.out.print("Ingrese el código de categoría (B, F, C, P): ");
        char codigo = src.next().toUpperCase().charAt(0);

        String descripcion;
        String iva;

        switch (codigo) {
            case 'B':
                descripcion = "Bebida caliente";
                iva = "0%";
                break;

            case 'F':
                descripcion = "Bebida fría";
                iva = "5%";
                break;

            case 'C':
                descripcion = "Comida";
                iva = "8%";
                break;

            case 'P':
                descripcion = "Postre";
                iva = "8%";
                break;

            default:
                descripcion = "Categoría no reconocida";
                iva = "N/A";
                break;
        }

        System.out.println("Categoría: " + descripcion);
        System.out.println("IVA Aplicado: " + iva);

        src.close();
    }
}