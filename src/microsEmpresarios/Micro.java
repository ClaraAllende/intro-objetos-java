package microsEmpresarios;

import java.util.*;

public class Micro {
    private Integer cantidadSentados = 0;
    private Integer cantidadParados = 0;
    private Integer volumen = 0;
    private List<Persona> pasajeros = new ArrayList<>();

    public Micro(Integer cantidadSentados, Integer cantidadParados, Integer volumen) {
        this.cantidadSentados = cantidadSentados;
        this.cantidadParados = cantidadParados;
        this.volumen = volumen;
    }

    /**
     * Punto 1: Preguntar al micro si una persona se puede subir.
     * Es decir, si el micro tiene lugar y la persona acepta subir al micro.
     */
    public Boolean sePuedeSubir(Persona persona) {
        return this.tenesLugar() && persona.aceptaSubir(this);
    }

    /**
     * Punto 2:
     * Si la persona se puede subir al micro, se sube (se agrega a la colección de pasajeros). Si no, tira error.
     */
    public void subiSiPodesA(Persona persona) {
        if (!this.sePuedeSubir(persona))
            throw new NoSePudoSubirPasajeroException("El pasajero no se puede subir a este micro");
        pasajeros.add(persona);
    }

    /**
     * Punto 3:
     * Bajar a una persona de un micro. Si no se puede, tira un error.
     */
    public void bajaA(Persona persona) {
        if (pasajeros.isEmpty()) throw new RuntimeException("No hay nadie en el micro para bajar");
        pasajeros.remove(persona);
    }

    /**
     * Punto 4:
     * Preguntarle al micro quien fue el primero en subir, null si está vacío.
     * Como la colección conserva el orden de inserción, podemos simplemente pedir el primero.
     */
    public Persona quienSubioPrimero() {
        try {
            return pasajeros.get(0); //el método get() de ArrayList tira una excepción (IndexOutOfBoundsException) si la colección está vacía...
        } catch (IndexOutOfBoundsException iobe) {
            return null;
        }
    }

    public Boolean tenesLugar() {
        return this.cantidadPersonasEnElMicro() < this.capacidadTotal();
    }

    /**
     * Tiene lugar sentado si la cantidad total de personas en el micro es menor que la cantidad
     * de gente que puedo llevar sentada. Asumimos que siempre subimos primero gente sentada.
     */
    public Boolean tenesLugarSentado() {
        return this.cantidadPersonasEnElMicro() < this.cantidadSentados;
    }

    public Boolean tenesXLugaresLibres(Integer x) {
        return this.lugaresLibres() >= x;
    }

    public Integer lugaresLibres() {
        return this.capacidadTotal() - this.cantidadPersonasEnElMicro();
    }

    public Integer capacidadTotal() {
        return this.cantidadSentados + this.cantidadParados;
    }

    /**
     * Devuelve la cantidad de elementos (pasajeros) de la colección de pasajeros
     * que están subidos al micro en un momento dado.
     */
    public Integer cantidadPersonasEnElMicro() {
        return pasajeros.size();
    }

    public Integer getVolumen() {
        return volumen;
    }

    public void setVolumen(Integer volumen) {
        this.volumen = volumen;
    }
}
