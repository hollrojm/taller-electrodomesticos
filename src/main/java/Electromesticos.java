public class Electromesticos {

    private String consumo;
    private String procedencia;
    private double precioBase;

    double precioConsumo;
    double precioProcedencia;


    public Electromesticos(String consumo, String procedencia) {
        this.consumo = consumo;
        this.procedencia = procedencia;
    }

    public double getPrecioTotal() {
        return precioBase;
    }


    private void obtenerValorConsumo() {
        switch (this.consumo) {
            case "A":
                precioBase = 450000;
                break;
            case "B":
                precioBase = 350000;
                break;
            case "C":
                precioBase = 250000;
            default:
                System.out.println("No ingreso  tipo de consumo valido");
        }
    }

  public double obtenerValorProcedencia() {
        switch (this.procedencia) {
            case "Nacional":
                return this.precioProcedencia = 250000;
            case "Importado":
                return this.precioProcedencia = 350000;

        }
        return this.precioProcedencia;
    }

    protected void sumarAdicional(double adicional){
        precioBase = precioBase + adicional;
    }
    public void calcularPrecio(){
        calcularPrecio();
    }

}







