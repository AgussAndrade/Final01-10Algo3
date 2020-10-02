package Ataques;

import Errores.ElAtacanteNoTieneVida;
import Errores.ElEnemigoNoTieneVida;
import Luchadores.Luchador;
import Errores.LuchadorNoConoceElAtaque;
import Luchadores.Vegeta;

public class GalickHo implements AtaqueDeVegeta {
    private double PODER = 100;
    @Override
    public void atacar(Vegeta vegeta, Luchador luchadorQueRecibe) throws ElAtacanteNoTieneVida, ElEnemigoNoTieneVida {
        if(vegeta.getVida() <= 0){
            throw new ElAtacanteNoTieneVida();
        }
        if(luchadorQueRecibe.getVida() <= 0){
            throw new ElEnemigoNoTieneVida();
        }
        double vidaASetear = luchadorQueRecibe.getVida() - PODER - (vegeta.getVida() * 0.1);
        luchadorQueRecibe.setVida(vidaASetear);
    }

    @Override
    public void atacar(Luchador luchadorQueAtaca, Luchador luchadorQueRecibe) throws ElAtacanteNoTieneVida, ElEnemigoNoTieneVida, LuchadorNoConoceElAtaque {
        luchadorQueAtaca.atacar(luchadorQueRecibe,this);
    }
}
