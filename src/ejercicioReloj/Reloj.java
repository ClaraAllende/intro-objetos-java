package ejercicioReloj;

public class Reloj {
    private Integer hora;
    private Integer minutos;
    private Integer segundos;

    public Integer getHora() {
        return hora;
    }

    public void setHora(Integer hora) {
        this.hora = hora;
    }

    public Integer getMinutos() {
        return minutos;
    }

    public void setMinutos(Integer minutos) {
        this.minutos = minutos;
    }

    public Integer getSegundos() {
        return segundos;
    }

    public void setSegundos(Integer segundos) {
        this.segundos = segundos;
    }

    public String horarioActual() {
        return hora.toString()+":"+minutos.toString()+":"+segundos.toString();
    }
}
