package microsEmpresarios

case class ObsecuenteScala(jefe: PersonaScala) extends PersonaScala {

   def puedeSubir(micro: MicroScala): Boolean = jefe.puedeSubir(micro)

}
