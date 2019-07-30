package microsEmpresarios;


public class Claustrofobico implements Persona {

    public Boolean aceptaSubir(Micro micro) {
        return micro.getVolumen() > 120;
    }
}
