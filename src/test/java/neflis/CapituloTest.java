package neflis;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class CapituloTest {
    private ContenidoUnitario capitulo;
    private Usuario usuario;

    @BeforeEach
    public void setUp() {
        capitulo = new ContenidoUnitario();
        usuario = new Usuario();
    }

    @Test
    public void capituloFueVistoPorUnUsuario() {
        usuario.agregarContenidoVisto(capitulo);

        assertTrue(capitulo.fueVistoCompletoPor(usuario));
    }

    @Test
    public void capituloNoFueVistoPorUnUsuario() {
        assertFalse(capitulo.fueVistoCompletoPor(usuario));
    }
}
