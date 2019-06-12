package main.ejercicioCelulares;

public class Claro implements ServicioTelefonia {

    public Double precioLlamada(Double minutosDuracion) {
        return (0.5*minutosDuracion)*1.21;
    }
}
