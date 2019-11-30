package microsEmpresarios

case class ModeradoScala(n: Int) extends PersonaScala {
  def puedeSubir(micro: MicroScala) = micro.hayXLugaresLibres(n)
}
