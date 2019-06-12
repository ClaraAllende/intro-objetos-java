package main.microsEmpresarios;

public class Moderado implements Persona {
    private Integer x;

    public Boolean aceptaSubir(Micro micro) {
        return micro.tenesXLugaresLibres(x);
    }
}
