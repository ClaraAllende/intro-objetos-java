public class App {
    public static void main(String[] args) {

        Golondrina pepita = new Golondrina();

        Lugar bsAs = new Lugar();

        Lugar rosario = new Lugar();

        Lugar cordoba = new Lugar();

        bsAs.setNombre("Buenos Aires");

        bsAs.setKilometroEnRuta9(0);

        rosario.setNombre("Rosario");

        rosario.setKilometroEnRuta9(253);

        cordoba.setNombre("Córdoba");

        cordoba.setKilometroEnRuta9(702);

        pepita.setUbicacion(bsAs);

        pepita.andaA(rosario);

        pepita.podesIrA(cordoba);

    }
}
