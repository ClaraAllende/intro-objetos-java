package main.ejercicioCelulares;

public interface Celular {

    Double getBateria();

    Boolean estaApagado();

    void recargarBateria();

    void consumirBateria(Double minutosDuracion);
}
