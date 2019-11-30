package trenesYDepositos

case class DepositoScala(formaciones: List[FormacionScala] = List.empty,
                         var locomotorasSueltas: List[LocomotoraScala] = List.empty) {

  def vagonMasPesadoPorFormacion = formaciones.map(_.vagonMasPesado)

  def necesitaConductorExperimentado = formaciones.exists(_.esCompleja)

  //foreach, map, y otras operaciones sobre Option ejecutan los bloques solo si el Option es un Some(_)
  //si es un None, devuelven None
  def agregarLocomotora(formacion: FormacionScala) =
    formaciones.find(f => f == formacion).foreach {
      ff =>
        val empujeFaltante = formacion.empujeFaltanteParaMoverse

        locomotorasSueltas.find(_.arrastreUtil >= empujeFaltante)
          .foreach { l =>
            formacion.agregarLocomotora(l)
            locomotorasSueltas = locomotorasSueltas.filterNot(_ == l)
          }
    }

}
