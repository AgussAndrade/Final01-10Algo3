package Luchadores;

import Ataques.Ataque;
import Ataques.AtaqueDeVegeta;
import Ataques.AtaquesDeGoku;
import Errores.ElAtacanteNoTieneVida;
import Errores.ElEnemigoNoTieneVida;
import Errores.LuchadorNoConoceElAtaque;

public class Vegeta implements Luchador {

    private double vida = 6000;
    @Override
    public void atacar(Luchador luchador, Ataque ataque) throws ElAtacanteNoTieneVida, ElEnemigoNoTieneVida, LuchadorNoConoceElAtaque {
        ataque.atacar(this,luchador);
    }
    @Override
    public void atacar(Luchador luchador, AtaquesDeGoku ataquesDeGoku) throws LuchadorNoConoceElAtaque {
        throw new LuchadorNoConoceElAtaque(); //Decidi hacerlo porque Luchador recibe ataques en general
        //si este metodo no tendria nada que ver con luchador como kaiokhen ahi si no lo pondria
    }
    @Override
    public void atacar(Luchador luchador, AtaqueDeVegeta ataque) throws ElAtacanteNoTieneVida, ElEnemigoNoTieneVida {
        ataque.atacar(this,luchador);
    }

    public void setVida(double vida) {
        this.vida = vida;
    }

    public double getVida() {
        return this.vida;
    }

//    public void atacar(Luchadores.Goku enemigo, String ataque) {
//        if (this.vida <= 0) {
//            System.out.println("Luchadores.Vegeta está muerto. No puede atacar.");
//            return;
//        }
//        if (enemigo.getVida() <= 0) {
//            System.out.println("Enemigo está muerto. No se puede seguir atacándolo");
//            return;
//        }
//        if (ataque == "GALICK-HO") {
//            enemigo.setVida(enemigo.getVida() - (100  + this.vida * 0.1));
//        } else if (ataque.equals("BOLA-DE-ENERGIA")) {
//            enemigo.setVida(enemigo.getVida() - 50); // Ataques.Ataque bien bàsico que quita siempre 50
//        } else {
//            System.out.println("Luchadores.Vegeta no puede atacar con " + ataque);
//        }
//    }
}
