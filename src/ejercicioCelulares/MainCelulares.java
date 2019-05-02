package ejercicioCelulares;

public class MainCelulares {
    public static void main(String[] args) {
        /**
         *   Parte 1: Celulares y gasto de batería
         */
        // Creamos los objetos que vamos a usar
        Iphone celIphone = new Iphone();
        Samsung celSamsung = new Samsung();
        Persona juliana = new Persona();
        Persona catalina = new Persona();

        // Relacionamos a las personas con sus respectivos ejercicioCelulares
        juliana.setCelular(celSamsung);
        catalina.setCelular(celIphone);

        // Recargamos los ejercicioCelulares para asegurarnos de que puedan usarlos
        juliana.getCelular().recargarBateria();
        catalina.getCelular().recargarBateria();

        // Nos aseguramos de que ambas personas tengan el celular prendido
        // y, de ser así, imprimimos por consola la cantidad de puntos de batería
        // de cada una (deberia ser 5 porque acabamos de cargarlos)
        if (juliana.celularApagado()) {
            System.out.println("Juliana tiene el celular apagado :(");
        } else {
            System.out.println("Juliana tiene batería!! Cantidad de puntos: "+
                                    juliana.getCelular().getBateria());
        }

        if (catalina.celularApagado()) {
            System.out.println("Juliana tiene el celular apagado :(");
        } else {
            System.out.println("Juliana tiene batería!! Cantidad de puntos: "+
                    catalina.getCelular().getBateria());
        }

        /**
         *   Parte 2: Compañías telefónicas
         */
        // Creamos los objetos que faltan
        Movistar movistar = new Movistar();
        Personal personal = new Personal();

        // Relacionamos a las personas con sus respectivas compañías telefónicas
        catalina.setServicioTelefonia(movistar);
        juliana.setServicioTelefonia(personal);

        // Nos aseguramos de que los gastos de ambas sea 0
        // porque así lo seteamos por default en la clase.
        // (Otra manera es crear el setter de gasto en la clase y asignarle el valor inicial desde acá)
        System.out.println("El gasto inicial de Juliana es: " + juliana.getGasto());
        System.out.println("El gasto inicial de Catalina es: " + catalina.getGasto());

        /**
         *   Y ahora si!! Probamos a hacer llamadas y ver que lo que hicimos funcione :)
         *
         */
        // Hacemos la primera llamada de juliana a catalina de 5 minutos:
        System.out.println("*** Primera llamada ***");
        juliana.llamarA(catalina, 5.0);

        // Comprobamos que a ambas se les haya descargado un poco la batería
        // y que el gasto de Juliana (que fue la que llamó) sea mayor a cero.
        System.out.println("Batería del celular de Juliana: " + juliana.getCelular().getBateria());
        System.out.println("Batería del celular de Catalina: " + catalina.getCelular().getBateria());
        System.out.println("Gasto de Juliana: " + juliana.getGasto());
        System.out.println("Gasto de Catalina: " + catalina.getGasto());

        // Seguimos probando, checkeando que ambos ejercicioCelulares
        // estén prendidos antes de hacer una llamada
        System.out.println("*** Segunda llamada ***");
        if (!juliana.celularApagado() && !catalina.celularApagado()) {
            catalina.llamarA(juliana, 15.0);
        } else {
            System.out.println("Uno de los dos ejercicioCelulares está apagado y la llamada no puede realizarse.");
        }
        System.out.println("Batería del celular de Juliana: " + juliana.getCelular().getBateria());
        System.out.println("Batería del celular de Catalina: " + catalina.getCelular().getBateria());
        System.out.println("Gasto de Juliana: " + juliana.getGasto());
        System.out.println("Gasto de Catalina: " + catalina.getGasto());

        System.out.println("*** Tercera llamada ***");
        if (!juliana.celularApagado() && !catalina.celularApagado()) {
            catalina.llamarA(juliana, 32.0);
        } else {
            System.out.println("Uno de los dos ejercicioCelulares está apagado y la llamada no puede realizarse.");
        }
        System.out.println("Batería del celular de Juliana: " + juliana.getCelular().getBateria());
        System.out.println("Batería del celular de Catalina: " + catalina.getCelular().getBateria());
        System.out.println("Gasto de Juliana: " + juliana.getGasto());
        System.out.println("Gasto de Catalina: " + catalina.getGasto());

        System.out.println("*** Cuarta llamada ***");
        if (!juliana.celularApagado() && !catalina.celularApagado()) {
            catalina.llamarA(juliana, 8.0);
        } else {
            System.out.println("Uno de los dos ejercicioCelulares está apagado y la llamada no puede realizarse.");
        }
        System.out.println("Batería del celular de Juliana: " + juliana.getCelular().getBateria());
        System.out.println("Batería del celular de Catalina: " + catalina.getCelular().getBateria());
        System.out.println("Gasto de Juliana: " + juliana.getGasto());
        System.out.println("Gasto de Catalina: " + catalina.getGasto());
    }
}
