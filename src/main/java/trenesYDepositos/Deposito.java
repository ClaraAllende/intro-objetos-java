package trenesYDepositos;

import trenesYDepositos.excepciones.ParametrosIncorrectosException;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Deposito {
    private List<Formacion> formaciones = new ArrayList<>();
    private List<Locomotora> locomotorasSueltas = new ArrayList<>();

    /************
     *  PUNTO 7
     ************/
    public List<Vagon> vagonMasPesadoPorFormacion() {
        return formaciones.stream()
                .map(Formacion::vagonMasPesado)
                .collect(Collectors.toList());
    }

    /************
     *  PUNTO 8
     ************/
    public Boolean necesitaConductorExperimentado() {
        return formaciones.stream().anyMatch(Formacion::esCompleja);
    }

    /************
     *  PUNTO 9
     ************/
    public void agregarLocomotora(Formacion formacion) {
        // EXTRA: Podríamos chequear que la formación que se pasa como parámetro
        // pertenezca a este deposito.
        if (!formaciones.contains(formacion)) {
            throw new ParametrosIncorrectosException(
                    "Error agregando locomotora a formación: " +
                            "la formación no pertenece al depósito.");
        }

        if (!formacion.puedeMoverse()) {
            Double empujeFaltante = formacion.empujeFaltanteParaMoverse();
            locomotorasSueltas.stream()
                    .filter(locomotora -> locomotora.arrastreUtil() >= empujeFaltante)
                    .findFirst()
                    .ifPresent(locomotora -> {
                        formacion.agregarLocomotora(locomotora);
                        locomotorasSueltas.remove(locomotora);
                    });
            // ifPresent ejecuta la acción que le pasemos por paréntesis
            // SOLO si el stream u optional al que le mandamos este mensaje
            // (en este caso el resultado de findFirst) NO es vacío.
            // En otras palabras, formacion.agregarLocomotora(locomotora)
            // se va a ejecutar SI y SOLO SI existe al menos una locomotora que cumpla
            // las condiciones para ser agregada a esta formación particular
        }
    }

    /**********************
     *  Getters y setters
     **********************/
    public List<Formacion> getFormaciones() {
        return formaciones;
    }

    public void setFormaciones(List<Formacion> formaciones) {
        this.formaciones = formaciones;
    }

    public List<Locomotora> getLocomotorasSueltas() {
        return locomotorasSueltas;
    }

    public void setLocomotorasSueltas(List<Locomotora> locomotorasSueltas) {
        this.locomotorasSueltas = locomotorasSueltas;
    }
}
