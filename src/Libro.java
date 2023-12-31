public class Libro {
    private String tituloLibro;
    private String autorLibro;
    private int numeroPagina;

    public String getTituloLibro() {
        return tituloLibro;
    }

    public void setTituloLibro(String tituloLibro) {
        this.tituloLibro = tituloLibro;
    }

    public String getAutorLibro() {
        return autorLibro;
    }

    public void setAutorLibro(String autorLibro) {
        this.autorLibro = autorLibro;
    }

    public int getNumeroPagina() {
        return numeroPagina;
    }

    public void setNumeroPagina(int numeroPagina) {
        this.numeroPagina = numeroPagina;
    }

    public Libro(String tituloLibro, String autorLibro, int numeroPagina) {
        this.tituloLibro = tituloLibro;
        this.autorLibro = autorLibro;
        this.numeroPagina = numeroPagina;
    }
}