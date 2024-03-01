package dd.core;

import dd.core.EstrategiaAtaque;
import dd.core.Personaje;

public class AtaqueArco implements EstrategiaAtaque {
    @Override
    public void ataca(Personaje enemigo) {
        int salud = enemigo.getSalud();
        int ataque = 50;
        enemigo.setSalud(salud - ataque);
    }
}