package trenesYDepositos;

public class VagonPasajeros implements Vagon {
    private Double largo; //En metros
    private Double anchoUtil; //En metros

    // Constructor vacío
    public VagonPasajeros() {

    }

    // Constructor completo
    public VagonPasajeros(Double largo, Double anchoUtil) {
        this.largo = largo;
        this.anchoUtil = anchoUtil;
    }

    public Integer cantidadMaximaPasajeros() {
        // Usamos el operador ternario para calcular la cantidad de pasjeros
        return (anchoUtil <= 2.5)
                ? largo.intValue() * 8
                : largo.intValue() * 10;
                // Cuando aplicamos inValue() a un Double extraemos la parte entera del número decimal
                // Esto nos sirve para efectivamente devolver un Integer que es el tipo que corresponde
                // (NUNCA podríamos tener 3.8 o 9.5 pasajeros)
    }

    public Double pesoMaximo() {
        return cantidadMaximaPasajeros().doubleValue() * 80;
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
    public Double getLargo() {
        return largo;
    }

    public void setLargo(Double largo) {
        this.largo = largo;
    }

    public Double getAnchoUtil() {
        return anchoUtil;
    }

    public void setAnchoUtil(Double anchoUtil) {
        this.anchoUtil = anchoUtil;
    }
}
