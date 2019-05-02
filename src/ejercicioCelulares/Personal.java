package ejercicioCelulares;

public class Personal implements ServicioTelefonia {

    public Double precioLlamada(Double minutosDuracion) {
        //Hay muchiiiisimas maneras diferentes de resolverlo. Acá va una:
        if (minutosDuracion<=10) {
            return 0.7;
        } else {
            return 0.7 + (minutosDuracion-10)*0.4;
        }
    }
}