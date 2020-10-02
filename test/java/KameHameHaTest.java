import Ataques.BolaDeEnergia;
import Ataques.KameHameHa;
import Errores.ElAtacanteNoTieneVida;
import Errores.ElEnemigoNoTieneVida;
import Errores.LuchadorNoConoceElAtaque;
import Luchadores.Goku;
import Luchadores.Vegeta;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class KameHameHaTest {
    @Test
    public void prueba01UnKamehameHaAtacaCorrectamente() throws ElAtacanteNoTieneVida, LuchadorNoConoceElAtaque, ElEnemigoNoTieneVida {
        KameHameHa kameHameHa = new KameHameHa();
        Goku goku = new Goku();
        Vegeta vegeta = new Vegeta();
        kameHameHa.atacar(goku,vegeta);
        assertEquals(5900,vegeta.getVida());
    }
}
