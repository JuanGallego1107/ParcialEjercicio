package poo.agallego.zoologico;

public class ZooMain {
    public static void main(String[] args) {
        Mamifero tigre = new Tigre("Selva",2f,3,80,"tigrus",3,36,"Bengala");
        Mamifero Leon = new Leon("desierto",1f,3,80,"leonis",3,45,5,32);
        Mamifero guepardo = new Guepardo("Desierto arido",1.5f,1,56,"Gieparduss",1,80);
        Mamifero lobo = new Lobo("Selva",2f,2,16,"Lobus caninu","negro",1,11,"siberiano");
        Mamifero perro = new Perro("desierto",1f,2,34,"perrus caninos","blanco",2,32);

        imprimirInfo(tigre);
        imprimirInfo(Leon);
        imprimirInfo(guepardo);
        imprimirInfo(lobo);
        imprimirInfo(perro);
    }
    public static void imprimirInfo(Mamifero mamifero){
        System.out.println("Habitat"+mamifero.getHabitat()+" Altura: "+mamifero.getAltura()+" mt"+" Largo: "+mamifero.getLargo()+" Peso "+mamifero.getPeso()+" Nombre Cientifico: "+mamifero.getNombreCientifico());
        if(mamifero instanceof Canino){
            System.out.println("Tamaño colmillos: "+((Canino)mamifero).getTamañoColmillos());
            System.out.println("Color"+((Canino)mamifero).getColor());
            if(mamifero instanceof Lobo){
                System.out.println("Numero Manada"+((Lobo)mamifero).getNumManada());
                System.out.println("Especie lobo"+((Lobo)mamifero).getEspecieLobo());
                System.out.println(((Lobo)mamifero).comer());
                System.out.println(((Lobo)mamifero).dormir());
                System.out.println(((Lobo)mamifero).correr());
                System.out.println(((Lobo)mamifero).comunicarse());
            }else if(mamifero instanceof Perro){
                System.out.println("Fuerza mordida: "+((Perro)mamifero).getFuerzaMoridida());
                System.out.println(((Perro)mamifero).comer());
                System.out.println(((Perro)mamifero).dormir());
                System.out.println(((Perro)mamifero).correr());
                System.out.println(((Perro)mamifero).comunicarse());
            }
        }
        if(mamifero instanceof Felino){
            System.out.println("Tamaño Garras: "+((Felino)mamifero).getTamañoGarras());
            System.out.println("Velocidad: "+((Felino)mamifero).getVelocidad());
            if(mamifero instanceof Tigre){
                System.out.println("Especie de tigre: "+((Tigre)mamifero).getEspecieTigre());
                System.out.println(((Tigre)mamifero).comer());
                System.out.println(((Tigre)mamifero).dormir());
                System.out.println(((Tigre)mamifero).correr());
                System.out.println(((Tigre)mamifero).comunicarse());
            } if(mamifero instanceof Leon){
                System.out.println("Numero de manada "+((Leon)mamifero).getNumManada());
                System.out.println("Potencia de rugido "+((Leon)mamifero).getPotenciaRugido());
                System.out.println(((Leon)mamifero).comer());
                System.out.println(((Leon)mamifero).dormir());
                System.out.println(((Leon)mamifero).correr());
                System.out.println(((Leon)mamifero).comunicarse());
            }else if(mamifero instanceof Guepardo){
                System.out.println(((Guepardo)mamifero).comer());
                System.out.println(((Guepardo)mamifero).dormir());
                System.out.println(((Guepardo)mamifero).correr());
                System.out.println(((Guepardo)mamifero).comunicarse());
            }
        }
        System.out.println("========================================");
    }
}
