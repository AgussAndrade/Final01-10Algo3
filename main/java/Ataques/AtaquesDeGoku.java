package Ataques;

import Errores.ElAtacanteNoTieneVida;
import Errores.ElEnemigoNoTieneVida;
import Kaiohken.KaiohKen;
import Luchadores.Goku;
import Luchadores.Luchador;

public interface AtaquesDeGoku extends Ataque {
    void atacar(Goku luchadorQueAtaca, Luchador luchadorQueRecibe, KaiohKen kaiohKen) throws ElEnemigoNoTieneVida, ElAtacanteNoTieneVida;
}
