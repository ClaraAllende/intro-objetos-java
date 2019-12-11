package main.kotlin.trenesYDepositos

class LocomotoraKotlin(
    val peso: Double = 0.0,
    val pesoMaximoArrastre: Double = 0.0,
    val velocidadMaxima: Double = 0.0
) {
    fun arrastreUtil() =  if (pesoMaximoArrastre>peso) pesoMaximoArrastre - peso else 0.0

    fun esEficiente() = pesoMaximoArrastre >= peso * 5
}