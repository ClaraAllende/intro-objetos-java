package main.kotlin.trenesYDepositos

class FormacionKotlin(
    val locomotoras: MutableList<LocomotoraKotlin> = mutableListOf(),
    var vagones: List<VagonKotlin> = emptyList()
) {
    fun cantidadMaximaPAsajeros() =
            vagones.map { it.cantidadMaximaPasajeros() }.sum()

    fun cantidadVagonesLivianos() = vagones.count { it.esLiviano() }

    fun velocidadMaxima() = locomotoras.minBy{ it.velocidadMaxima }
        ?.velocidadMaxima
            ?: throw  RuntimeException()

    fun esEficiente() = locomotoras.all { it.esEficiente() }

    fun puedeMoverse() = arrastreUtilTotal() >= pesoMaximoVagones()

    fun arrastreUtilTotal() = locomotoras.map{ it.arrastreUtil() }.sum()

    fun pesoMaximoVagones() = vagones.map { it.pesoMaximo() }.sum()

    fun empujeFaltanteParaMoverse() =
            if (puedeMoverse()) 0.0 else pesoMaximoVagones() - arrastreUtilTotal()

    fun vagonMasPesado() = vagones.maxBy { it.pesoMaximo() }

    fun esCompleja() = cantidadUnidades() > 20 || pesoTotal() > 10000

    fun cantidadUnidades() = locomotoras.size + vagones.size

    fun pesoLocomotoras() = locomotoras.map{ it.peso}.sum()

    fun pesoTotal() = pesoLocomotoras() + pesoMaximoVagones()

    fun agregarLocomotora(locomotora : LocomotoraKotlin) {
        locomotoras.add(locomotora)
    }

}