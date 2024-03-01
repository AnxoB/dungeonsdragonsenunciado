package dd.core;

import dd.core.EstrategiaAtaque;
import dd.core.Personaje;

public class Troll extends Personaje {
    private EstrategiaAtaque estrategiaAtaque;

    public Troll(EstrategiaAtaque estrategiaAtaque, String nombre) {
        super("Troll", 0, 1000);
        this.estrategiaAtaque = estrategiaAtaque;
    }

    @Override
    public void ataca(Personaje enemigo) {
        if (estrategiaAtaque != null) {
            estrategiaAtaque.lanzaAtaque(enemigo);
        }
    }
}
