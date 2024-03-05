package dd.core;

import java.util.ArrayList;
import java.util.List;

public class Troll extends Personaje {
    private EstrategiaAtaque estrategiaAtaque;

    public Troll(EstrategiaAtaque estrategiaAtaque, String nombre) {
        super(nombre, 0, 1000, estrategiaAtaque);
        this.estrategiaAtaque = estrategiaAtaque;
    }

    @Override
    public List<String> ataca(Personaje enemigo) {
        List<String> registros = new ArrayList<>();
        if (estrategiaAtaque != null) {
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
        return registros;
    }
}
