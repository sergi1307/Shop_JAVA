public class Oficina extends Articulo {
    private String descripcion;

    /*Constructor por defecto
    public Oficina() {
        super();
        this.descripcion = "";
    }
    */

    /*Constructor General*/
    public Oficina(String codA, double pre, int iva, int stc, String desc) {
        super(codA, pre, iva, stc);
        if (desc != null) {
            this.descripcion = desc;
            System.out.println("Objeto creado");
        } else {
            System.out.println("Error: Valores introducidos no válidos");
        }
    }

    /*Getters*/
    public String getDescripcion() {
        return this.descripcion;
    }

    /*Setters*/
    public void setDescripcion(String s) {
        this.descripcion = s;
    }

    @Override
    public void imprimir() {
        System.out.println("\nInformación del artículo:");
        System.out.println("Código: " + getCodigo());
        System.out.println("Precio: " + getPrecio());
        System.out.println("IVA: " + getIva());
        System.out.println("Stock: " + getStock());
        System.out.println("Descripción: " + this.descripcion);
    }

    @Override
    public String toString() {
        return "\nInformación del artículo:\nCódigo: " + getCodigo() + "\nPrecio: " + getPrecio() + "\nIVA: " + getIva() + "\nStock: " + getStock()
                + "\nDescripción: " + this.descripcion;
    }
}
