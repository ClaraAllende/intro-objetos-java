package main.ejercicioPepita;

public class Lugar {

    private String nombre;
    private Integer kilometroEnRuta;

    public void setNombre(String nombreDelLugar){
        nombre = nombreDelLugar;
    }
    public String getNombre() {
        return nombre;
    }
    public Integer distanciaHasta(Lugar otroLugar){
        return getKilometroEnRuta() - otroLugar.getKilometroEnRuta();
    }
    public Integer getKilometroEnRuta() {
        return kilometroEnRuta;
    }
    public void setKilometroEnRuta(Integer kilometroEnRuta) {
        this.kilometroEnRuta = kilometroEnRuta;
    }
    //@GmanLeiva TWITTER
}
