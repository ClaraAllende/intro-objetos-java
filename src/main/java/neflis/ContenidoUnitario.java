package neflis;

public class ContenidoUnitario implements Contenido {
    //pelicula o capitulo, por ahora, no los necesito separados
    public boolean fueVistoCompletoPor(Usuario user) {
        return user.vio(this);
    }

}
