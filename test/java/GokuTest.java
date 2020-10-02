import Ataques.BolaDeEnergia;
import Ataques.KameHameHa;
import Errores.ElAtacanteNoTieneVida;
import Errores.ElEnemigoNoTieneVida;
import Kaiohken.KaiohKenSimple;
import Kaiohken.KaiohKenX3;
import Kaiohken.KaiohKenX4;
import Luchadores.Goku;
import Luchadores.Luchador;
import Errores.LuchadorNoConoceElAtaque;
import Luchadores.Vegeta;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GokuTest {
    @Test
    public void prueba01GokuComienzaConVida5000(){
        Goku goku = new Goku();
        assertEquals(5000, goku.getVida());
    }
    @Test
    public void prueba02GokuAtacaConBolaDeEnergiaCorrectamente() throws ElAtacanteNoTieneVida, LuchadorNoConoceElAtaque, ElEnemigoNoTieneVida {
        Goku goku = new Goku();
        Luchador vegeta = new Vegeta();
        goku.atacar(vegeta,new BolaDeEnergia());
        assertEquals(5950,vegeta.getVida());
    }
    @Test
    public void prueba03GokuAtacaConKameHameHaCorrectamente() throws ElAtacanteNoTieneVida, LuchadorNoConoceElAtaque, ElEnemigoNoTieneVida {
        Goku goku = new Goku();
        Luchador vegeta = new Vegeta();
        goku.atacar(vegeta,new KameHameHa());
        assertEquals(5900,vegeta.getVida());
    }
    @Test
    public void prueba04GokuAtacaConKameHameHaYKaiohKenSimpleCorrectamente() throws ElAtacanteNoTieneVida, LuchadorNoConoceElAtaque, ElEnemigoNoTieneVida {
        Goku goku = new Goku();
        Luchador vegeta = new Vegeta();
        goku.aplicarkaiohKen(new KaiohKenSimple());
        goku.atacar(vegeta,new KameHameHa());
        assertEquals(5650,vegeta.getVida());
    }
    @Test
    public void prueba05GokuAtacaConKameHameHaYKaiohKenX3Correctamente() throws ElAtacanteNoTieneVida, LuchadorNoConoceElAtaque, ElEnemigoNoTieneVida {
        Goku goku = new Goku();
        Luchador vegeta = new Vegeta();
        goku.aplicarkaiohKen(new KaiohKenX3());
        goku.atacar(vegeta,new KameHameHa());
        assertEquals(5150,vegeta.getVida());
    }
    @Test
    public void prueba06GokuAtacaConKameHameHaYKaiohKenX4Correctamente() throws ElAtacanteNoTieneVida, LuchadorNoConoceElAtaque, ElEnemigoNoTieneVida {
        Goku goku = new Goku();
        Luchador vegeta = new Vegeta();
        goku.aplicarkaiohKen(new KaiohKenX4());
        goku.atacar(vegeta,new KameHameHa());
        assertEquals(5100,vegeta.getVida());
    }
    @Test
    public void prueba07GokuAtacaConKameHameHaYKaiohKenX4YSuVidaDisminuye() throws ElAtacanteNoTieneVida, LuchadorNoConoceElAtaque, ElEnemigoNoTieneVida {
        Goku goku = new Goku();
        Luchador vegeta = new Vegeta();
        goku.aplicarkaiohKen(new KaiohKenX4());
        goku.atacar(vegeta,new KameHameHa());
        assertEquals(4700,goku.getVida());
    }
}
