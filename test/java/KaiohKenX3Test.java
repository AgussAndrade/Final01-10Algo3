import Kaiohken.KaiohKenSimple;
import Kaiohken.KaiohKenX3;
import Luchadores.Goku;
import Luchadores.Luchador;
import Luchadores.Vegeta;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class KaiohKenX3Test {
    @Test
    public void prueba01UnKaiohKenX3SeUtilizaCorrectamente(){
        Goku goku = new Goku();
        Luchador vegeta = new Vegeta();
        KaiohKenX3 kaiohKenX3 = new KaiohKenX3();
        assertEquals(750,kaiohKenX3.utilizar(goku,vegeta));
    }
}
