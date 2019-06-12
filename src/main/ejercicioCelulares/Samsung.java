package main.ejercicioCelulares;

public class Samsung implements Celular {
    private Double bateria;

    public Double getBateria(){
        return bateria;
    }

    public Boolean estaApagado() {
        return bateria==0;
    }

    public void recargarBateria() {
        this.bateria = 5.0;
    }

    public void consumirBateria(Double minutosDuracion) {
        // Por ahora solo asumimos que la llamada se puede hacer siempre
        // y asignamos el valor 0 a la batería en el caso de que el consumo supere
        // a la cantidad de batería actual.
        // Pero si se animan pueden agregar más validaciones :)
        Double bateriaConsumida = 0.25;
        if (bateria>bateriaConsumida) {
            // Usamos el operador -= para simplificar la siguiente linea:
            // bateria = bateria - bateriaConsumida;
            bateria -= bateriaConsumida;
        } else {
            bateria = 0.0;
        }
    }
}
