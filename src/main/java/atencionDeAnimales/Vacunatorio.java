package atencionDeAnimales;

public class Vacunatorio implements Dispositivo {

    public Boolean puedeAtender(Cerdo unCerdo) {
        return unCerdo.convieneVacunarte();
    }
}
