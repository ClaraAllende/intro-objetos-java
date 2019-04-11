public class Elefante implements Corredor {
    private Integer peso;

    public void setPeso(Integer kilos) {

        peso = kilos;
    }

    public Integer getPeso() {

        return peso;
    }

    public void barritar() {
        System.out.println("prrrr");
    }

    public void correr(Integer kilometros) {
        peso = peso - kilometros;
    }

}
