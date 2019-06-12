package main.electrodomesticos;

public abstract class Electrodomestico {
    protected Double precioBase;
    protected String color;
    protected char consumoEnergetico;
    protected Double peso;

    protected static Double PrecioDefault = 100.0;
    protected static String ColorDefault = "blanco";
    protected static char ConsumoDefault = 'F';
    protected static Double PesoDefault = 5.0;

    /**
     * Contructores
     */
    public Electrodomestico(){
        this(PrecioDefault, ColorDefault, ConsumoDefault, PesoDefault);
    }

    public Electrodomestico(double precioBase, double peso){
        this(precioBase, ColorDefault, ConsumoDefault, peso);
    }

    public Electrodomestico(double precioBase, String color, char consumoEnergetico, double peso){
        this.precioBase=precioBase;
        this.peso=peso;
        comprobarConsumoEnergetico(consumoEnergetico);
        comprobarColor(color);
    }

    /**
     * Getters
     */
    public Double getPrecioBase() {
        return precioBase;
    }

    public String getColor() {
        return color;
    }

    public char getConsumoEnergetico() {
        return consumoEnergetico;
    }

    public Double getPeso() {
        return peso;
    }

    /**
     * Otros métodos
     */
    public void comprobarColor(String color){
        //Colores disponibles
        String colores[]={"blanco", "negro", "rojo", "azul", "gris"};
        boolean encontrado=false;

        for(int i=0;i<colores.length && !encontrado;i++){

            if(colores[i].equals(color)){
                encontrado=true;
            }

        }

        if(encontrado){
            this.color = color;
        }else{
            this.color = ColorDefault;
        }
    }

    public void comprobarConsumoEnergetico(char consumoEnergetico){

        if(consumoEnergetico>='A' && consumoEnergetico<='F'){
            this.consumoEnergetico=consumoEnergetico;
        }else{
            this.consumoEnergetico=ConsumoDefault;
        }

    }

    public Double precioFinal(){
        return precioBase + this.plusPorConsumo() + this.plusPorTamanio();
    }

    private Double plusPorConsumo() {
        Double plus=0.0;
        if (this.consumoEnergetico=='A') {
            plus+=100;
        } else if (this.consumoEnergetico=='B') {
            plus+=80;
        } else if (this.consumoEnergetico=='C') {
            plus+=60;
        } else if (this.consumoEnergetico=='D') {
            plus+=50;
        } else if (this.consumoEnergetico=='E') {
            plus+=30;
        } else if (this.consumoEnergetico=='F') {
            plus+=10;
        }
        return plus;
    }

    private Double plusPorTamanio() {
        Double plus=0.0;
        if (peso>=0 && peso<19){
            plus+=10;
        } else if (peso>=20 && peso<49){
            plus+=50;
        } else if (peso>=50 && peso<=79){
            plus+=80;
        } else if (peso>=80){
            plus+=100;
        }
        return plus;
    }
}
