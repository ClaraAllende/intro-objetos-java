package microsEmpresarios;

public class Main {

    public static void main(String[] args) {
        //El constructor del Micro es (cantParados, cantSentados, volumen)
        Micro elrapido = new Micro(20, 20, 200);
        Micro chevallier = new Micro(20, 30, 100);

        Claustrofobico jonasa = new Claustrofobico();

        elrapido.sePuedeSubir(jonasa);
        chevallier.sePuedeSubir(jonasa);

        //jonasa no se puede subir al chevallier...
        try {
            chevallier.subiSiPodesA(jonasa);
        } catch (NoSePudoSubirPasajeroException exception) {
            System.out.println("No se pudo subir al pasajero, vamos a probar otro micro!");
            //pero por ejemplo, podríamos tratar de que se suba al otro micro!
            elrapido.subiSiPodesA(jonasa);
        }

        //Si no hay gente en el micro, no puedo bajar a alguien!
        //Si descomentan la siguiente linea, tira error y el programa termina acá (no ejecuta las últimas dos líneas)
        //chevallier.bajaA(jonasa);

        System.out.println(elrapido.quienSubioPrimero());
        System.out.println(chevallier.quienSubioPrimero());
    }
}
