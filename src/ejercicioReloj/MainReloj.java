package ejercicioReloj;

public class MainReloj {
    public static void main(String[] args) {
        Reloj miReloj = new Reloj();

        miReloj.setHora(10);
        miReloj.setMinutos(30);
        miReloj.setSegundos(25);

        System.out.println(miReloj.horarioActual());
    }
}
