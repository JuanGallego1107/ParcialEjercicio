package poo.agallego.zoologico;

abstract public class Canino extends Mamifero {
    protected String color;
    protected float tamañoColmillos;

    public Canino(String habitat, Float altura, float largo, float peso, String nombreCientifico, String color, float tamañoColmillos) {
        super(habitat, altura, largo, peso, nombreCientifico);
        this.color = color;
        this.tamañoColmillos = tamañoColmillos;
    }

    public String getColor() {
        return color;
    }

    public float getTamañoColmillos() {
        return tamañoColmillos;
    }
}
