package dd.core;

import dd.core.EstrategiaAtaque;
import dd.core.Personaje;

public class Rey extends Personaje {
    private EstrategiaAtaque estrategiaAtaque;

    public Rey(EstrategiaAtaque estrategiaAtaque, String nombre) {
        super("Rey", 0, 2000);
        this.estrategiaAtaque = estrategiaAtaque;
    }

    @Override
    public void ataca(Personaje enemigo) {
        if (estrategiaAtaque != null) {
            estrategiaAtaque.lanzaAtaque(enemigo);
            estrategiaAtaque.lanzaAtaque(enemigo);
            estrategiaAtaque.lanzaAtaque(enemigo);
        }
    }
}