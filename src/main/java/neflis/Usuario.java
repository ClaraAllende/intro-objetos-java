package neflis;

import java.util.ArrayList;
import java.util.List;

public class Usuario {
    private List<Contenido> contenidosVistos = new ArrayList();

    public boolean vioCompleto(Contenido contenido) {
        return contenido.fueVistoCompletoPor(this);
    }

    public boolean vio(Contenido contenido) {
        return contenidosVistos.contains(contenido);
    }

    public void agregarContenidoVisto(Contenido contenido) {
        contenidosVistos.add(contenido);
    }
}
