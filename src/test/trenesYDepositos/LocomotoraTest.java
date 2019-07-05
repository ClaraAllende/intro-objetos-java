package test.trenesYDepositos;

import main.trenesYDepositos.Locomotora;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LocomotoraTest {

    private Locomotora locomotora;

    @Test
    void arrastreUtil() {
        // Cuando el peso de la locomotora es menor al maximo arrastre,
        // se devuelve la diferencia del primero con el segundo
        locomotora = new Locomotora(1000.0, 12000.0, 80.0);
        assertEquals(locomotora.arrastreUtil(), 12000-1000);

        // Si el peso es mayor o igual al arrastre, se devuelve 0
        locomotora.setPesoMaximoArrastre(500.0);
        assertEquals(locomotora.arrastreUtil(), 0);
    }

    @Test
    void esEficiente() {
        // Cuando el maximo arrastre supera a 5 veces el peso de la locomotora:
        locomotora = new Locomotora(1000.0, 6000.0, 80.0);
        assertTrue(locomotora.esEficiente());

        // Cuando el maximo arrastre es menor a 5 veces el peso de la locomotora:
        locomotora.setPesoMaximoArrastre(4000.0);
        assertFalse(locomotora.esEficiente());

        // Cuando el maximo arrastre es igual a 5 veces el peso de la locomotora (caso borde):
        locomotora.setPesoMaximoArrastre(5000.0);
        assertTrue(locomotora.esEficiente());
    }
}