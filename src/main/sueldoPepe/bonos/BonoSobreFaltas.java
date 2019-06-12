package main.sueldoPepe.bonos;

public class BonoSobreFaltas implements BonoPresentismo {
    public Integer monto(Integer faltas) {
        return faltas == 0 ? 100  //si no falto nunca
                : faltas == 1 ? 50  //si falto una vez
                : 0; //en cualquier otro caso.
    }
}
