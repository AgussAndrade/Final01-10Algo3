package Ataques;

import Errores.ElAtacanteNoTieneVida;
import Errores.ElEnemigoNoTieneVida;
import Luchadores.Luchador;
import Luchadores.Vegeta;

public interface AtaqueDeVegeta extends Ataque {
    public void atacar(Vegeta vegeta, Luchador luchadorQueRecibe) throws ElAtacanteNoTieneVida, ElEnemigoNoTieneVida;
}
