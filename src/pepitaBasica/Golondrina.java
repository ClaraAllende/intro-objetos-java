package pepitaBasica;

public class Golondrina {

    private Integer energia = 1000;
    private Lugar ubicacion;

    private Integer distanciaDesdeUbicacionActual(Lugar unLugar) {
        return this.getUbicacion().distanciaHasta(unLugar);
    }

    public void andaA(Lugar unLugar) {
        this.volar(this.distanciaDesdeUbicacionActual(unLugar));
        this.setUbicacion(unLugar);
    }

    public Boolean podesIrA(Lugar unLugar) {
        return this.distanciaDesdeUbicacionActual(unLugar) <= this.getEnergia() + 10;
    }

    public void volar(Integer kms) {
        energia = energia - kms -10;
    }


    public void comer(Integer grs) {
        energia = energia + grs*4;
    }

    public Integer getEnergia() {
        return energia;
    }

    public void setEnergia(Integer energia) {
        this.energia = energia;
    }

    public Lugar getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(Lugar ubicacion) {
        this.ubicacion = ubicacion;
    }
}