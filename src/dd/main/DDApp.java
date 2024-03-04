package dd.main;

import dd.core.*;
import java.util.*;

public class DDApp {
    public static void main(String[] args) {
        System.out.println("Arturo, Lancelot y Percival se encuentran unos Trolls. ¡A luchar!");
        List<Personaje> ejercitoAliados = new ArrayList<>();
        List<Personaje> ejercitoTrolls = new ArrayList<>();
        Batalla batalla = new Batalla(ejercitoAliados, ejercitoTrolls);

        List<String> registroDeAtaques = batalla.luchar();

        for (String mensaje : registroDeAtaques) {
            System.out.println(mensaje);
        }
        
        if (ejercitoAliados.isEmpty()) {
            System.out.println("Los trolls han ganado la batalla.");
        } else if (ejercitoTrolls.isEmpty()) {
            System.out.println("Los aliados han ganado la batalla.");
        } else {
            System.out.println("La batalla terminó en empate.");
        }
    }
}