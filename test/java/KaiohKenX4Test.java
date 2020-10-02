import Kaiohken.KaiohKen;
import Kaiohken.KaiohKenX4;
import Luchadores.Goku;
import Luchadores.Luchador;
import Luchadores.Vegeta;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class KaiohKenX4Test {
    @Test
    public void prueba01UnKaiohKenX4SeUtilizaCorrectamente(){
        Goku goku = new Goku();
        Luchador vegeta = new Vegeta();
        KaiohKen kaiohKenX4 =  new KaiohKenX4();
        assertEquals(800,kaiohKenX4.utilizar(goku,vegeta));
    }
    @Test
    public void prueba02UnKaiohKenX4DisminuyeCorrectamenteLaVida(){
        Goku goku = new Goku();
        Luchador vegeta = new Vegeta();
        KaiohKen kaiohKenX4 = new KaiohKenX4();
        kaiohKenX4.utilizar(goku,vegeta);
        assertEquals(4700,goku.getVida());
    }
}

