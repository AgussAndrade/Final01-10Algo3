package Kaiohken;

import Luchadores.Goku;
import Luchadores.Luchador;

public class KaiohKenX4 implements KaiohKen {
    private int usos = 2;
    @Override
    public double utilizar(Goku goku, Luchador luchador) {
        usos -=1;
        if(usos == 0){
            goku.aplicarkaiohKen(new SinKaiohKen());
        }
        goku.setVida(goku.getVida() - 300);
        return 800;
    }

}
