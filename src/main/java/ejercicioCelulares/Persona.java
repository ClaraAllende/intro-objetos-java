package ejercicioCelulares;

public class Persona {
    private Celular celular;
    private ServicioTelefonia servicioTelefonia;
    private Double gasto=0.0; //Lo seteamos por default en 0

    public Celular getCelular() {
        return celular;
    }

    public void setCelular(Celular celular) {
        this.celular = celular;
    }

    public ServicioTelefonia getServicioTelefonia() {
        return servicioTelefonia;
    }

    public void setServicioTelefonia(ServicioTelefonia servicioTelefonia) {
        this.servicioTelefonia = servicioTelefonia;
    }

    public Double getGasto() {
        return gasto;
    }

    public void llamarA(Persona destinatario, Double minutosDuracion) {
        this.getCelular().consumirBateria(minutosDuracion);
        destinatario.getCelular().consumirBateria(minutosDuracion);
        gasto = gasto + servicioTelefonia.precioLlamada(minutosDuracion);
    }

    public Boolean celularApagado() {
        return this.getCelular().estaApagado();
    }
}
