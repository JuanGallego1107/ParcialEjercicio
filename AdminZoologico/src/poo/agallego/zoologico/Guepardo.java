package poo.agallego.zoologico;

public class Guepardo extends Felino{
    public Guepardo(String habitat, Float altura, float largo, float peso, String nombreCientifico, float tamañoGarras, int velocidad) {
        super(habitat, altura, largo, peso, nombreCientifico, tamañoGarras, velocidad);
    }

    @Override
    public String comer() {
        return "La comida favorita del guepardo son las Gacelas y gracias a sus garas de "+tamañoGarras+ "cm se le facilita cazarlas.";
    }

    @Override
    public String dormir() {
        return "El gupardo duerme en "+habitat+" especialmente en madrigueras.";
    }

    @Override
    public String correr() {
        return "El guepardo es el animal mas rapido del mundo y corre a "+velocidad+" km/h.";
    }

    @Override
    public String comunicarse() {
        return "El ruido que emite el guepardo son los gañidos";
    }
}
