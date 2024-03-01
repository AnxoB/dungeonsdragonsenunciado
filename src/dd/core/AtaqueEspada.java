package dd.core;

import dd.core.EstrategiaAtaque;
import dd.core.Personaje;
import java.util.Random;

public class AtaqueEspada implements EstrategiaAtaque {
    private static final int ATAQUE = 100;
    private Random random = new Random();

    @Override
    public String lanzaAtaque(Personaje enemigo) {
        int acierta = random.nextInt(2);
        double factor = random.nextDouble();
        int ataque = (int) (acierta * factor * ATAQUE);

        if (acierta == 0) {
            return "Ataque con espada falla";
        } else {
            int salud = enemigo.getSalud();
            enemigo.setSalud(salud - ataque);
            return "Ataque con espada: " + ataque;
        }
    }
}
