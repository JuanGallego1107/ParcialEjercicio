package poo.agallego.zoologico;

public class Lobo extends Canino{
    private int numManada;
    private String especieLobo;

    public Lobo(String habitat, Float altura, float largo, float peso, String nombreCientifico, String color, float tamañoColmillos, int numManada, String especieLobo) {
        super(habitat, altura, largo, peso, nombreCientifico, color, tamañoColmillos);
        this.numManada = numManada;
        this.especieLobo = especieLobo;
    }

    public int getNumManada() {
        return numManada;
    }

    public String getEspecieLobo() {
        return especieLobo;
    }

    @Override
    public String comer() {
        return "El lobo "+especieLobo+" sale a cazar con su manada de "+numManada+" lobos.";
    }

    @Override
    public String dormir() {
        return "El lobo sule dormir en las cuevas de "+habitat;
    }

    @Override
    public String correr() {
        return "Si un lobo siente peligro correra hacia la direccion contraria.";
    }

    @Override
    public String comunicarse() {
        return "El lobo aulla en las noches junto a su manada de "+numManada+ " lobos.";
    }
}
