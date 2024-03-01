package dd.core;

import dd.core.EstrategiaAtaque;
import dd.core.Personaje;

public class AtaqueEspada implements EstrategiaAtaque {
    @Override
    public void ataca(Personaje enemigo) {
        int salud = enemigo.getSalud();
        int ataque = 100;
        enemigo.setSalud(salud - ataque);
    }
}
