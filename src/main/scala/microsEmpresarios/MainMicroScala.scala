package microsEmpresarios

import scala.util.Try

object MainMicroScala {

  def main(args: Array[String]): Unit = {
    val elRapido = MicroScala(20, 20, 200)
    val chevallier = MicroScala(20, 30, 100)

    val jonasa = new ClaustrofobicoScala

    System.out.println(elRapido.puedeSubir(jonasa))
    System.out.println(chevallier.puedeSubir(jonasa))

    Try(chevallier.subirSiPodesA(jonasa)).getOrElse {
      System.out.println("No se pudo subir al pasajero!")
      elRapido.subirSiPodesA(jonasa)
    }

    System.out.println(elRapido.quienSubioPrimero)
    System.out.println(chevallier.quienSubioPrimero)
  }

}
