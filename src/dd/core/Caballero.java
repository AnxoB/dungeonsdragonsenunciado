package dd.core;

import dd.core.EstrategiaAtaque;
import dd.core.Personaje;

public class Caballero extends Personaje {
    private EstrategiaAtaque estrategiaAtaque;

    public Caballero(EstrategiaAtaque estrategiaAtaque, String nombre) {
        super("Caballero", 0, 1500, estrategiaAtaque);
        this.estrategiaAtaque = estrategiaAtaque;
    }

    @Override
    public int ataca(Personaje enemigo) {
        int ataques = 0;
        if (estrategiaAtaque != null) {
            estrategiaAtaque.lanzaAtaque(enemigo);
            ataques++;
            estrategiaAtaque.lanzaAtaque(enemigo);
            ataques++;
        }
        return ataques;
    }
}
