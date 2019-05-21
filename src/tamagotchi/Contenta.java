package tamagotchi;

public class Contenta implements Estado {

    /**
     * Si la mascota está contenta, al comer
     * se incrementa su nivel de contenta en 1
     * @param mascota
     */
    public void comer(Mascota mascota) {
        mascota.incrementarNivelDeContentura(1);
    }

    /**
     * Si la mascota está contenta, al jugar
     * se incrementa su nivel de contenta en 2.
     * Si jugó más de 5 veces, se pone hambrienta (jugar da hambre).
     * @param mascota
     */
    public void jugar(Mascota mascota) {
        mascota.incrementarNivelDeContentura(2);
        if (mascota.jugoMasDe5veces()) mascota.setEstado(new Hambrienta());
    }

    /**
     * La mascota puede jugar cuando está contenta.
     */
    public Boolean podesJugar() {
        return true;
    }

}




