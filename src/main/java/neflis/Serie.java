package neflis;

import java.util.List;

public class Serie implements Contenido {
    private List<Temporada> temporadas;

    public boolean fueVistoCompletoPor(Usuario user){
        return this.temporadas.stream().allMatch(t -> fueVistoCompletoPor(user));
    }

    public void agregarTemporada(Temporada t) {
        temporadas.add(t);
    }
}
