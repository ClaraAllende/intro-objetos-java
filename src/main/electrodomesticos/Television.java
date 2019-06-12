package main.electrodomesticos;

public class Television extends Electrodomestico {
    private Integer resolucion;
    private Boolean smart;

    private static Integer ResolucionDefault = 20;
    private static Boolean SmartDefault = false;

    public Integer getResolucion() {
        return resolucion;
    }

    public Boolean getSmart() {
        return smart;
    }

    @Override
    public Double precioFinal() {
        return super.precioFinal() * (this.resolucion>40 ? 1.3 : 1) + (smart ? 50 : 0);
    }

    public Television(){
        this(PrecioDefault, ColorDefault, ConsumoDefault, PesoDefault, ResolucionDefault, false);
    }

    public Television(double precioBase, double peso){
        this(precioBase, ColorDefault, ConsumoDefault, peso, ResolucionDefault, false);
    }

    public Television(double precioBase, String color, char consumoEnergetico, double peso, int resolucion, boolean smart) {
        super(precioBase,color,consumoEnergetico,peso);
        this.resolucion=resolucion;
        this.smart=smart;
    }
}
