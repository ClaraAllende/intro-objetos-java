package microsEmpresarios;


public class Fiaca implements Persona {

    public Boolean aceptaSubir(Micro micro) {
        return micro.tenesLugarSentado();
    }
}
