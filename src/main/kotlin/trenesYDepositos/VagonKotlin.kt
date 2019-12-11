package main.kotlin.trenesYDepositos

interface VagonKotlin {
    fun cantidadMaximaPasajeros() = 0

    fun pesoMaximo() : Double

    fun esLiviano() = pesoMaximo() < 2500
}

class VagonCargaKotlin(val cargaMaxima: Double = 0.0) : VagonKotlin {
    override fun pesoMaximo() = cargaMaxima + 160
}

class VagonPasajerosKotlin(
    val largo: Double = 0.0,
    val anchoUtil: Double = 0.0
) : VagonKotlin {
    override fun cantidadMaximaPasajeros() =
            if (anchoUtil <= 2.5) largo.toInt() * 8 else largo.toInt() * 10

    override fun pesoMaximo() = cantidadMaximaPasajeros().toDouble() * 80
}