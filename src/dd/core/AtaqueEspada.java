package dd.core;

import dd.core.EstrategiaAtaque;

public class AtaqueEspada implements EstrategiaAtaque {
    @Override
    public void ataca(Personaje enemigo) {
        int salud = enemigo.getSalud();
        int ataque = /* calcula el ataque de la espada */;
        enemigo.setSalud(salud - ataque);
    }
}
