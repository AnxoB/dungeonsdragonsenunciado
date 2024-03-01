package dd.core;

import dd.core.EstrategiaAtaque;

public abstract class Personaje {
    private String nombre;
    private int ataque;
    private int salud;
    private EstrategiaAtaque EstrategiaAtaque;

    // Constructor
    public Personaje(String nombre, int ataque, int salud) {
        this.nombre = nombre;
        this.ataque = ataque;
        this.salud = salud;
        this.EstrategiaAtaque = EstrategiaAtaque;
    }

    // Getters and Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getAtaque() {
        return ataque;
    }

    public void setAtaque(int ataque) {
        this.ataque = ataque;
    }

    public int getSalud() {
        return salud;
    }

    public void setSalud(int salud) {
        this.salud = salud;
    }


    public void ataca(Personaje enemigo) {
        EstrategiaAtaque.ataca(enemigo);
    }

    
    @Override
    public String toString() {
        return "[" + nombre + ": " + salud + "]";
    }

}
