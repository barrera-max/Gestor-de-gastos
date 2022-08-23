public class Compras {
    private int codigo;
    private String descripcion;
    private int mes;
    private int sucursal;
    private float importe;


    public Compras(){}


    public Compras(int codigo, String descripcion, int mes, int sucursal, float importe)
    {
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.mes = mes;
        this.sucursal = sucursal;
        this.importe = importe;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getSucursal() {
        return sucursal;
    }

    public void setSucursal(int sucursal) {
        this.sucursal = sucursal;
    }

    public float getImporte() {
        return importe;
    }

    public void setImporte(float importe) {
        this.importe = importe;
    }

    @Override
    public String toString() {
        return "COMPRA | " +
                "Codigo=" + codigo +
                ", Descripcion='" + descripcion + '\'' +
                ", Mes=" + mes +
                ", Sucursal=" + sucursal +
                ", Importe=$" + importe +
                '|';
    }

    }


