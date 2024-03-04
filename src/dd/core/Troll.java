package dd.core;

public class Troll extends Personaje {
    private EstrategiaAtaque estrategiaAtaque;

    public Troll(EstrategiaAtaque estrategiaAtaque, String nombre) {
        super(nombre, 0, 1000, estrategiaAtaque);
        this.estrategiaAtaque = estrategiaAtaque;
    }

    @Override
    public int ataca(Personaje enemigo) {
        int valorAtaque = 0;
        if (estrategiaAtaque != null) {
            valorAtaque = estrategiaAtaque.lanzaAtaque(enemigo);
        }
        if (valorAtaque == 0) {
            return -1;
        } else {
            return valorAtaque;
        }
    }
}
