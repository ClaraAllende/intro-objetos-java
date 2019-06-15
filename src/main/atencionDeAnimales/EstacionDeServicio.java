package main.atencionDeAnimales;

import java.util.ArrayList;
import java.util.List;

public class EstacionDeServicio {
    private List<Dispositivo> dispositivos = new ArrayList();

    public Boolean podesAtender(Cerdo unCerdo) {
        //la estacion puede atender si alguno de los
        // dispositivos puede atender
        return dispositivos.stream().
        anyMatch(dispositivo -> dispositivo.puedeAtender(unCerdo));
    }

    public void agregarDispositivo(Dispositivo unDispo) {
        dispositivos.add(unDispo);
    }
}
