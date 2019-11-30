package microsEmpresarios

case class MicroScala(cantidadSentados: Int = 0,
                 cantidadParados: Int = 0,
                 volumen: Int = 0) {

  var pasajeros: Seq[PersonaScala] = List.empty

  def puedeSubir(persona: PersonaScala) : Boolean = this.hayLugar && persona.puedeSubir(this)

  def subirSiPodesA(persona: PersonaScala) = if (!this.puedeSubir(persona)) throw new NoSePudoSubirPasajeroException("El pax no se puede subir") else
    pasajeros = pasajeros.+:(persona)

  def bajarA(persona: PersonaScala) = pasajeros = pasajeros.filterNot(pax => pax != persona)

  def quienSubioPrimero = pasajeros.headOption.orNull

  def hayLugar = cantidadPersonas < capacidadTotal

  def hayLugarSentado = cantidadPersonas < cantidadSentados

  def hayXLugaresLibres(x: Int) = lugaresLibres >= x

  def lugaresLibres = capacidadTotal - cantidadPersonas

  def capacidadTotal = cantidadSentados + cantidadParados

  def cantidadPersonas = pasajeros.size
}
