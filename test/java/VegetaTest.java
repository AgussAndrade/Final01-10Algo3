import Ataques.BolaDeEnergia;
import Ataques.GalickHo;
import Errores.ElAtacanteNoTieneVida;
import Errores.ElEnemigoNoTieneVida;
import Errores.LuchadorNoConoceElAtaque;
import Luchadores.Luchador;
import Luchadores.Vegeta;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class VegetaTest {
    @Test
    public void prueba01VegetaComienzaConVida6000(){
        Vegeta vegeta = new Vegeta();
        assertEquals(6000, vegeta.getVida());
    }
    @Test
    public void prueba02VegetaAtacaConBolaDeEnergiaCorrectamente() throws ElAtacanteNoTieneVida, LuchadorNoConoceElAtaque, ElEnemigoNoTieneVida {
        Vegeta vegeta = new Vegeta();
        Luchador luchador = new Vegeta();
        vegeta.atacar(luchador,new BolaDeEnergia());
        assertEquals(5950,luchador.getVida());
    }
    @Test
    public void prueba03VegetaAtacaConGalickHoCorrectamente() throws ElAtacanteNoTieneVida, LuchadorNoConoceElAtaque, ElEnemigoNoTieneVida {
        Vegeta Vegeta = new Vegeta();
        Luchador luchador = new Vegeta();
        Vegeta.atacar(luchador,new GalickHo());
        assertEquals(5300,luchador.getVida());
    }
    // se decidio no hacer prueba sobre errores por una cuestion de tiempo
}
