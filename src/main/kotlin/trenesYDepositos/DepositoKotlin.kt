package main.kotlin.trenesYDepositos

import trenesYDepositos.excepciones.ParametrosIncorrectosException

class DepositoKotlin(
        val formaciones: List<FormacionKotlin> = emptyList(),
        var locomotorasSueltas: MutableList<LocomotoraKotlin> = mutableListOf()
) {
    fun vagonMasPesadoPorFormacion() = formaciones.map{ it.vagonMasPesado()}

    fun necesitaConductorExperimentado() = formaciones.any { it.esCompleja() }

    fun agregarLocomotora(formacion: FormacionKotlin) =
            formaciones.takeIf { it.contains(formacion) }
                    ?.let {
                        if (!formacion.puedeMoverse())
                            locomotorasSueltas.firstOrNull{ it.arrastreUtil() >= formacion.empujeFaltanteParaMoverse()}
                                    ?.let {
                                        formacion.agregarLocomotora(it)
                                        locomotorasSueltas.remove(it)
                                    }

                    }
                    ?: throw ParametrosIncorrectosException("La formación no pertenece al depósiro")
}