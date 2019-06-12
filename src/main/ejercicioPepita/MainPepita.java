package main.ejercicioPepita;

public class MainPepita {
    public static void main(String[] args){

        Lugar bsas = new Lugar();
        bsas.setNombre("Buenos Aires");
        Lugar rosario = new Lugar();
        bsas.setNombre("Rosario");
        Golondrina pepita = new Golondrina();
        pepita.setUbicacion(bsas);
        pepita.volar(20);
        pepita.comer(500);
        System.out.println(pepita.getUbicacion().getNombre());

        bsas.setKilometroEnRuta(0);
        rosario.setKilometroEnRuta(370);
        // Pendientes:
        pepita.andaA(rosario);
        // pepita.podesIrA(mdp);
    }
}
