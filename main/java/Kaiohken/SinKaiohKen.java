package Kaiohken;

import Luchadores.Goku;
import Luchadores.Luchador;

public class SinKaiohKen implements KaiohKen {
    private int usos = 1;
    @Override
    public double utilizar(Goku goku, Luchador luchador) {
        return 0;
    }


}
