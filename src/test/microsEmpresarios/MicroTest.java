package test.microsEmpresarios;

import main.microsEmpresarios.Apurado;
import main.microsEmpresarios.Claustrofobico;
import main.microsEmpresarios.Micro;
import main.microsEmpresarios.NoSePudoSubirPasajeroException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MicroTest {
    private Micro micro;
    private Apurado apurado;
    private Claustrofobico claustrofobico;

    @BeforeEach
    void setUp() {
        micro = new Micro(20,10,100);
        apurado = new Apurado();
        claustrofobico = new Claustrofobico();
    }

    @Test
    void apuradoSePuedeSubirSiempre() {
        assertTrue(micro.sePuedeSubir(apurado));
    }

    @Test
    void cuandoElVolumenDelMicroEsMenorAlLimiteElClaustrofobicoNoPuedeSubir() {
        assertFalse(micro.sePuedeSubir(claustrofobico));
    }

    @Test
    void cuandoAlgunoNoPuedeSubirSeLanzaExcepcion() {
        assertThrows(NoSePudoSubirPasajeroException.class, () ->
                micro.subiSiPodesA(claustrofobico));
    }
}