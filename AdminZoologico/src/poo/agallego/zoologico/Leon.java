package poo.agallego.zoologico;

public class Leon extends Felino{
    private int numManada;
    private float potenciaRugido;

    public Leon(String habitat, Float altura, float largo, float peso, String nombreCientifico, float tamañoGarras, int velocidad, int numManada, float potenciaRugido) {
        super(habitat, altura, largo, peso, nombreCientifico, tamañoGarras, velocidad);
        this.numManada = numManada;
        this.potenciaRugido = potenciaRugido;
    }

    public int getNumManada() {
        return numManada;
    }

    public float getPotenciaRugido() {
        return potenciaRugido;
    }

    @Override
    public String comer() {
        return "El leon, sale a cazar en el "+habitat+" con su grupo de "+numManada+" individuos de la misma especie, ademas usas sus garras de "+tamañoGarras+" cm.";
    }

    @Override
    public String dormir() {
        return "El leon o "+nombreCientifico+ " duerme debajo de los arboles.";
    }

    @Override
    public String correr() {
        return "El leon tiene una velocidad de "+velocidad+" km/h apesar de su peso de "+peso+" kg.";
    }

    @Override
    public String comunicarse() {
        return "El leon ruge a "+potenciaRugido+" dB." ;
    }
}
