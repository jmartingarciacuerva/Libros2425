import java.util.Objects;

public class Libro {
    //Atributos
    private String titulo;
    private String autor;
    private String editorial;
    private int numeroPaginas;
    private int edicion;

    //Constructores

    public Libro(String titulo, String autor, String editorial, int numeroPaginas, int edicion) {
        this.titulo = titulo;
        this.autor = autor;
        this.editorial = editorial;
        this.numeroPaginas = numeroPaginas;
        this.edicion = edicion;
    }
    public Libro(String titulo) {
        this.titulo = titulo;

    }

    //Getter y Setters

    public void setEdicion(int edicion) {
        this.edicion = edicion;
    }


    // Metodos


    @Override
    public String toString() {
        return
                "Titulo='" + titulo + '\'' +
                ", Editorial='" + editorial + '\'' +
                ", Autor='" + autor + '\'' +
                ", Numero de Paginas=" + numeroPaginas +
                ", Edicion=" + edicion;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Libro)) return false;
        Libro libro = (Libro) o;
        return Objects.equals(titulo, libro.titulo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(titulo);
    }
}
