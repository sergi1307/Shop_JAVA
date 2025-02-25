public class Mobiliario extends Articulo {
    private String material;
    private String codigoFabric;
    private int garantia;

    /*Constructor por defecto
    public Mobiliario() {
        super();
        this.material = "";
        this.codigoFabric = "";
        this.garantia = 0;
    }
    */

    /*Constructor General*/
    public Mobiliario(String codA, double pre, int iva, int stc, String mat, String codF, int gar) {
        super(codA, pre, iva, stc);
        if (mat != null && codF != null && gar > 0) {
            this.material = mat;
            this.codigoFabric = codF;
            this.garantia = gar;
            System.out.println("Objeto creado");
        } else {
            System.out.println("Error: Valores introducidos no válidos");
        }
    }

    /*Getters*/
    public String getMaterial() {
        return this.material;
    }

    public String getCodigoFabric() {
        return this.codigoFabric;
    }

    public int getGarantia() {
        return this.garantia;
    }

    /*Setters*/
    public void setMaterial(String mat) {
        this.material = mat;
    }

    public void setCodigoFabric(String codF) {
        this.codigoFabric = codF;
    }

    public void setGarantia(int gar) {
        this.garantia = gar;
    }

    @Override
    public void imprimir() {
        System.out.println("\nInformación del artículo:");
        System.out.println("Código: " + getCodigo());
        System.out.println("Precio: " + getPrecio());
        System.out.println("IVA: " + getIva());
        System.out.println("Stock: " + getStock());
        System.out.println("Material: " + this.material);
        System.out.println("Código Fabricante: " + this.codigoFabric);
        System.out.println("Garantía: " + this.garantia);
    }

    @Override
    public String toString() {
        return "\nInformación del artículo:\nCódigo: " + getCodigo() + "\nPrecio: " + getPrecio() + "\nIVA: " + getIva() + "\nStock: " + getStock()
                + "\nMaterial: " + this.material + "\nCódigo Fabricante: " + this.codigoFabric + "\nGarantía: " + this.garantia;
    }
}
