package main;

public class Jirafa implements Corredor {
    private Integer peso;


    public Integer getPeso() {
        return peso;
    }

    public void setPeso(Integer unosKilos) {
        peso = unosKilos;
    }

    public void correr(Integer unosKms) {
      peso = peso - (unosKms /2);
    }
}
