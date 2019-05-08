package electrodomesticos;

public class Lavadora extends Electrodomestico {
    private Integer carga;
    private static Integer CargaDefault = 5;

    public Lavadora(){
        this(PrecioDefault, ColorDefault, ConsumoDefault, PesoDefault, CargaDefault);
    }

    public Lavadora(double precioBase, double peso){
        this(precioBase, ColorDefault, ConsumoDefault, peso, CargaDefault);
    }

    public Lavadora(double precioBase, String color, char consumoEnergetico, double peso, int carga){
        super(precioBase, color, consumoEnergetico, peso);
        this.carga=carga;
    }

    public Integer getCarga() {
        return carga;
    }

    @Override
    public Double precioFinal() {
        return super.precioFinal()+(carga>30 ? 50 : 0);
    }
}
