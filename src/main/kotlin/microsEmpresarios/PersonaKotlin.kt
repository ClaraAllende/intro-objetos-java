package main.kotlin.microsEmpresarios

interface PersonaKotlin {
    fun puedeSubir(micro: MicroKotlin): Boolean
}

class ApuradoKotlin : PersonaKotlin {
    override fun puedeSubir(micro: MicroKotlin) = true
}

class ClaustrofobicoKotlin : PersonaKotlin {
    override fun puedeSubir(micro: MicroKotlin) = micro.volumen > 120
}

class FiacaKotlin : PersonaKotlin {
    override fun puedeSubir(micro: MicroKotlin) = micro.hayLugarSentado()
}

class ModeradoKotlin(val n: Int) : PersonaKotlin {
    override fun puedeSubir(micro: MicroKotlin) = micro.hayXLugaresLibres(n)
}

class ObsecuenteKotlin(val jefe: PersonaKotlin) : PersonaKotlin {
    override fun puedeSubir(micro: MicroKotlin): Boolean = jefe.puedeSubir(micro)
}