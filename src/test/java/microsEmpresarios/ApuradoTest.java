package microsEmpresarios;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

class ApuradoTest {

    @Test
    public void aceptaSubirSiempre() {
        Micro micro = new Micro(20,10,120);
        Apurado apurado = new Apurado();
        assertTrue(apurado.aceptaSubir(micro));
    }
}