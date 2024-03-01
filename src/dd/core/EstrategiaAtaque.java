package dd.core;

public interface EstrategiaAtaque {
    void ataca(Personaje enemigo);

    
}

public class AtaqueNormal implements EstrategiaAtaque {
    @Override
    public void ataca(Personaje enemigo) {
        int salud = enemigo.getSalud();
        int ataque = enemigo.getAtaque();
        enemigo.setSalud(salud - ataque);
    }
}

