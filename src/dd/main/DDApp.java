package dd.main;

import dd.core.*;
import java.util.*;

public class DDApp {
    public static void main(String[] args) {
        List<Personaje> ejercitoAliados = new ArrayList<>();
        List<Personaje> ejercitoTrolls = new ArrayList<>();

        // Crear rey y caballeros
        ejercitoAliados.add(new Rey(new AtaqueEspada(), "Arturo"));
        ejercitoAliados.add(new Caballero(new AtaqueEspada(), "Lancelot"));
        ejercitoAliados.add(new Caballero(new AtaqueArco(), "Percival"));

        // Crear trolls
        Random rand = new Random();
        int numTrolls = rand.nextInt(9) + 2; // Genera un número aleatorio entre 2 y 10
        for (int i = 1; i <= numTrolls; i++) {
            // Escoge un tipo de ataque aleatorio
            EstrategiaAtaque estrategiaAtaque = rand.nextBoolean() ? new AtaqueEspada() : new AtaqueArco();
            ejercitoTrolls.add(new Troll(estrategiaAtaque, "Troll " + i));
        }

        // Aquí puedes hacer lo que quieras con los ejércitos...
        while (!ejercitoAliados.isEmpty() && !ejercitoTrolls.isEmpty()) {
            // Turno de los aliados
            for (Personaje aliado : new ArrayList<>(ejercitoAliados)) {
                Personaje trollAleatorio = ejercitoTrolls.get(rand.nextInt(ejercitoTrolls.size()));
                aliado.ataca(trollAleatorio);
                if (trollAleatorio.getSalud() <= 0) {
                    ejercitoTrolls.remove(trollAleatorio);
                }
            }
        
            // Turno de los trolls
            for (Personaje troll : new ArrayList<>(ejercitoTrolls)) {
                Personaje aliadoAleatorio = ejercitoAliados.get(rand.nextInt(ejercitoAliados.size()));
                troll.ataca(aliadoAleatorio);
                if (aliadoAleatorio.getSalud() <= 0) {
                    ejercitoAliados.remove(aliadoAleatorio);
                }
            }
        }
        
        // Imprimir el resultado de la batalla
        if (ejercitoAliados.isEmpty()) {
            System.out.println("Los trolls han ganado la batalla.");
        } else {
            System.out.println("Los aliados han ganado la batalla.");
        }
    }
}