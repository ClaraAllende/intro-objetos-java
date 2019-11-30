package trenesYDepositos;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class VagonPasajerosTest {

    private static final Double LARGO_DEFAULT = 10.0;
    private VagonPasajeros vagonPasajeros;

    @Test
    void cantidadPasajerosMaxima() {
        //Cuando el ancho útil es menor a 2.5 metros:
        vagonPasajeros = new VagonPasajeros(LARGO_DEFAULT, 2.0);
        assertEquals(vagonPasajeros.cantidadMaximaPasajeros(), 80);

        //Cuando el ancho útil es mayor a 2.5 metros:
        vagonPasajeros = new VagonPasajeros(LARGO_DEFAULT, 3.0);
        assertEquals(vagonPasajeros.cantidadMaximaPasajeros(), 100);

        //Cuando el ancho útil es igual a 2.5 metros (caso borde):
        vagonPasajeros = new VagonPasajeros(LARGO_DEFAULT, 2.5);
        assertEquals(vagonPasajeros.cantidadMaximaPasajeros(), 80);
    }
}