package neflis;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;


public class TemporadaTest {
    private Usuario user;
    private Temporada temporada;
    private ContenidoUnitario capitulo;

    @BeforeEach
    public void setUp() {
        user = new Usuario();
        temporada = new Temporada();
        capitulo = new ContenidoUnitario();
        temporada.agregarCapitulo(capitulo);
    }

    @Test
    public void temporadaVistaCompletaPorUsuario() {
        user.agregarContenidoVisto(capitulo);
        assertTrue(temporada.fueVistoCompletoPor(user));
    }

    @Test
    public void temporadaConUnCapituloNoVistoPorElUsuario() {
        assertFalse(temporada.fueVistoCompletoPor(user));
    }

    @Test
    public void temporadaTieneUnCapituloNoVistoPorElUsuario() {
        temporada.agregarCapitulo(new ContenidoUnitario());
        user.agregarContenidoVisto(capitulo);

        assertFalse(temporada.fueVistoCompletoPor(user));
    }
}
