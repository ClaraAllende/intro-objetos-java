package microsEmpresarios;

public class NoSePudoSubirPasajeroException extends RuntimeException {

    public NoSePudoSubirPasajeroException(String msg) {
        super(msg);
    }

    public NoSePudoSubirPasajeroException(String msg, Throwable t) {
        super(msg, t);
    }
}
