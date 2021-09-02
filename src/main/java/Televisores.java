
public class Televisores extends Electromesticos{
private double tamano;
private String TDT;

    public Televisores(String consumo, String procedencia, double tamano, String TDT) {
        super(consumo, procedencia);
        this.tamano = tamano;
        this.TDT = TDT;
    }

    public void ObetenerPulgada(){
       double pulgadas =  tamano > 40 ?  getPrecioTotal()*0.3 :  getPrecioTotal();
    }
    public  void obetenerPrecioTDT(){
        String sincro = TDT == "si" ? String.valueOf(getPrecioTotal()+250000) : String.valueOf(getPrecioTotal());
    }

    public void calcularPrecio(){
        super.calcularPrecio();
        obetenerPrecioTDT();
        obtenerValorProcedencia();
    }
}
