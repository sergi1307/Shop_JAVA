public class Libros extends Articulo {
    private String titulo;
    private String codigoAutor;
    private String isbn;

    /*Constructor por defecto*/
    public Libros() {
        super();
        this.titulo = "";
        this.codigoAutor = "";
        this.isbn = "";
    }

    /*Constructor General*/
    public Libros(String c, double p, int i, int s, String t, String co, String is) {
        super(c, p, i, s);
        this.titulo = t;
        this.codigoAutor = co;
        this.isbn = is;
    }

    /*Getters*/
    public String getTitulo() {
        return this.titulo;
    }

    public String getCodigoAutor() {
        return this.codigoAutor;
    }

    public String getIsbn() {
        return this.isbn;
    }

    /*Setters*/
    public void setTitulo(String t) {
        this.titulo = t;
    }

    public void setCodigoAutor(String co) {
        this.codigoAutor = co;
    }

    public void setIsbn(String is) {
        this.isbn = is;
    }
}
