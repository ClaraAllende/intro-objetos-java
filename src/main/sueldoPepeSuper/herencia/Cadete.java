package main.sueldoPepeSuper.herencia;

import main.sueldoPepeSuper.bonos.BonoPresentismo;
import main.sueldoPepeSuper.bonos.BonoResultados;

public class Cadete extends Empleado {

    public Cadete(Integer faltas, BonoPresentismo bp, BonoResultados br) {
        super(faltas, bp, br);
    }

    private static Double COMPENSACION = 0.2;

    public Double sueldo() {
        return super.sueldo() + this.extra();
    }

    public Double extra() {
        return this.neto() * COMPENSACION;
    }

    protected Integer neto() { return 1500;}
}
