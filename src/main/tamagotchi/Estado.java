package main.tamagotchi;

public interface Estado {
    /**
     * Cada implementación de Estado define que pasa con la mascota al jugar.
     * @param mascota
     */
    void jugar(Mascota mascota);

    /**
     * Cada implementacion de Estado define que pasa con la mascota al comer.
     * @param mascota
     */
    void comer(Mascota mascota);

    /**
     * Cada implementación de estado define cuando la mascota puede jugar.
     */
    Boolean podesJugar();
}
