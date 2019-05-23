package microsEmpresarios;

import java.util.*;

public class Micro {
    private Integer cantidadSentados = 0;
    private Integer cantidadParados = 0;
    private Integer volumen = 0;
    private List<Persona> pasajeros = new ArrayList<>();

    /**
     * Punto 1: Preguntar al micro si una persona se puede subir.
     * Es decir, si el micro tiene lugar y la persona acepta subir al micro.
     */
   public Boolean sePuedeSubir(Persona persona) {
      return this.tenesLugar() && persona.aceptaSubir(this);
   }

   public Boolean tenesLugar() {
       return this.cantidadPersonasEnElMicro() < this.capacidadTotal();
   }

   //Tiene lugar sentado si la cantidad total de personas en el micro es menor que la cantidad
    // de gente que puedo llevar sentada. Asumimos que siempre subimos primero gente sentada.
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

   //Devuelve la cantidad de elementos (pasajeros) de la colección de pasajeros
    // que están subidos al micro en un momento dado.
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
