//package neflis;
//
//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.Test;
//
//import static org.junit.jupiter.api.Assertions.assertTrue;
//import static org.mockito.ArgumentMatchers.any;
//import static org.mockito.ArgumentMatchers.eq;
//import static org.mockito.Mockito.mock;
//import static org.mockito.Mockito.verify;
//import static org.mockito.Mockito.when;
//
//public class SerieTest {
//    private Usuario user = new Usuario();
//    private Serie blackMirror = new Serie();
//    private Temporada t1 = mock(Temporada.class);
//    private Temporada t2 = mock(Temporada.class);
//
//    @BeforeEach
//    public void setUp() {
//        blackMirror.agregarTemporada(t1);
//        blackMirror.agregarTemporada(t2);
//    }
//
//    @Test
//    private void serieFueVistaCompletaPorUsuario() {
//        when(t1.fueVistoCompletoPor(eq(user))).thenReturn(true);
//        when(t2.fueVistoCompletoPor(any(Usuario.class))).thenReturn(true);
//
//        //verify(t1.fueVistoCompletoPor(any(Usuario.class)));
//        //when(t1.fueVistoCompletoPor(any(Usuario.class))).thenThrow(NullPointerException.class);
//
//        assertTrue(blackMirror.fueVistoCompletoPor(user));
//    }
//}
