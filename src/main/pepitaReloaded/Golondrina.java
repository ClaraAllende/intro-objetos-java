package main.pepitaReloaded;

import main.pepitaReloaded.state.*;

public class Golondrina implements Ave {

    private Integer energia = 100;
    private Lugar ubicacion;
    private Estado estado = new Normal();

    public Golondrina(Integer energia, Lugar ubicacion) {
        this.energia = energia;
        this.ubicacion = ubicacion;
    }

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

    public void volaSiPodesA(Lugar unLugar) {
        if (this.podesIrA(unLugar)) andaA(unLugar);
    }

    public void cumpliTuDeseo() {
        this.getEstado().deseoCumplido(this);
    }

    public void volar(Integer kms) {
        energia = energia - kms -10;
        if(this.estaDebil()) this.setEstado(new Debil());
    }


    public void comer(Integer grs) {
        energia = energia + grs*4;
        if(this.estaEuforica()) this.setEstado(new Euforica());
    }

    public Boolean estaDebil() {
        return energia < 50;
    }

    public Boolean estaEuforica() {
        return energia < 500 && this.energiaPar();
    }

    private Boolean energiaPar() {
        return Integer.remainderUnsigned(energia, 2) == 0;
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

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }
}