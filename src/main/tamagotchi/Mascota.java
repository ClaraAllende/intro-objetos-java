package main.tamagotchi;

public class Mascota {
    private Estado estado = new Aburrida(); //"nace" aburrida, porque pintó.
    private Integer nivelDeContentura = 0;
    private Long minutosAburrida = 0L;
    private Integer cantidadDeVecesQueJugo = 0;


    /**
     * Los efectos de jugar dependen de cada estado.
     */
    public void jugar() {
        this.estado.jugar(this);
    }

    /**
     * Los efectos de comer dependen de cada estado.
     */
    public void comer() {
        this.estado.comer(this);
    }

    /**
     * La mascota puede jugar si está contenta o aburrida. Por lo tanto, delega en el estado.
     */
    public Boolean podesJugar() {
        return this.estado.podesJugar();
    }

    public void setEstado(Estado unEstado) {
        this.estado = unEstado;
    }

    public void incrementarNivelDeContentura(Integer nivel) {
        this.nivelDeContentura = this.nivelDeContentura + nivel;
    }

    /**
     * Primero actualizar los minutos que lleva aburrida, después hacer la comparación.
     * Toma la hora del sistema, en milisegundos, y la convierte a minutos para actualizar.
     * @return si lleva más de 80 minutos aburrida
     */
    public Boolean masDe80minAburrida() {
        minutosAburrida = System.currentTimeMillis() / 60000 - minutosAburrida;
        return  minutosAburrida > 80;
    }

    public Boolean jugoMasDe5veces() {
        return cantidadDeVecesQueJugo > 5;
    }
}
