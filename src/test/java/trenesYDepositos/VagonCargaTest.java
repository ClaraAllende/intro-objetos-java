package trenesYDepositos;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class VagonCargaTest {

    private VagonCarga vagonCarga;

    @Test
    void cantidadPasajerosMaxima() {
        //La cantidad de pasajeros SIEMPRE es 0:
        vagonCarga = new VagonCarga();
        assertEquals(vagonCarga.cantidadMaximaPasajeros(), 0);
    }
}