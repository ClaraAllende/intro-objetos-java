package main.kotlin.microsEmpresarios

import microsEmpresarios.NoSePudoSubirPasajeroException

class MicroKotlin(
    var cantidadSentados: Int = 0,
    var cantidadParados: Int = 0,
    val volumen: Int = 0
) {
    val pasajeros: MutableList<PersonaKotlin> = mutableListOf()

    fun puedeSubir(persona: PersonaKotlin) = hayLugar() && persona.puedeSubir(this)

    fun subirSiPodesA(persona: PersonaKotlin) {
        pasajeros.takeIf { puedeSubir(persona) }
            ?.add(persona)
                ?: throw NoSePudoSubirPasajeroException("El pax no se puede subir")
    }

    fun bajarA(persona: PersonaKotlin) {
        pasajeros.takeIf { pasajeros.contains(persona) }
            ?.remove(persona)
                ?: throw RuntimeException("No hay nadie en el micro para bajar")
    }

    fun quienSubioPrimero() =
        pasajeros.firstOrNull()?: throw RuntimeException("No hay nadie en el micro para bajar")

    fun hayLugar() = cantidadPersonas() < capacidadTotal()

    fun hayLugarSentado() = cantidadPersonas() < cantidadSentados

    fun hayXLugaresLibres(x: Int) = lugaresLibres() >= x

    fun lugaresLibres() = capacidadTotal() - cantidadPersonas()

    fun capacidadTotal() = cantidadSentados + cantidadParados

    fun cantidadPersonas() = pasajeros.size
}