package microsEmpresarios;

public class Main {

    public static void main(String[] args) {
        //El constructor del Micro es (cantParados,
        //cantSentados, volumen)

        Micro elrapido = new Micro(20, 20, 200);
        Claustrofobico jonasa = new Claustrofobico();

        elrapido.sePuedeSubir(jonasa);
    //    elrapido.podeSubirA(jonasa);

    }
}
