package dd.core;

import java.util.List;
import java.util.ArrayList;
import java.util.Random;

public class Batalla {
    private List<Personaje> ejercitoAliados;
    private List<Personaje> ejercitoTrolls;
    private Random rand;
    

    public Batalla(List<Personaje> ejercitoAliados, List<Personaje> ejercitoTrolls) {
        this.ejercitoAliados = ejercitoAliados;
        this.ejercitoTrolls = ejercitoTrolls;
        this.rand = new Random();

        Personaje p1 = new Rey(new AtaqueEspada(), "Arturo");
        Personaje p2 = new Caballero(new AtaqueEspada(), "Lancelot");
        Personaje p3 = new Caballero(new AtaqueArco(), "Percival");

        ejercitoAliados.add(p1);
        ejercitoAliados.add(p2);
        ejercitoAliados.add(p3);

        int numTrolls = rand.nextInt(9) + 2; // Genera un número aleatorio entre 2 y 10

        EstrategiaAtaque[] ataques = {new AtaqueEspada(), new AtaqueArco(), new AtaqueCuchillo()};

        for (int i = 0; i < numTrolls; i++) {
            EstrategiaAtaque ataqueAleatorio = ataques[rand.nextInt(ataques.length)];
            Personaje troll = new Troll(ataqueAleatorio, "Troll " + (i + 1));
            ejercitoTrolls.add(troll);
        }
        
    }
    

    public List<String> luchar() {
        
        List<String> registroDeAtaques = new ArrayList<>();

        while (!ejercitoAliados.isEmpty() && !ejercitoTrolls.isEmpty()) {
            // Turno de los aliados
            for (Personaje aliado : new ArrayList<>(ejercitoAliados)) {
                if (!ejercitoTrolls.isEmpty()) {
                    Personaje trollAleatorio = ejercitoTrolls.get(rand.nextInt(ejercitoTrolls.size()));
                    int ataques = aliado.ataca(trollAleatorio);
                    String registro = aliado.getNombre() + " contra " + trollAleatorio.getNombre();
                    if (ataques == -1) {
                        registro += " - Fallo";
                    } else {
                        registro += " - Daño: " + ataques;
                    }
                    System.out.println(registro); // Imprime el registro del ataque
                    registroDeAtaques.add(registro);
                    if (trollAleatorio.getSalud() <= 0) {
                        ejercitoTrolls.remove(trollAleatorio);
                    }
                }
            }
    
            // Turno de los trolls
            for (Personaje troll : new ArrayList<>(ejercitoTrolls)) {
                if (!ejercitoAliados.isEmpty()) {
                    Personaje aliadoAleatorio = ejercitoAliados.get(rand.nextInt(ejercitoAliados.size()));
                    int ataques = troll.ataca(aliadoAleatorio);
                    String registro = troll.getNombre() + " contra " + aliadoAleatorio.getNombre();
                    if (ataques == -1) {
                        registro += " - Fallo";
                    } else {
                        registro += " - Daño: " + ataques;
                    }
                    System.out.println(registro); // Imprime el registro del ataque
                    registroDeAtaques.add(registro);
                    if (aliadoAleatorio.getSalud() <= 0) {
                        ejercitoAliados.remove(aliadoAleatorio);
                    }
                }
            }
        }
        return registroDeAtaques;    
    }
    
}

