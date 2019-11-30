package trenesYDepositos;

public class VagonCarga implements Vagon {
    private Double cargaMaxima; // En kg

    //Constructor vacío
    public VagonCarga() {

    }

    public VagonCarga(Double cargaMaxima) {
        this.cargaMaxima = cargaMaxima;
    }

    //El siguiente método tiene que estar sí o sí en esta clase porge implementa a la interfaz Vagon
    //Retornamos siempre 0 porque sabemos por el enunciado que nunca va atener pasajeros
    public Integer cantidadMaximaPasajeros() {
        return 0;
    }

    public Double pesoMaximo() {
        return cargaMaxima + 160;
    }

    /************
     *  PUNTO 2
     ************/
    public Boolean esLiviano() {
        return pesoMaximo() < 2500;
    }

    /**********************
     *  Getters y setters
     **********************/
    public Double getCargaMaxima() {
        return cargaMaxima;
    }

    public void setCargaMaxima(Double cargaMaxima) {
        this.cargaMaxima = cargaMaxima;
    }

}
