package main.sueldoPepeSuper.herencia;

import main.sueldoPepeSuper.bonos.BonoPresentismo;
import main.sueldoPepeSuper.bonos.BonoResultados;

public abstract class Empleado {
    protected Integer faltas;
    protected BonoPresentismo bonoPresentismo;
    protected BonoResultados bonoResultados;

    public Empleado(Integer faltas, BonoPresentismo bp, BonoResultados br){
        this.faltas = faltas;
        this.bonoPresentismo = bp;
        this.bonoResultados = br;
    }

    public Double sueldo() {
        return this.neto() + this.bonoPresentismo.monto(this.faltas)
                + this.bonoResultados.monto(this.neto());
    }

    protected abstract Integer neto();

}
