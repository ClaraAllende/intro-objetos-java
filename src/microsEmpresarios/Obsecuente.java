package microsEmpresarios;

public class Obsecuente implements Persona {
    private Persona jefe;

    public Boolean aceptaSubir(Micro micro) {
        return this.getJefe().aceptaSubir(micro);
    }

    public Persona getJefe() {
        return jefe;
    }

    public void setJefe(Persona jefe) {
        this.jefe = jefe;
    }
}
