package dd.core;

public class Troll extends Personaje {
    private EstrategiaAtaque estrategiaAtaque;

    public Troll(EstrategiaAtaque estrategiaAtaque, String nombre) {
        super("Troll", 0, 1000, estrategiaAtaque);
        this.estrategiaAtaque = estrategiaAtaque;
    }

    @Override
    public int ataca(Personaje enemigo) {
        if (estrategiaAtaque != null) {
            estrategiaAtaque.lanzaAtaque(enemigo);
        }
        return 1;
    }
}
