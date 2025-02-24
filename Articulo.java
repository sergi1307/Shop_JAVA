public class Articulo {
    private String codigo;
    private double precio;
    private int iva;
    private int stock;

    /*Constructor por defecto con valores asignados por mí
    public Articulo() {
        this.codigo = "";
        this.precio = 0.0;
        this.iva = 0;
        this.stock = 0;
    }
    */

    /*Constructor General con valores dados por el usuario*/
    public Articulo(String c, double p, int i, int s) {
        if (c != null && p > 0.0 && (i == 4 || i == 10 || i == 21) && s > 0) {
            this.codigo = c;
            this.precio = p;
            this.iva = i;
            this.stock = s;
            System.out.println("Constructor Creado");
        } else {
            System.out.println("Introduzca bien los datos en el constructor.");
        }
    }

    /*Getters de los atributos*/
    public String getCodigo() {
        return this.codigo;
    }

    public double getPrecio() {
        return this.precio;
    }

    public int getIva() {
        return this.iva;
    }

    public int getStock() {
        return this.stock;
    }

    /*Setters de los atributos*/
    public void setCodigo(String c) {
        this.codigo = c;
    }

    public void setPrecio(double p) {
        this.precio = p;
    }

    public void setIva(int i) {
        this.iva = i;
    }

    public void setStock(int s) {
        this.stock = s;
    }
}
