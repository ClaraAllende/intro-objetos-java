package main.ejercicioCelulares;

public class Movistar implements ServicioTelefonia {

    public Double precioLlamada(Double minutosDuracion) {
        return 0.6*minutosDuracion;
    }
}
