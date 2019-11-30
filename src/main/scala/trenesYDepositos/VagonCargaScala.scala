package trenesYDepositos

case class VagonCargaScala(cargaMaxima: Double = 0.0) extends VagonScala {

  def pesoMaximo = cargaMaxima + 160

}
