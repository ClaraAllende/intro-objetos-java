package pepitaReloaded;

public class Gorrion implements Ave {
    private Integer energia = 100;

    public void comer(Integer gramos) {
        this.energia = this.energia + (3* gramos) -20;
    }

    public void volar(Integer kms) {
        this.energia = this.energia - 2*kms;
    }

    public void cumpliTuDeseo() {
        this.comer(100);
    }
}
