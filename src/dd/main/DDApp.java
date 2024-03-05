package dd.main;

import dd.core.*;
import java.util.*;

public class DDApp {
    public static void main(String[] args) {
        System.out.println("Arturo, Lancelot y Percival se encuentran unos Trolls. ¡A luchar!");

        // Crear ejércitos
        List<Personaje> ejercitoAliados = new ArrayList<>();
        List<Personaje> ejercitoTrolls = new ArrayList<>();
        // Crear la batalla
        Batalla batalla = new Batalla(ejercitoAliados, ejercitoTrolls);

        // Iniciar la batalla y guardar el registro 
        List<String> registroDeAtaques = batalla.luchar();

        for (String mensaje : registroDeAtaques) {
            System.out.println(mensaje);
            try {
                Thread.sleep(250); // Espera 250 milisegundos
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        
        // Mostrar el resultado de la batalla
        if (ejercitoAliados.isEmpty()) {
            System.out.println("Los trolls han ganado la batalla.");
        } else if (ejercitoTrolls.isEmpty()) {
            System.out.println("Los aliados han ganado la batalla.");
        } else {
            System.out.println("La batalla terminó en empate.");
        }
    }
}