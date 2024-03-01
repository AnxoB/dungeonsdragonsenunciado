package dd.core;

public class Rey extends Personaje {
    public Rey(String nombre, int ataque, int salud) {
        super(nombre, ataque, salud);
    }

    @Override
    public void ataca(Personaje enemigo) {
        if (getAtaque() > 0) {
            enemigo.setSalud(enemigo.getSalud() - getAtaque());
        }
    }
}