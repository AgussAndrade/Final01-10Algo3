package Kaiohken;

import Luchadores.Goku;
import Luchadores.Luchador;

public class KaiohKenX3 implements KaiohKen {
    private int usos = 3;
    @Override
    public double utilizar(Goku goku, Luchador luchador) {
        usos -=1;
        if(usos == 0){
            goku.aplicarkaiohKen(new SinKaiohKen());
        }
        return goku.getVida() * 0.15;
    }


}
