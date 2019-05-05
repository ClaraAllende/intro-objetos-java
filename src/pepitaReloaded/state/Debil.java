package pepitaReloaded.state;

import pepitaReloaded.Golondrina;

public class Debil implements Estado {
    public void deseoCumplido(Golondrina golondrina) {
        golondrina.comer(500);
    }
}
