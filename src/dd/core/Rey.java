package dd.core;


public class Rey extends Personaje {
    private EstrategiaAtaque estrategiaAtaque;

    public Rey(EstrategiaAtaque estrategiaAtaque, String nombre) {
        super("Rey", 0, 2000, estrategiaAtaque);
        this.estrategiaAtaque = estrategiaAtaque;
    }

    @Override
    public int ataca(Personaje enemigo) {
        int valorAtaque = 0;
        if (estrategiaAtaque != null) {
            valorAtaque = estrategiaAtaque.lanzaAtaque(enemigo);
            valorAtaque = estrategiaAtaque.lanzaAtaque(enemigo);
            valorAtaque = estrategiaAtaque.lanzaAtaque(enemigo);
        }
        if (valorAtaque == 0) {
            return -1;
        } else {
            return valorAtaque;
        }
    }
}