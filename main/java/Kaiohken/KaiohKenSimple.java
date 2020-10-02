package Kaiohken;

import Luchadores.Goku;
import Luchadores.Luchador;

public class KaiohKenSimple implements KaiohKen {
    private int usos = 4;
    private double factorDeOrden = 0.05;
    @Override
    public double utilizar(Goku goku, Luchador luchador) {
        usos -=1;
        if(usos == 0){
            goku.aplicarkaiohKen(new SinKaiohKen());
        }
        return (goku.getVida() * factorDeOrden);
    }


}
