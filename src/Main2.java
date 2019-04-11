/**
 * Programa principal - Workspace
 * Clase 07.Objetos - Polimorfismo.
 */
public class Main2 {

    public static void main(String[] args) {

        Elefante dumbo = new Elefante();
        dumbo.setPeso(150);

        Jirafa marty = new Jirafa();
        marty.setPeso(150);

        Doctor who = new Doctor();

        who.hacerRutina(dumbo, 10);

        System.out.println("Peso dumbo:" + dumbo.getPeso());

        who.hacerRutina(marty,10);

        System.out.println("Peso marty:" + marty.getPeso());
    }
}
