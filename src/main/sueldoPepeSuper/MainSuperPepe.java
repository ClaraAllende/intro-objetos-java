package main.sueldoPepeSuper;

import main.sueldoPepeSuper.bonos.BonoNuloPresentismo;
import main.sueldoPepeSuper.bonos.BonoNuloResultados;
import main.sueldoPepeSuper.herencia.Cadete;

public class MainSuperPepe {

    public static void main(String[] args) {
        BonoNuloResultados bonoRes = new BonoNuloResultados();
        BonoNuloPresentismo bonoPres = new BonoNuloPresentismo();
        Cadete pepe = new Cadete(0, bonoPres, bonoRes);


        pepe.sueldo();

    }
}
