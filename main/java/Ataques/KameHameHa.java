package Ataques;

import Errores.ElAtacanteNoTieneVida;
import Errores.ElEnemigoNoTieneVida;
import Kaiohken.KaiohKen;
import Luchadores.Goku;
import Luchadores.Luchador;
import Errores.LuchadorNoConoceElAtaque;

public class KameHameHa implements AtaquesDeGoku {
    private double PODER = 100;
    @Override
    public void atacar(Goku luchadorQueAtaca, Luchador luchadorQueRecibe, KaiohKen kaiohKen) throws ElEnemigoNoTieneVida, ElAtacanteNoTieneVida {
        if(luchadorQueAtaca.getVida() <= 0){
            throw new ElAtacanteNoTieneVida();
        }
        if(luchadorQueRecibe.getVida() <= 0){
            throw new ElEnemigoNoTieneVida();
        }
        double vidaASetear = luchadorQueRecibe.getVida() - PODER - kaiohKen.utilizar(luchadorQueAtaca,luchadorQueRecibe);
        luchadorQueRecibe.setVida(vidaASetear);
    }

    @Override
    public void atacar(Luchador luchadorQueAtaca, Luchador luchadorQueRecibe) throws ElAtacanteNoTieneVida, ElEnemigoNoTieneVida, LuchadorNoConoceElAtaque {
        luchadorQueAtaca.atacar(luchadorQueRecibe,this);
    }
}
