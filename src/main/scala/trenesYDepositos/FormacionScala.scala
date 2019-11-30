package trenesYDepositos

case class FormacionScala(var locomotoras: List[LocomotoraScala] = List.empty,
                          vagones: List[VagonScala] = List.empty) {

  def cantidadMaximaPAsajeros = vagones.map(_.cantidadMaximaPasajeros).sum

  def cantidadVagonesLivianos = vagones.count(_.esLiviano)

  //Tira excepción si la colección está vacía.
  //Dos opciones: usar Try (o try/catch), o minByOption
  //Anyway, ¿que valor sería el "default" si no hay locomotoras? 0?
  def velocidadMaxima = locomotoras.minBy(_.velocidadMaxima).velocidadMaxima

  def esEficiente = locomotoras.forall(_.esEficiente)

  def puedeMoverse = arrastreUtilTotal >= pesoMaximoVagones

  def arrastreUtilTotal = locomotoras.map(_.arrastreUtil).sum

  def pesoMaximoVagones = vagones.map(_.pesoMaximo).sum

  def empujeFaltanteParaMoverse = if (puedeMoverse) 0 else pesoMaximoVagones - arrastreUtilTotal

  def vagonMasPesado = vagones.maxBy(_.pesoMaximo)

  def esCompleja = cantidadUnidades > 20 || pesoTotal > 10000

  def cantidadUnidades = locomotoras.size + vagones.size

  def pesoLocomotoras = locomotoras.map(_.peso).sum

  def pesoTotal = pesoLocomotoras + pesoMaximoVagones

  def agregarLocomotora(l : LocomotoraScala) = locomotoras = locomotoras.+:(l)

}
