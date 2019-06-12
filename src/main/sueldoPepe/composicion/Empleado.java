package main.sueldoPepe.composicion;

import main.sueldoPepe.bonos.BonoPresentismo;
import main.sueldoPepe.bonos.BonoResultados;

public class Empleado {
    private Integer faltas;
    private BonoPresentismo bonoPresentismo;
    private BonoResultados bonoResultados;
    private Categoria categoria;

    public Double sueldo() {
        return this.categoria.neto() + this.bonoPresentismo.monto(this.faltas)
                + this.bonoResultados.monto(this.categoria.neto());
    }
}
