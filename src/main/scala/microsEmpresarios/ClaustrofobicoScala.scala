package microsEmpresarios

class ClaustrofobicoScala extends PersonaScala {
  def puedeSubir(micro: MicroScala) = micro.volumen > 120;
}
