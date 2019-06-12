package main.electrodomesticos;

public class MainElectrodomesticos {
    public static void main(String[] args) {
        Electrodomestico listaElectrodomesticos[]=new Electrodomestico[10];

        //Asignamos cada una de las posiciones como queramos
        listaElectrodomesticos[0]=new Lavadora(150, 30);
        listaElectrodomesticos[1]=new Television(500, "negro", 'E', 80, 42, false);
        listaElectrodomesticos[2]=new Lavadora(300, "blanco", 'Z', 40, 40);
        listaElectrodomesticos[3]=new Television(250, 70);
        listaElectrodomesticos[4]=new Lavadora(400, "verde", 'A', 100, 15);
        listaElectrodomesticos[5]=new Television(200, "amarillo", 'C', 60, 30, true);
        listaElectrodomesticos[6]=new Lavadora();
        listaElectrodomesticos[7]=new Television();
        listaElectrodomesticos[8]=new Television(200, "gris", 'F', 20, 30, true);
        listaElectrodomesticos[9]=new Lavadora(400, "azul", 'G', 100, 10);

        for (Electrodomestico electrodomestico :
                listaElectrodomesticos) {
            System.out.println("Precio final de electrodoméstico: "+electrodomestico.precioFinal());
        }
    }
}
