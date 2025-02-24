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
}
