package trenesYDepositos;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import trenesYDepositos.excepciones.ParametrosIncorrectosException;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.*;

class DepositoTest {

    private Deposito deposito;
    private List<Formacion> formaciones;
    private List<Locomotora> locomotoras;
    private Formacion f1;
    private Formacion f2;
    private Formacion f3;
    private Locomotora l1;
    private Locomotora l2;
    private Locomotora l3;

    @BeforeEach
    void setUp() {
        deposito = new Deposito();
        formaciones = new ArrayList<>();
        locomotoras = new ArrayList<>();
        f1 = mock(Formacion.class);
        f2 = mock(Formacion.class);
        f3 = mock(Formacion.class);
        l1 = mock(Locomotora.class);
        l2 = mock(Locomotora.class);
        l3 = mock(Locomotora.class);

        formaciones.add(f1);
        formaciones.add(f2);
        formaciones.add(f3);
        locomotoras.add(l1);
        locomotoras.add(l2);
        locomotoras.add(l3);
        deposito.setFormaciones(formaciones);
        deposito.setLocomotorasSueltas(locomotoras);
    }

    @Test
    void necesitaConductorExperimentado() {
        // Alguna de sus formaciones es compleja:
        when(f1.esCompleja()).thenReturn(true);
        when(f2.esCompleja()).thenReturn(true);
        when(f3.esCompleja()).thenReturn(false);
        assertTrue(deposito.necesitaConductorExperimentado());

        // Nignuna de sus formaciones es compleja:
        when(f1.esCompleja()).thenReturn(false);
        when(f2.esCompleja()).thenReturn(false);
        when(f3.esCompleja()).thenReturn(false);
        assertFalse(deposito.necesitaConductorExperimentado());
    }

    @Test
    void agregarLocomotora() {
        // Enviamos por parámetro una formación que no está en el depósito:
        Formacion formacionFueraDeDeposito = mock(Formacion.class);
        assertThrows(ParametrosIncorrectosException.class,
                () -> deposito.agregarLocomotora(formacionFueraDeDeposito));

        // Hay locomotora libre para agregar que cumple con las condiciones:
        when(f1.puedeMoverse()).thenReturn(false);
        when(f1.empujeFaltanteParaMoverse()).thenReturn(1000.0);
        when(l1.arrastreUtil()).thenReturn(1500.0);
        deposito.agregarLocomotora(f1); // Llamamos normalmente al método que queremos probar
        verify(f1).agregarLocomotora(eq(l1)); //Checkeamos que se llame al método que queremos que llegue

        // No hay locomotora libre para agregar:
        setUp(); // IMPORTANTE!! Hay que volver a settear
        when(f1.puedeMoverse()).thenReturn(false);
        when(f1.empujeFaltanteParaMoverse()).thenReturn(1500.0);
        when(l1.arrastreUtil()).thenReturn(1000.0);
        when(l2.arrastreUtil()).thenReturn(900.0);
        when(l3.arrastreUtil()).thenReturn(500.0);
        deposito.agregarLocomotora(f1); // Llamamos normalmente al método que queremos probar
        verify(f1, never()).agregarLocomotora(any(Locomotora.class));
        // Con never() indicamos que nunca tiene que llegar a ese método

        // La locomotora puede moverse:
        setUp(); // IMPORTANTE!! Hay que volver a settear
        when(f1.puedeMoverse()).thenReturn(true);
        deposito.agregarLocomotora(f1);
        verify(f1, never()).agregarLocomotora(any(Locomotora.class));
    }
}