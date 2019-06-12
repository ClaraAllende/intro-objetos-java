package main.pepitaReloaded.state;

import main.pepitaReloaded.Golondrina;

public class Debil implements Estado {
    public void deseoCumplido(Golondrina golondrina) {
        golondrina.comer(500);
    }
}
