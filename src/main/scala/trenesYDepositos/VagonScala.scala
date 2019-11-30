package trenesYDepositos

trait VagonScala {

  def cantidadMaximaPasajeros : Int = 0

  def pesoMaximo: Double

  def esLiviano: Boolean = pesoMaximo < 2500
}
