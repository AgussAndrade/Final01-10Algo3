package Luchadores;

import Ataques.Ataque;
import Ataques.AtaqueDeVegeta;
import Ataques.AtaquesDeGoku;
import Errores.ElAtacanteNoTieneVida;
import Errores.ElEnemigoNoTieneVida;
import Errores.LuchadorNoConoceElAtaque;

public interface Luchador {
    public void atacar(Luchador luchador, Ataque ataque) throws ElAtacanteNoTieneVida, ElEnemigoNoTieneVida, LuchadorNoConoceElAtaque;
    public void atacar(Luchador luchador, AtaquesDeGoku ataquesDeGoku) throws LuchadorNoConoceElAtaque, ElAtacanteNoTieneVida, ElEnemigoNoTieneVida;
    public void atacar(Luchador luchador, AtaqueDeVegeta ataqueDeVegeta) throws LuchadorNoConoceElAtaque, ElAtacanteNoTieneVida, ElEnemigoNoTieneVida;

    public void setVida(double vida);
    public double getVida();
}
