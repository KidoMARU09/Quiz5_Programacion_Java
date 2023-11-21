import java.util.ArrayList;

public class Biblioteca {
    private ArrayList<Libro> librosDisponibles;

    public Biblioteca() {
        this.librosDisponibles = new ArrayList<>();
    }
    public void registrarLibro(Libro libro){
        librosDisponibles.add(libro);
    }
    public Libro buscarLibro(String tituloLibro){
        for (Libro libro : librosDisponibles) {
            if (libro.getTituloLibro().equalsIgnoreCase(tituloLibro)) {
                return libro;
            }
        }
        return null;
    }
    public void mostrarLibrosDisponibles(){
        System.out.println("Libros disponibles en la biblioteca:");
        for (Libro libro : librosDisponibles) {
            System.out.println("Título: " + libro.getTituloLibro() + ", Autor: " + libro.getAutorLibro() + ", Páginas: " + libro.getNumeroPagina());
        }
    }
}
