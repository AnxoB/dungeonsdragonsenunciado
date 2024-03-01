package dd.core;

import dd.core.EstrategiaAtaque;

public class AtaqueCuchillo implements EstrategiaAtaque {
    @Override
    public void ataca(Personaje enemigo) {
        int salud = enemigo.getSalud();
        int ataque = /* calcula el ataque del cuchillo */;
        enemigo.setSalud(salud - ataque);
    }
}