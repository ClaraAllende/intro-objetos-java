package test.microsEmpresarios;

import main.microsEmpresarios.Apurado;
import main.microsEmpresarios.Claustrofobico;
import main.microsEmpresarios.Micro;
import main.microsEmpresarios.Obsecuente;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ObsecuenteTest {
    private static final Integer VOLUMEN_GRANDE = 150;
    private static final Integer VOLUMEN_CHICO = 90;

    private Apurado jefeApurado;
    private Claustrofobico jefeClaustrofobico;
    private Obsecuente obsecuente;
    private Micro microChico;
    private Micro microGrande;

    @BeforeEach
    void setUp() {
        jefeApurado = new Apurado();
        jefeClaustrofobico = new Claustrofobico();
        obsecuente = new Obsecuente();
        microChico = new Micro(10, 10, VOLUMEN_CHICO);
        microGrande = new Micro(10, 10, VOLUMEN_GRANDE);
    }

    @Test
    void cuandoElJefeEsApuradoAceptaSubirSiempre() {
        obsecuente.setJefe(jefeApurado);
        assertTrue(obsecuente.aceptaSubir(microChico));
        assertTrue(obsecuente.aceptaSubir(microGrande));
    }

    @Test
    void cuandoElJefeEsClaustrofobicoAceptaSubirSiElMicroEsGrande() {
        obsecuente.setJefe(jefeClaustrofobico);
        assertFalse(obsecuente.aceptaSubir(microChico));
        assertTrue(obsecuente.aceptaSubir(microGrande));
    }
}