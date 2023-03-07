package poo.agallego.zoologico;

abstract public class Felino extends Mamifero {
    protected float tamañoGarras;
    protected int velocidad;

    public Felino(String habitat, Float altura, float largo, float peso, String nombreCientifico, float tamañoGarras, int velocidad) {
        super(habitat, altura, largo, peso, nombreCientifico);
        this.tamañoGarras = tamañoGarras;
        this.velocidad = velocidad;
    }

    public float getTamañoGarras() {
        return tamañoGarras;
    }

    public int getVelocidad() {
        return velocidad;
    }
}
