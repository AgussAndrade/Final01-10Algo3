import Ataques.BolaDeEnergia;
import Errores.ElAtacanteNoTieneVida;
import Errores.ElEnemigoNoTieneVida;
import Luchadores.Goku;
import Luchadores.Vegeta;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BolaDeEnergiaTest {
    @Test
    public void prueba01UnaBolaDeEnergiaAtacaCorrectamente() throws ElAtacanteNoTieneVida, ElEnemigoNoTieneVida {
        BolaDeEnergia bolaDeEnergia = new BolaDeEnergia();
        Goku goku = new Goku();
        Vegeta vegeta = new Vegeta();
        bolaDeEnergia.atacar(goku,vegeta);
        assertEquals(5950,vegeta.getVida());
    }
}
