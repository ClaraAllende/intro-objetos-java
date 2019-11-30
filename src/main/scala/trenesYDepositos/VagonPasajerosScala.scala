package trenesYDepositos

case class VagonPasajerosScala(largo: Double = 0.0,
                               anchoUtil: Double = 0.0) extends VagonScala {

  override def cantidadMaximaPasajeros = if (anchoUtil <= 2.5) largo.intValue * 8 else largo.intValue * 10

  def pesoMaximo = cantidadMaximaPasajeros * 80

}
