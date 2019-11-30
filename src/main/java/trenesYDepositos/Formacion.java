package trenesYDepositos;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Formacion {
    private List<Locomotora> locomotoras = new ArrayList<>();
    private List<Vagon> vagones = new ArrayList<>();

    /************
     *  PUNTO 1
     ************/
    public Integer cantidadMaximaPasajeros() {
        return vagones.stream().mapToInt(Vagon::cantidadMaximaPasajeros).sum();
    }

    /************
     *  PUNTO 2
     ************/
    public Integer cantidadVagonesLivianos() {
        // Filtramos los vagones livianos y contamos cuántos quedaron en total
        return (int) vagones.stream().filter(Vagon::esLiviano).count();
        // Usamos (int) para transformar el resultado de count a un int.
        // Puede  hacerse de esta manera porque long es basicamente lo mismo,
        // pero permite tener una mayor cantidad de dígitos.
        // Podríams tranquilamente no poner (int) y hacer que el método devuelva Long
    }

    /************
     *  PUNTO 3
     ************/
    public Double velocidadMaxima() {
        return locomotoras.stream()
                .min(Comparator.comparing(Locomotora::getVelocidadMaxima))
                .get().getVelocidadMaxima();
    }

    /************
     *  PUNTO 4
     ************/
    public Boolean esEficiente() {
        return locomotoras.stream().allMatch(Locomotora::esEficiente);
    }

    /************
     *  PUNTO 5
     ************/
    public Boolean puedeMoverse() {
        return arrastreUtilTotal() >= pesoMaximoVagones();
    }

    public Double arrastreUtilTotal() {
        return locomotoras.stream()
                .mapToDouble(Locomotora::arrastreUtil)
                .sum();
    }

    public Double pesoMaximoVagones() {
        return vagones.stream()
                .mapToDouble(Vagon::pesoMaximo)
                .sum();
    }

    /************
     *  PUNTO 6
     ************/
    public Double empujeFaltanteParaMoverse() {
        return puedeMoverse() ? 0 : pesoMaximoVagones() - arrastreUtilTotal();
    }

    /************
     *  PUNTO 7
     ************/
    public Vagon vagonMasPesado() {
        return vagones.stream().max(Comparator.comparing(Vagon::pesoMaximo)).get();
    }

    /************
     *  PUNTO 8
     ************/
    public Boolean esCompleja() {
        return cantidadUnidades() > 20 || pesoTotal() > 10000;
    }

    public Integer cantidadUnidades() {
        return locomotoras.size() + vagones.size();
    }

    public Double pesoLocomotoras() {
        return locomotoras.stream()
                .mapToDouble(Locomotora::getPeso)
                .sum();
    }

    public Double pesoTotal() {
        return pesoLocomotoras() + pesoMaximoVagones();
    }

    /************
     *  PUNTO 9
     ************/
    public void agregarLocomotora(Locomotora locomotora) {
        locomotoras.add(locomotora);
    }

    /**********************
     *  Getters y setters
     **********************/
    public List<Locomotora> getLocomotoras() {
        return locomotoras;
    }

    public void setLocomotoras(List<Locomotora> locomotoras) {
        this.locomotoras = locomotoras;
    }

    public List<Vagon> getVagones() {
        return vagones;
    }

    public void setVagones(List<Vagon> vagones) {
        this.vagones = vagones;
    }
}
