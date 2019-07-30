package sueldoPepeSuper.herencia;

import sueldoPepeSuper.bonos.BonoPresentismo;
import sueldoPepeSuper.bonos.BonoResultados;

public class Gerente extends Empleado {

    public Gerente(Integer faltas, BonoPresentismo bp, BonoResultados br) {
        super(faltas, bp, br);
    }
    protected Integer neto() { return 10000;}
}
