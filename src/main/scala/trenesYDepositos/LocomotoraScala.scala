package trenesYDepositos

/**
  * @author Clara Allende <callende@despegar.com>
  * @since Nov-2019
  */
case class LocomotoraScala(peso: Double = 0.0,
                           pesoMaximoArrastre: Double = 0.0,
                           velocidadMaxima: Double = 0.0) {

  def arrastreUtil =  (pesoMaximoArrastre - peso).max(0.0)

  def esEficiente = pesoMaximoArrastre >= peso * 5

}
