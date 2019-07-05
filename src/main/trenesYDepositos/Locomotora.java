package main.trenesYDepositos;

import main.trenesYDepositos.excepciones.ParametrosIncorrectosException;

public class Locomotora {
    private Double peso; //En kg
    private Double pesoMaximoArrastre; //En kg
    private Double velocidadMaxima; //En km/h

    // Constructor vacío
    public Locomotora() {

    }

    //Constructor completo
    public Locomotora(Double peso,
                      Double pesoMaximoArrastre,
                      Double velocidadMaxima) {
        //EXTRA: Validamos que el peso máximo de arrastre siempre supere al de la propia locomotora
        validarValoresIngresados(peso, pesoMaximoArrastre);
        this.peso = peso;
        this.pesoMaximoArrastre = pesoMaximoArrastre;
        this.velocidadMaxima = velocidadMaxima;
    }

    public Double arrastreUtil() {
        return (pesoMaximoArrastre > peso)
                ? pesoMaximoArrastre - peso
                : 0;
    }

    /************
     *  PUNTO 4
     ************/
    public Boolean esEficiente() {
        return pesoMaximoArrastre >= peso * 5;
    }

    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }

    public Double getPesoMaximoArrastre() {
        return pesoMaximoArrastre;
    }

    public void setPesoMaximoArrastre(Double pesoMaximoArrastre) {
        this.pesoMaximoArrastre = pesoMaximoArrastre;
    }

    public Double getVelocidadMaxima() {
        return velocidadMaxima;
    }

    public void setVelocidadMaxima(Double velocidadMaxima) {
        this.velocidadMaxima = velocidadMaxima;
    }

    private void validarValoresIngresados(Double peso,
                                          Double pesoMaximoArrastre) {
        if (peso > pesoMaximoArrastre) {
            throw new ParametrosIncorrectosException(
                    "El peso de la locomotora supera a su peso de arrastre");
        }
    }
}
