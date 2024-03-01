package dd.core;

import dd.core.EstrategiaAtaque;
import dd.core.Personaje;

public class Caballero extends Personaje {
    private EstrategiaAtaque estrategiaAtaque;

    public Caballero(EstrategiaAtaque estrategiaAtaque, String nombre) {
        super("Caballero", 0, 1500);
        this.estrategiaAtaque = estrategiaAtaque;
    }

    @Override
    public void ataca(Personaje enemigo) {
        if (estrategiaAtaque != null) {
            estrategiaAtaque.lanzaAtaque(enemigo);
            estrategiaAtaque.lanzaAtaque(enemigo);
        }
    }
}
