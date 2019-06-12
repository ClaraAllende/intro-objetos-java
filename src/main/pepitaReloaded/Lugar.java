package main.pepitaReloaded;

public class Lugar {
    private String nombre;
    private Integer kilometroEnRuta9;

    /**
     * Devuelve el módulo de la distancia entre dos ciudades
     */
    public Integer distanciaHasta(Lugar otroLugar) {
        return Math.abs(this.getKilometroEnRuta9() - otroLugar.getKilometroEnRuta9());
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getKilometroEnRuta9() {
        return kilometroEnRuta9;
    }

    public void setKilometroEnRuta9(Integer kilometroEnRuta9) {
        this.kilometroEnRuta9 = kilometroEnRuta9;
    }
}
