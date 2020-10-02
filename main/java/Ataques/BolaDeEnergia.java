package Ataques;

import Errores.ElAtacanteNoTieneVida;
import Errores.ElEnemigoNoTieneVida;
import Luchadores.Luchador;

public class BolaDeEnergia implements Ataque{
    public double PODER =50;
    @Override
    public void atacar(Luchador luchadorQueAtaca, Luchador luchadorQueRecibe) throws ElAtacanteNoTieneVida, ElEnemigoNoTieneVida {
        if(luchadorQueAtaca.getVida() <= 0){
            throw new ElAtacanteNoTieneVida();
        }
        if(luchadorQueRecibe.getVida() <= 0){
            throw new ElEnemigoNoTieneVida();
        }
        luchadorQueRecibe.setVida(luchadorQueRecibe.getVida() - PODER);
    }
}
