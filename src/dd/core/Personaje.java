package dd.core;


public abstract class Personaje {
    private String nombre;
    private int ataque;
    private int salud;
    private EstrategiaAtaque estrategiaAtaque;

    // Constructor
    public Personaje(String nombre, int ataque, int salud, EstrategiaAtaque estrategiaAtaque) {
        this.nombre = nombre;
        this.ataque = ataque;
        this.salud = salud;
        this.estrategiaAtaque = estrategiaAtaque;
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


    public int ataca(Personaje enemigo) {
        int valorAtaque = this.estrategiaAtaque.lanzaAtaque(enemigo);
        return valorAtaque;
    }
}
