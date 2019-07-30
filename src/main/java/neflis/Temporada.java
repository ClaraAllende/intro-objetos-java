package neflis;

import java.util.ArrayList;
import java.util.List;

public class Temporada {
    private List<ContenidoUnitario> capitulos = new ArrayList();

    public boolean fueVistoCompletoPor(Usuario user){
        return this.capitulos.stream().allMatch(t -> t.fueVistoCompletoPor(user));
    }

    public void agregarCapitulo(ContenidoUnitario capitulo) {
        capitulos.add(capitulo);
    }
}
