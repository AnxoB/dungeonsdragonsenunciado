package dd.core;

import dd.core.EstrategiaAtaque;

public class AtaqueArco implements EstrategiaAtaque {
    @Override
    public void ataca(Personaje enemigo) {
        int salud = enemigo.getSalud();
        int ataque = /* calcula el ataque del arco */;
        enemigo.setSalud(salud - ataque);
    }
}