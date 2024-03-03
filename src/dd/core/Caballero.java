package dd.core;


public class Caballero extends Personaje {
    private EstrategiaAtaque estrategiaAtaque;

    public Caballero(EstrategiaAtaque estrategiaAtaque, String nombre) {
        super("Caballero", 0, 1500, estrategiaAtaque);
        this.estrategiaAtaque = estrategiaAtaque;
    }

    @Override
    public int ataca(Personaje enemigo) {
        int valorAtaque = 0;
        if (estrategiaAtaque != null) {
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
