package test.atencionDeAnimales;

import main.atencionDeAnimales.Cerdo;
import main.atencionDeAnimales.EstacionDeServicio;
import main.atencionDeAnimales.Vacunatorio;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class EstacionDeServicioTest {

    @Test
    public void elCerdoSePuedeAtenderTest() {
        EstacionDeServicio estacion = new EstacionDeServicio();
        Vacunatorio vacunatorio = new Vacunatorio();
        Cerdo babe = new Cerdo();

        estacion.agregarDispositivo(vacunatorio);

        assertTrue(estacion.podesAtender(babe));
    }

    @Test
    public void elCerdoNoSePuedeAtender() {
        //TODO escribir el test
    }
}
