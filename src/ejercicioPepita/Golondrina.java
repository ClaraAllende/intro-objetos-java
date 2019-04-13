package ejercicioPepita;

public class Golondrina {

    private Integer energia = 0;
    private Lugar ubicacion;

    public void comer(Integer gramos){
        energia = energia + gramos * 4;
    }
    public void volar(Integer kilometros){
        energia = energia - kilometros - 10;
    }
    public void setUbicacion(Lugar unaUbicacion){
        ubicacion = unaUbicacion;
    }
    public Lugar getUbicacion() {
        return ubicacion;
    }
    public void andaA(Lugar destino){
        // Esto quedó pendiente de resolver, pero ya definimos qué es lo que debería pasar:
        // pepita.setUbicacion(destino);
        // pepita.volar(ubicacion.distanciaHasta(destino));
    }
}
