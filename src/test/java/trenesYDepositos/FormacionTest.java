package trenesYDepositos;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

class FormacionTest {

    private Formacion formacion;
    private List<Locomotora> locomotoras;
    private List<Vagon> vagones;
    private Locomotora l1;
    private Locomotora l2;
    private Locomotora l3;
    private VagonPasajeros v1;
    private VagonPasajeros v2;
    private VagonCarga v3;

    @BeforeEach
    void setUp() {
        formacion = new Formacion();
        locomotoras = new ArrayList<>();
        vagones = new ArrayList<>();

        l1 = mock(Locomotora.class);
        l2 = mock(Locomotora.class);
        l3 = mock(Locomotora.class);
        v1 = mock(VagonPasajeros.class);
        v2 = mock(VagonPasajeros.class);
        v3 = mock(VagonCarga.class);
        locomotoras.add(l1);
        locomotoras.add(l2);
        locomotoras.add(l3);
        vagones.add(v1);
        vagones.add(v2);
        vagones.add(v3);

        formacion.setLocomotoras(locomotoras);
        formacion.setVagones(vagones);
    }

    @Test
    void cantidadMaximaPasajeros() {
        when(v1.cantidadMaximaPasajeros()).thenReturn(200);
        when(v2.cantidadMaximaPasajeros()).thenReturn(300);
        when(v3.cantidadMaximaPasajeros()).thenReturn(0);
        assertEquals(formacion.cantidadMaximaPasajeros(), 500);
    }

    @Test
    void cantidadVagonesLivianos() {
        //Si hay algún vagón liviano se devuelve la cantidad:
        when(v1.esLiviano()).thenReturn(true);
        when(v2.esLiviano()).thenReturn(false);
        when(v3.esLiviano()).thenReturn(false);
        assertEquals(formacion.cantidadVagonesLivianos(), 1);

        //Si no hay ningún vagón liviano:
        when(v1.esLiviano()).thenReturn(false);
        when(v2.esLiviano()).thenReturn(false);
        when(v3.esLiviano()).thenReturn(false);
        assertEquals(formacion.cantidadVagonesLivianos(), 0);
    }

    @Test
    void velocidadMaxima() {
        when(l1.getVelocidadMaxima()).thenReturn(80.0);
        when(l2.getVelocidadMaxima()).thenReturn(60.0);
        when(l3.getVelocidadMaxima()).thenReturn(100.0);
        assertEquals(formacion.velocidadMaxima(), 60.0);
    }

    @Test
    void esEficiente() {
        // Todas las locomotoras son eficientes:
        when(l1.esEficiente()).thenReturn(true);
        when(l2.esEficiente()).thenReturn(true);
        when(l3.esEficiente()).thenReturn(true);
        assertTrue(formacion.esEficiente());

        // Al menos una locomotora NO es eficiente:
        when(l1.esEficiente()).thenReturn(true);
        when(l2.esEficiente()).thenReturn(false);
        assertFalse(formacion.esEficiente());
    }

    @Test
    void puedeMoverse() {
        // Arrastre util total mayor al peso total de los vagones
        when(v1.pesoMaximo()).thenReturn(1000.0);
        when(v2.pesoMaximo()).thenReturn(1000.0);
        when(v3.pesoMaximo()).thenReturn(900.0);
        when(l1.arrastreUtil()).thenReturn(5000.0);
        when(l2.arrastreUtil()).thenReturn(4000.0);
        when(l3.arrastreUtil()).thenReturn(4000.0);
        assertTrue(formacion.puedeMoverse());

        // Arrastre util total menor al peso total de los vagones
        when(v1.pesoMaximo()).thenReturn(1000.0);
        when(v2.pesoMaximo()).thenReturn(1000.0);
        when(v3.pesoMaximo()).thenReturn(900.0);
        when(l1.arrastreUtil()).thenReturn(500.0);
        when(l2.arrastreUtil()).thenReturn(400.0);
        when(l3.arrastreUtil()).thenReturn(400.0);
        assertFalse(formacion.puedeMoverse());

        // Arrastre util total igual al peso total de los vagones
        when(v1.pesoMaximo()).thenReturn(1000.0);
        when(v2.pesoMaximo()).thenReturn(1000.0);
        when(v3.pesoMaximo()).thenReturn(900.0);
        when(l1.arrastreUtil()).thenReturn(1000.0);
        when(l2.arrastreUtil()).thenReturn(1000.0);
        when(l3.arrastreUtil()).thenReturn(900.0);
        assertTrue(formacion.puedeMoverse());
    }

    @Test
    void empujeFaltanteParaMoverse() {
        // Arrastre util total mayor al peso total de los vagones
        when(v1.pesoMaximo()).thenReturn(1000.0);
        when(v2.pesoMaximo()).thenReturn(1000.0);
        when(v3.pesoMaximo()).thenReturn(900.0);
        when(l1.arrastreUtil()).thenReturn(5000.0);
        when(l2.arrastreUtil()).thenReturn(4000.0);
        when(l3.arrastreUtil()).thenReturn(4000.0);
        assertEquals(formacion.empujeFaltanteParaMoverse(), 0);

        // Arrastre util total menor al peso total de los vagones
        when(v1.pesoMaximo()).thenReturn(1000.0);
        when(v2.pesoMaximo()).thenReturn(1000.0);
        when(v3.pesoMaximo()).thenReturn(900.0);
        when(l1.arrastreUtil()).thenReturn(500.0);
        when(l2.arrastreUtil()).thenReturn(400.0);
        when(l3.arrastreUtil()).thenReturn(400.0);
        assertEquals(formacion.empujeFaltanteParaMoverse(), 2900.0 - 1300.0);
    }

    @Test
    void vagonMasPesado() {
        when(v1.pesoMaximo()).thenReturn(1000.0);
        when(v2.pesoMaximo()).thenReturn(1500.0);
        when(v3.pesoMaximo()).thenReturn(900.0);
        assertEquals(formacion.vagonMasPesado(), v2);
    }

    @Test
    void esCompleja() {
        // Más de 20 unidades:
        for(int i=0; i<20; i++) {
            formacion.agregarLocomotora(mock(Locomotora.class));
        } //Agregamos 20 locomotoras para tener más de 20 unidades
        assertTrue(formacion.esCompleja());

        // Peso total mayor a 10000:
        // (Seteamos la lista de locomotoras como estaba antes
        // para volver a tener 6 unidades en total)
        setUp();
        when(v1.pesoMaximo()).thenReturn(1000.0);
        when(v2.pesoMaximo()).thenReturn(1500.0);
        when(v3.pesoMaximo()).thenReturn(1500.0);
        when(l1.getPeso()).thenReturn(2000.0);
        when(l2.getPeso()).thenReturn(2000.0);
        when(l3.getPeso()).thenReturn(3000.0);
        assertTrue(formacion.esCompleja());

        // Ninguno de los dos anteriores:
        when(v1.pesoMaximo()).thenReturn(500.0);
        when(v2.pesoMaximo()).thenReturn(500.0);
        when(v3.pesoMaximo()).thenReturn(500.0);
        when(l1.getPeso()).thenReturn(1000.0);
        when(l2.getPeso()).thenReturn(2000.0);
        when(l3.getPeso()).thenReturn(1000.0);
        assertFalse(formacion.esCompleja());
    }
}