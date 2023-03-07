package poo.agallego.zoologico;

public class Perro extends Canino {
    private int fuerzaMoridida;

    public Perro(String habitat, Float altura, float largo, float peso, String nombreCientifico, String color, float tamañoColmillos, int fuerzaMoridida) {
        super(habitat, altura, largo, peso, nombreCientifico, color, tamañoColmillos);
        this.fuerzaMoridida = fuerzaMoridida;
    }

    public int getFuerzaMoridida() {
        return fuerzaMoridida;
    }

    @Override
    public String comer() {
        return "El perro es un animal carnivoro y se le facilita comer con la fuerza de su mordida de "+fuerzaMoridida;
    }

    @Override
    public String dormir() {
        return "Los perros duermen en guaridas en su habitat: "+habitat;
    }

    @Override
    public String correr() {
        return "El perro es un animal muy precavido y puede alcanzar grandes velocidades. ";
    }

    @Override
    public String comunicarse() {
        return "Los perros ladran para cualquier situacion. ";
    }
}
