package dd.core;

import java.util.ArrayList;
import java.util.List;

public class Caballero extends Personaje {
    private EstrategiaAtaque estrategiaAtaque;

    public Caballero(EstrategiaAtaque estrategiaAtaque, String nombre) {
        super(nombre, 0, 1500, estrategiaAtaque);
        this.estrategiaAtaque = estrategiaAtaque;
    }

    @Override
    public List<String> ataca(Personaje enemigo) {
        List<String> registros = new ArrayList<>();
        if (estrategiaAtaque != null) {
            for (int i = 0; i < 2; i++) {
                int valorAtaque = estrategiaAtaque.lanzaAtaque(enemigo);
                if (valorAtaque > 0) {
                    enemigo.setSalud(enemigo.getSalud() - valorAtaque); // Actualiza la salud del enemigo
                }
                String registro = this.getNombre() + " [" + this.getSalud() + "] contra " + enemigo.getNombre() + " [" + enemigo.getSalud() + "]";
                if (valorAtaque == 0) {
                    registro += " -> El ataque ha fallado";
                } else {
                    registro += " -> Daño: " + valorAtaque;
                }
                registros.add(registro);
            }
        }
        return registros;
    }
}
