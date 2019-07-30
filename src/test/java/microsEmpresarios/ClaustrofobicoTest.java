package microsEmpresarios;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ClaustrofobicoTest {
    private static final Integer VOLUMEN_GRANDE = 150;
    private static final Integer VOLUMEN_LIMITE = 120;
    private static final Integer VOLUMEN_CHICO = 90;

    private Claustrofobico claustrofobico;
    private Micro micro;

    @BeforeEach
    void setUp() {
        claustrofobico = new Claustrofobico();
    }

    @Test
    void cuandoElVolumenEsChicoNoAceptaSubir() {
        micro = new Micro(5, 0, VOLUMEN_CHICO);
        assertFalse(claustrofobico.aceptaSubir(micro));
    }

    @Test
    void cuandoElVolumenEsGrandeAceptaSubir() {
        micro = new Micro(5, 0, VOLUMEN_GRANDE);
        assertTrue(claustrofobico.aceptaSubir(micro));
    }

    //Caso de borde
    @Test
    void cuandoElVolumenEsLimiteNoAceptaSubir() {
        micro = new Micro(5, 0, VOLUMEN_LIMITE);
        assertFalse(claustrofobico.aceptaSubir(micro));
    }
}