package test.microsEmpresarios;

import main.microsEmpresarios.Apurado;
import main.microsEmpresarios.Fiaca;
import main.microsEmpresarios.Micro;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class FiacaTest {

    private static Integer cantMaxSentados = 5;

    private Micro micro;
    private Fiaca fiaca;

    @BeforeEach
    void setUp() {
        micro = new Micro(cantMaxSentados,10,100);
        fiaca = new Fiaca();
    }

    @Test
    void cuandoHayLugarSentadoAceptaSubir() {
        // Subimos al micro personas sin superar
        // la cantidad máxima de sentados
        for (int i = 0; i<cantMaxSentados-1; i++) {
            micro.subiSiPodesA(new Apurado());
        }
        assertTrue(fiaca.aceptaSubir(micro));
    }

    @Test
    void cuandoNoHayLugarSentadoNoAceptaSubir() {
        // Subimos al micro más personas que
        // la cantidad máxima de sentados
        for (int i = 0; i<cantMaxSentados+1; i++) {
            micro.subiSiPodesA(new Apurado());
        }
        assertFalse(fiaca.aceptaSubir(micro));
    }
}