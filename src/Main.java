import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        String tituloLibro,autorLibro;
        int numeroPaginas;
        System.out.println("Bienvenido a la biblioteca de la Konrad Lorenz");
        System.out.print("Ingrese el titulo del libro:");
        tituloLibro = lector.toString();
        System.out.print("Ingrese el nombre del autor:");
        autorLibro = lector.toString();
        System.out.print("Ingrese el número de páginas");
        numeroPaginas = lector.nextInt();

    }
}