public class Libros extends Articulo {
    private String titulo;
    private String codigoAutor;
    private String isbn;

    /*Constructor por defecto
    public Libros() {
        super();
        this.titulo = "";
        this.codigoAutor = "";
        this.isbn = "";
    }
    */

    /*Constructor General*/
    public Libros(String c, double p, int i, int s, String t, String co, String is) {
        super(c, p, i, s);
        if (t != null && co != null && is != null) {
            this.titulo = t;
            this.codigoAutor = co;
            this.isbn = is;
            System.out.println("Objeto creado");
        } else {
            System.out.println("Error: Valores introducidos no válidos");
        }
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

    @Override
    public void imprimir() {
        System.out.println("\nInformación del artículo:");
        System.out.println("Código: " + getCodigo());
        System.out.println("Precio: " + getPrecio());
        System.out.println("IVA: " + getIva());
        System.out.println("Stock: " + getStock());
        System.out.println("Título: " + this.titulo);
        System.out.println("Código autor: " + this.codigoAutor);
        System.out.println("ISBN: " + this.isbn);
    }

    @Override
    public String toString() {
        return "\nInformación del artículo:\nCódigo: " + getCodigo() + "\nPrecio: " + getPrecio() + "\nIVA: " + getIva() + "\nStock: " + getStock()
                + "\nTítulo: " + this.titulo + "\nCódigo autor: " + this.codigoAutor + "\nISBN: " + this.isbn;
    }
}
