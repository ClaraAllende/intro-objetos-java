package microsEmpresarios;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MicroTest {
    private Micro micro;
    private Apurado apurado;
    private Claustrofobico claustrofobico;

    @BeforeEach
    public void setUp() {
        micro = new Micro(20,10,100);
        apurado = new Apurado();
        claustrofobico = new Claustrofobico();
    }

    @Test
    public void apuradoSePuedeSubirSiempre() {
        assertTrue(micro.sePuedeSubir(apurado));
    }

    @Test
    public void cuandoElVolumenDelMicroEsMenorAlLimiteElClaustrofobicoNoPuedeSubir() {
        assertFalse(micro.sePuedeSubir(claustrofobico));
    }

    @Test
    public void cuandoAlgunoNoPuedeSubirSeLanzaExcepcion() {
        assertThrows(NoSePudoSubirPasajeroException.class, () ->
                micro.subiSiPodesA(claustrofobico));
    }
}