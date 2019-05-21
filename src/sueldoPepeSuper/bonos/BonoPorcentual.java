package sueldoPepeSuper.bonos;

public class BonoPorcentual implements BonoResultados {
    public Double monto(Integer sueldoNeto)  { return sueldoNeto * 0.1;}
}
