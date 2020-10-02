import Kaiohken.KaiohKenSimple;
import Luchadores.Goku;
import Luchadores.Luchador;
import Luchadores.Vegeta;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class KaiohKenSimpleTest {
    @Test
    public void prueba01UnKaiohKenSeUtilizaCorrectamente(){
        Goku goku = new Goku();
        Luchador vegeta = new Vegeta();
        KaiohKenSimple kaiohKenSimple = new KaiohKenSimple();
        assertEquals(250,kaiohKenSimple.utilizar(goku,vegeta));
    }
}
