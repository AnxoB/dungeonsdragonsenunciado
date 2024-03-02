package dd.core;


public class Rey extends Personaje {
    private EstrategiaAtaque estrategiaAtaque;

    public Rey(EstrategiaAtaque estrategiaAtaque, String nombre) {
        super("Rey", 0, 2000, estrategiaAtaque);
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
            estrategiaAtaque.lanzaAtaque(enemigo);
            ataques++;
        }
        return ataques;
    }
}