import Ataques.BolaDeEnergia;
import Ataques.GalickHo;
import Errores.ElAtacanteNoTieneVida;
import Errores.ElEnemigoNoTieneVida;
import Errores.LuchadorNoConoceElAtaque;
import Luchadores.Goku;
import Luchadores.Vegeta;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GalickHoTest {
    @Test
    public void prueba01UnGalickHoAtacaCorrectamente() throws ElAtacanteNoTieneVida, LuchadorNoConoceElAtaque, ElEnemigoNoTieneVida {

        GalickHo galickHo = new GalickHo();
        Goku goku = new Goku();
        Vegeta vegeta = new Vegeta();
        galickHo.atacar(vegeta,goku);
        assertEquals(4300,goku.getVida());
    }
}
