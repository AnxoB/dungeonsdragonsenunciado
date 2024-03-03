package dd.core;

import java.util.Random;

public class AtaqueEspada implements EstrategiaAtaque {
    private static final int ATAQUE = 100;
    private Random random = new Random();

    @Override
    public int lanzaAtaque(Personaje enemigo) {
        // acierta * factor * ATAQUE
        int acierta = random.nextInt(2);
        double factor = random.nextDouble();
        int ataque = (int) (acierta * ATAQUE * factor);

        if (acierta == 0) {
            return 0;
        } else {
            int salud = enemigo.getSalud();
            enemigo.setSalud(salud - ataque);
            return ataque;
        }
    }
}
