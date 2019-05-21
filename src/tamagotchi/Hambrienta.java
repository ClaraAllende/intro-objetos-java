package tamagotchi;

public class Hambrienta implements Estado {
    /**
     * Cuando la mascota está hambrienta, al jugar no pasa nada.
     * @param mascota
     */
    public void jugar(Mascota mascota) {
        //NO HACE NADA - Pero se define para que los estados sean polimórficos.
    }

    /**
     * Cuando la mascota está hambrienta y come, se pone Contenta.
     * @param mascota
     */
    public void comer(Mascota mascota) {
        mascota.setEstado(new Contenta());
    }

    /**
     * La mascota no puede jugar si está hambrienta.
     */
    public Boolean podesJugar() {
        return false;
    }
}
