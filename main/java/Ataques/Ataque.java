package Ataques;

import Errores.ElAtacanteNoTieneVida;
import Errores.ElEnemigoNoTieneVida;
import Luchadores.Luchador;
import Errores.LuchadorNoConoceElAtaque;

public interface Ataque {
    public void atacar(Luchador luchadorQueAtaca, Luchador luchadorQueRecibe) throws ElAtacanteNoTieneVida, ElEnemigoNoTieneVida, LuchadorNoConoceElAtaque;
}
