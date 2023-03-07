package poo.agallego.zoologico;

public class Tigre extends Felino{
    private String especieTigre;

    public Tigre(String habitat, Float altura, float largo, float peso, String nombreCientifico, float tamañoGarras, int velocidad, String especieTigre) {
        super(habitat, altura, largo, peso, nombreCientifico, tamañoGarras, velocidad);
        this.especieTigre = especieTigre;
    }

    public String getEspecieTigre() {
        return especieTigre;
    }

    @Override
    public String comer() {
        return "El tigre"+especieTigre+" caza todo tipo de animal grande en "+habitat;
    }

    @Override
    public String dormir() {
        return "El tigre "+especieTigre+" duerme en cualquier roca en la "+habitat;
    }

    @Override
    public String correr() {
        return "El tigre "+especieTigre+" corre a una velocidad de "+velocidad+" km/h.";
    }

    @Override
    public String comunicarse() {
        return nombreCientifico+" que es su nombre cientifico, ruge para protegerse.";
    }
}
