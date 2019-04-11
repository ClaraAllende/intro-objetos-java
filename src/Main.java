import otrosAnimales.Golondrina;

/**
 * Programa principal - Workspace
 * Clase 06.Introducción a objetos
 */
public class Main {

    public static void main(String[] args) {

        Elefante dumbo = new Elefante();

        Golondrina pepita = new Golondrina();

        System.out.println(dumbo.getPeso());

        dumbo.setPeso(150);

        System.out.println(dumbo.getPeso());

        pepita.getVelocidad();

        System.out.println(pepita.getVelocidad());


        /*********** Nuevos mensajes! *************/

        dumbo.barritar();

        dumbo.correr(20);

        System.out.println(dumbo.getPeso());

    }
}
