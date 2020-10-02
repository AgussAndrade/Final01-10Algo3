package Luchadores;

import Ataques.Ataque;
import Ataques.AtaqueDeVegeta;
import Ataques.AtaquesDeGoku;
import Errores.ElAtacanteNoTieneVida;
import Errores.ElEnemigoNoTieneVida;
import Errores.LuchadorNoConoceElAtaque;
import Kaiohken.KaiohKen;
import Kaiohken.SinKaiohKen;

public class Goku implements Luchador {

    private KaiohKen kaiohKen;
    private double vida;
    public Goku(){
        kaiohKen = new SinKaiohKen();
        vida = 5000;
    }
    public void setVida(double vida) {
        this.vida = vida;
    }

    public double getVida() {
        return this.vida;
    }

    public void aplicarkaiohKen(KaiohKen powerUp) {
//        if (tipo == "KAIOH-KEN") {
//            this.kaiohKen = Kaiohken.KaiohKen.KAIOH_KEN; // El Kaioh Ken permite que pueda atacar con más poder
//            this.cantidadKaiohKen = 4; // le va a durar cuatro turnos
//        } else if (tipo == "KAIOH-KEN-X3") {
//            this.kaiohKen = Kaiohken.KaiohKen.KAIOH_KEN_X3; // El triple de poder
//            this.cantidadKaiohKen = 3; // este dura solo tres turnos
//        }
        this.kaiohKen = powerUp;
    }

//    public void atacar(Luchadores.Vegeta enemigo, String ataque) {
//        if (this.vida <= 0) {
//            System.out.println("Luchadores.Vegeta está muerto. No puede atacar.");
//            return;
//        }
//        if (enemigo.getVida() <= 0) {
//            System.out.println("Enemigo está muerto. No se puede seguir atacándolo");
//            return;
//        }
//        if (ataque == "KAME-HAME-HA") {
//            if (this.kaiohKen == Kaiohken.KaiohKen.SIN_KAIOH_KEN) {
//                enemigo.setVida(enemigo.getVida() - 100);
//            } else if (this.kaiohKen == Kaiohken.KaiohKen.KAIOH_KEN) {
//                enemigo.setVida(enemigo.getVida() - 100 - this.vida * 0.05); // Con Kaiohken.KaiohKen ataco un 5% de mi vida más
//                this.cantidadKaiohKen--;
//                if (this.cantidadKaiohKen == 0) this.kaiohKen = Kaiohken.KaiohKen.SIN_KAIOH_KEN;
//            } else if (this.kaiohKen == Kaiohken.KaiohKen.KAIOH_KEN_X3) {
//                enemigo.setVida(enemigo.getVida() - 100 - this.vida * 0.15); // Con Kaiohken.KaiohKenX3 ataco un 5% de mi vida más
//                this.cantidadKaiohKen--;
//                if (this.cantidadKaiohKen == 0) this.kaiohKen = Kaiohken.KaiohKen.SIN_KAIOH_KEN;
//            }
//        } else if (ataque == "BOLA-DE-ENERGIA") {
//            enemigo.setVida(enemigo.getVida() - 50); // Ataques.Ataque bien bàsico que quita siempre 50 independientemente de si tengo o no Kaioh-Ken
//        } else {
//            System.out.println("Luchadores.Goku no puede atacar con " + ataque);
//        }
//    }

    @Override
    public void atacar(Luchador luchador, Ataque ataque) throws ElAtacanteNoTieneVida, ElEnemigoNoTieneVida, LuchadorNoConoceElAtaque {
        ataque.atacar(this,luchador);
    }
    @Override
    public void atacar(Luchador luchador, AtaquesDeGoku ataquesDeGoku) throws ElAtacanteNoTieneVida, ElEnemigoNoTieneVida {
        ataquesDeGoku.atacar(this,luchador, kaiohKen);
    }

    @Override
    public void atacar(Luchador luchador, AtaqueDeVegeta ataqueDeVegeta) throws LuchadorNoConoceElAtaque {
        throw new LuchadorNoConoceElAtaque();
    }
}
