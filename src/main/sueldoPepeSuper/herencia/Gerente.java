package main.sueldoPepeSuper.herencia;

import main.sueldoPepeSuper.bonos.BonoPresentismo;
import main.sueldoPepeSuper.bonos.BonoResultados;

public class Gerente extends Empleado {

    public Gerente(Integer faltas, BonoPresentismo bp, BonoResultados br) {
        super(faltas, bp, br);
    }
    protected Integer neto() { return 10000;}
}
