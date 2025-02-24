public class Mobiliario extends Articulo {
    private String material;
    private String codigoFabric;
    private int garantia;

    /*Constructor por defecto*/
    public Mobiliario() {
        super();
        this.material = "";
        this.codigoFabric = "";
        this.garantia = 0;
    }

    /*Constructor General*/
    public Mobiliario(String codA, double pre, int iva, int stc, String mat, String codF, int gar) {
        super(codA, pre, iva, stc);
        this.material = mat;
        this.codigoFabric = codF;
        this.garantia = gar;
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
}
